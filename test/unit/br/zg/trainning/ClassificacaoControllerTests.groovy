package br.zg.trainning


import br.zg.trainning.Time as TimeInstance
import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ClassificacaoController)
@Mock([Campeonato, Time])
//@Mock(Classificacao2015Service)
class ClassificacaoControllerTests extends GroovyTestCase{

    Classificacao2015Service classificacao2015Service = new Classificacao2015Service()
    CalculaPontuacao2015Service calculaPontuacao2015Service = new CalculaPontuacao2015Service()
    Time timeInstance = new TimeInstance()

    void testeClassificacaoInvalid(){
        Campeonato campeonato = new Campeonato()
        controller.classificacao2015Service = classificacao2015Service
        controller.classificacao2015Service.calculaPontuacao2015Service = calculaPontuacao2015Service

	    shouldFail(Exception){
		    controller.classificacao()
	    }

       /* assert model != null
        assert response.redirectedUrl == "/classificacao/index"*/
    }

    void testClassificacaoValid(){
	    Campeonato camp = new Campeonato(id: 1, nomeCampeonato: "Campeonato Brasileiro 2015", quantRodadas: 38)

	    camp.save()

	    List<Time> times = []

	    times += new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
			    quantGolPro: 40, quantGolContra: 32, campeonato: camp)
	    times += new Time(id: 2, nomeTime: "Coritiba", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
			    quantGolPro: 38, quantGolContra: 24, campeonato: camp)

	    times += new Time(id: 3, nomeTime: "Portuguesa", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
			    quantGolPro: 43, quantGolContra: 35, campeonato: camp)

	    times.each {
		    it.save()
	    }

        params.campeonatoId = camp.id

        controller.classificacao2015Service = classificacao2015Service
        controller.classificacao2015Service.calculaPontuacao2015Service = calculaPontuacao2015Service

        assert controller.classificacao()
    }

	void testCampeaoInvalid(){
/*		Campeonato campeonato = new Campeonato()
		controller.classificacao2015Service = classificacao2015Service
		controller.classificacao2015Service.calculaPontuacao2015Service = calculaPontuacao2015Service
*/
		shouldFail(Exception){
			controller.campeao()
		}
/*
		assert model != null
		assert response.redirectedUrl == "/classificacao/index"*/
	}

	void testCampeaoValid(){
		Campeonato camp = new Campeonato(id: 1, nomeCampeonato: "Campeonato Brasileiro 2015", quantRodadas: 38)

		camp.save()

		List<Time> times = []

		times += new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
				quantGolPro: 40, quantGolContra: 32, campeonato: camp)
		times += new Time(id: 2, nomeTime: "Coritiba", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
				quantGolPro: 38, quantGolContra: 24, campeonato: camp)

		times += new Time(id: 3, nomeTime: "Portuguesa", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
				quantGolPro: 43, quantGolContra: 35, campeonato: camp)

		times.each {
			it.save()
		}

		params.campeonatoId = camp.id

		controller.classificacao2015Service = classificacao2015Service
		controller.classificacao2015Service.calculaPontuacao2015Service = calculaPontuacao2015Service

		controller.campeao()

		assert [view: "campeao", model: timeInstance]
	}

	void testLanternaInvalid(){
		Campeonato campeonato = new Campeonato()
		controller.classificacao2015Service = classificacao2015Service
		controller.classificacao2015Service.calculaPontuacao2015Service = calculaPontuacao2015Service

		shouldFail(Exception){
			controller.lanterna()
		}

		/*assert model != null
		assert response.redirectedUrl == "/classificacao/index"*/
	}
	void testLanternaValid(){
		Campeonato camp = new Campeonato(id: 1, nomeCampeonato: "Campeonato Brasileiro 2015", quantRodadas: 38)

		camp.save()

		List<Time> times = []

		times += new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
				quantGolPro: 40, quantGolContra: 32, campeonato: camp)
		times += new Time(id: 2, nomeTime: "Coritiba", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
				quantGolPro: 38, quantGolContra: 24, campeonato: camp)

		times += new Time(id: 3, nomeTime: "Portuguesa", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
				quantGolPro: 43, quantGolContra: 35, campeonato: camp)

		times.each {
			it.save()
		}

		params.campeonatoId = camp.id

		controller.classificacao2015Service = classificacao2015Service
		controller.classificacao2015Service.calculaPontuacao2015Service = calculaPontuacao2015Service

		controller.lanterna()

		assert [view: "lanterna", model: timeInstance]
	}
}
