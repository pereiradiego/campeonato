package br.zg.trainning

import br.zg.trainning.interf.CalculaPontuacao
import br.zg.trainning.Campeonato
import br.zg.trainning.Time

class CalculaPontuacao2015Service implements CalculaPontuacao{

    def serviceMethod() {

    }
    private final int PONTOS_POR_VITORIA = 3
    private final int PONTOS_POR_EMPATE = 1

    int calculaPontuacaoTime(Time time) {
        int pontuacaoFinal = 0
        pontuacaoFinal += calculaPontuacaoVitoria(time.quantVitoria)
        pontuacaoFinal += calculaPontuacaoEmpates(time.quantEmpate)
        return pontuacaoFinal
    }

    int calculaPontuacaoVitoria(int quantidadeVitorias) {
        quantidadeVitorias * PONTOS_POR_VITORIA
    }

    int calculaPontuacaoEmpates(int quantidadeEmpates) {
        quantidadeEmpates * PONTOS_POR_EMPATE
    }
}
