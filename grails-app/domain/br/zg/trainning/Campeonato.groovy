package br.zg.trainning

class Campeonato {

    String  nomeCampeonato
    int     quantRodadas

    static hasMany = [timesParticipantes: Time]

    static fetchMode = [timesParticipantes: 'eager']

    static constraints = {
    }
}
