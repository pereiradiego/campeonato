package br.zg.trainning



import grails.test.mixin.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(Classificacao2015Service)
@Mock(CalculaPontuacao2015Service)
class Classificacao2015ServiceTests {

    void testDesempateValid() {
        Campeonato camp = new Campeonato(id: 1, nomeCampeonato: "Campeonato Brasileiro 2015", quantRodadas: 38)

        List<Time> times = []

        times += new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
                quantGolPro: 40, quantGolContra: 32, campeonato: camp)
        times += new Time(id: 2, nomeTime: "Coritiba", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
                quantGolPro: 38, quantGolContra: 24, campeonato: camp)

        times += new Time(id: 3, nomeTime: "Portuguesa", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
                quantGolPro: 43, quantGolContra: 35, campeonato: camp)

        times = service.realizaDesempate(times)

        assert times[2].nomeTime == "Coritiba"
        assert times[1].nomeTime == "Portuguesa"
        assert times[0].nomeTime == "Figueirense"
    }

    void testClassificacaoValid(){
        Campeonato camp = new Campeonato(id: 1, nomeCampeonato: "Campeonato Brasileiro 2015", quantRodadas: 38)

        List<Time> times = []

        times += new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
                quantGolPro: 40, quantGolContra: 32, campeonato: camp)
        times += new Time(id: 2, nomeTime: "Coritiba", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
                quantGolPro: 38, quantGolContra: 24, campeonato: camp)

        times += new Time(id: 3, nomeTime: "Portuguesa", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
                quantGolPro: 38, quantGolContra: 35, campeonato: camp)

        camp.timesParticipantes = times

        times = service.realizaClassificacao(camp)

        assert times[0].nomeTime == "Coritiba"
        assert times[1].nomeTime == "Portuguesa"
        assert times[2].nomeTime == "Figueirense"
    }

    void testCampeao(){
        Campeonato camp = new Campeonato(id: 1, nomeCampeonato: "Campeonato Brasileiro 2015", quantRodadas: 38)

        List<Time> times = []

        times += new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
                quantGolPro: 40, quantGolContra: 32, campeonato: camp)
        times += new Time(id: 2, nomeTime: "Coritiba", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
                quantGolPro: 38, quantGolContra: 24, campeonato: camp)

        times += new Time(id: 3, nomeTime: "Portuguesa", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
                quantGolPro: 38, quantGolContra: 35, campeonato: camp)

        camp.timesParticipantes = times

        Time timeCampeao = service.obterCampeao(camp)

        assert timeCampeao.nomeTime == "Coritiba"
    }

    void testLanterna(){
        Campeonato camp = new Campeonato(id: 1, nomeCampeonato: "Campeonato Brasileiro 2015", quantRodadas: 38)

        List<Time> times = []

        times += new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
                quantGolPro: 40, quantGolContra: 32, campeonato: camp)
        times += new Time(id: 2, nomeTime: "Coritiba", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
                quantGolPro: 38, quantGolContra: 24, campeonato: camp)
        times += new Time(id: 3, nomeTime: "Portuguesa", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
                quantGolPro: 38, quantGolContra: 35, campeonato: camp)

        camp.timesParticipantes = times

        Time timeLanterna = service.obterLanterna(camp)

        assert timeLanterna.nomeTime == "Figueirense"
    }
}
