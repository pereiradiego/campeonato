package campeonato

import br.zg.trainning.Campeonato
import br.zg.trainning.Time
import br.zg.trainning.TimeController

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
import grails.test.mixin.*
@TestFor(TimeController)
@Mock(Time)
class TimeControllerTests {
    void testSaveInvalidTime() {
        controller.save()

        assert model.timeInstance != null
        assert view == '/time/create'
    }

    void testSaveValidTime() {
	    Campeonato campeonato = new Campeonato(id: 1, nomeCampeonato: "Campeonato BR", quantRodadas: 38)

	    params.id = 1
	    params.nomeTime = "Coritiba"
	    params.quantVitoria = 20
	    params.quantEmpate = 10
	    params.quantDerrota =  8
	    params.quantGolPro = 40
	    params.quantGolContra = 32
	    params.campeonato = campeonato

	    controller.save()

        assert response.redirectedUrl == '/time/show/1'
        //assert flash.message != null
        assert Time.count() == 1
    }

    void testShowInvalidTime(){
        controller.save()
        controller.show(5)

        assert model.timeInstance != null
        assert response.redirectedUrl == '/time/list'
    }

    void testShowValidTime(){
	    Campeonato campeonato = new Campeonato(id: 1, nomeCampeonato: "Campeonato BR", quantRodadas: 38)

	    Time time = new Time(id: 1, nomeTime: "Coritiba", quantVitoria: 20, quantEmpate: 10, quantDerrota: 8,
			    quantGolPro: 40, quantGolContra: 32, campeonato: campeonato)

	    time.save()

        assert controller.show(1)
    }
}
