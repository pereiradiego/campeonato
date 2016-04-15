package br.zg.trainning

import br.zg.trainning.interf.Classificacao
import br.zg.trainning.Campeonato
import br.zg.trainning.Time


class Classificacao2015Service implements Classificacao {

    def calculaPontuacao2015Service

    List<Time> realizaDesempate(List<Time> times){
	    int saldoGolsTimeA, saldoGolsTimeB

	    times = times.sort { timeA, timeB ->
		    saldoGolsTimeA = timeA.quantGolPro - timeA.quantGolContra
		    saldoGolsTimeB = timeB.quantGolPro - timeB.quantGolContra

		    if (calculaPontuacao2015Service.calculaPontuacaoTime(timeA) != calculaPontuacao2015Service.calculaPontuacaoTime(timeB)) {
			    calculaPontuacao2015Service.calculaPontuacaoTime(timeA) <=> calculaPontuacao2015Service.calculaPontuacaoTime(timeB)
		    } else if (timeA.quantVitoria != timeB.quantVitoria) {
			    timeA.quantVitoria <=> timeB.quantVitoria
		    } else if (saldoGolsTimeA != saldoGolsTimeB) {
			    saldoGolsTimeA <=> saldoGolsTimeB
		    } else {
			    timeA.quantGolPro <=> timeB.quantGolPro
		    }
	    }
	    return times
    }

    List<Time> realizaClassificacao(Campeonato campeonato){

        List<Time> times = realizaDesempate(campeonato.timesParticipantes.collect())

        return  times.collect().reverse()
    }

    Time obterCampeao(Campeonato campeonato){
        Time timeCampeao = realizaClassificacao(campeonato).first()

        return timeCampeao
    }

    Time obterLanterna(Campeonato campeonato){
        Time timeLanterna = realizaClassificacao(campeonato).last()

        return timeLanterna
    }
}
