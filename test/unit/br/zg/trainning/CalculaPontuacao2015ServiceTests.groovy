package br.zg.trainning

import grails.test.GrailsUnitTestCase
import grails.test.mixin.*
import org.apache.tools.ant.taskdefs.optional.extension.Specification
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(CalculaPontuacao2015Service)
class CalculaPontuacao2015ServiceTests{

    void testCalculaPontuacaoVitoria(){
        Time time = new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
                quantGolPro: 40, quantGolContra: 32)

        int pontos_vitoria = service.calculaPontuacaoVitoria(time.quantVitoria)

        assert pontos_vitoria == 51
    }
    void testCalculaPontuacaoEmpate(){
        Time time = new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
                quantGolPro: 40, quantGolContra: 32)

        int pontos_empate = service.calculaPontuacaoEmpates(time.quantEmpate)

        assert pontos_empate == 19
    }

    void testCalculaPontuacaoTime(){
        Time time = new Time(id: 1, nomeTime: "Figueirense", quantVitoria: 17, quantEmpate: 19, quantDerrota: 2,
                quantGolPro: 40, quantGolContra: 32)

        int pontos_time = service.calculaPontuacaoTime(time)

        assert pontos_time == 70
    }


}
