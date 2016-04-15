package campeonato

import br.zg.trainning.Campeonato
import br.zg.trainning.CampeonatoController

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*
import grails.test.mixin.Mock

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
import grails.test.mixin.*
@TestFor(CampeonatoController)
@Mock(Campeonato)
class CampeonatoControllerTests {

    void testSaveInvalidCampeonato() {
        controller.save()

        assert model.campeonatoInstance != null
        assert view == '/campeonato/create'
    }

    void testSaveValidCampeonato() {
        params.id = 1
        params.nomeCampeonato = "Campeonato Brasileiro 2015"
        params.quantRodadas = 38

        controller.save()

        assert response.redirectedUrl == '/campeonato/show/1'
        //assert flash.message != null
        assert Campeonato.count() == 1
    }

    void testShowInvalidCampeonato(){
        controller.save()
        controller.show(2)

        assert model.campeonatoInstance != null
        assert response.redirectedUrl == '/campeonato/list'
    }

    void testShowValidCampeonato(){
        Campeonato camp = new Campeonato(id: 1, nomeCampeonato: "Campeonato Brasileiro 2015", quantRodadas: 38)
        camp.save()

        assert controller.show(1)
    }
}
