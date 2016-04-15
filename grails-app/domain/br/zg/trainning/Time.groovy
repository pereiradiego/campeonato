package br.zg.trainning

class Time {

    String nomeTime
    int quantVitoria
    int quantEmpate
    int quantDerrota
    int quantGolPro
    int quantGolContra

    static belongsTo = [campeonato: Campeonato]

    static constraints = {
    }
}
