package br.zg.trainning.interf

import br.zg.trainning.Campeonato
import br.zg.trainning.Time

/**
 * Created by diegoalves on 13/04/16.
 */
interface Classificacao {

	List<Time> realizaClassificacao(Campeonato campeonato)

	List<Time> realizaDesempate(List<Time> timeList)

	Time obterCampeao(Campeonato campeonato)

	Time obterLanterna(Campeonato campeonato)

}
