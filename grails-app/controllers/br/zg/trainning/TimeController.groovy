package br.zg.trainning

class TimeController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(){
        [timeListInstance: Time.list(params),timeInstanceTotal:Time.count()]
    }

    def create(){
        [timeInstance: new Time(params),campeonatoListInstance: Campeonato.list().sort{it.nomeCampeonato}]
    }

    def save(){
        def timeInstance = new Time(params)

        if (!timeInstance.save(flush: true)) {
            render(view: "create", model: [timeInstance: timeInstance])
            return
        }

        redirect(action: "show", id: timeInstance.id)
    }

    def show(Long id){
        def timeInstance = Time.get(id)

        if (!timeInstance) {
            redirect(action: "list")
            return
        }
        [timeInstance: timeInstance]
    }
}
