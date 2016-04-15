package br.zg.trainning


class ClassificacaoController {
    //static allowedMethods = [classificacao: "POST", campeao: "POST", lanterna: "POST"]

    def classificacao2015Service


    def index() {
        def campeonatoListInstance = Campeonato.list()
        [campeonatoInstance: new Campeonato(params), campeonatoListInstance: campeonatoListInstance]
    }

    def classificacao(){
        Campeonato campeonato = Campeonato.get(params.campeonatoId)

        if(!campeonato){
            redirect(action: 'index')
            return
        }

        def timesClassificacao = classificacao2015Service.realizaClassificacao(campeonato)

        [timeInstanceList: timesClassificacao]
    }

    def campeao(){
        Campeonato campeonato = Campeonato.get(params.campeonatoId)

        if(!campeonato){
            redirect(action: 'index')
            return
        }

        Time timeCampeao = classificacao2015Service.obterCampeao(campeonato)


        render (view: "campeao",model: [timeInstance: timeCampeao])
    }

    def lanterna(){
        Campeonato campeonato = Campeonato.get(params.campeonatoId)

        if(!campeonato){
            redirect(action: 'index')
            return
        }

        def timeLanterna = classificacao2015Service.obterCampeao(campeonato)

        if(!timeLanterna){
            render "erro"
        }

        [timeInstance: timeLanterna]
    }
}
