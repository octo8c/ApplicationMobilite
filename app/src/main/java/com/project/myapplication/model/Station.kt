package com.project.myapplication

class Station(val station : String) {
    private var nom_Station :String = ""
    private var listVoisin :ArrayList<Ligne> = ArrayList()
    private var f : Double = 0.0
    get()= field
    set(value){field=value}
    private var g : Double = 0.0
    set(value){field=value}
    get()= field
    private var h : Double = 0.0
    get() = field
    set(value){field=value}
    init{
        this.nom_Station = station
    }
    fun getStation(indice:Int):Ligne{
        return listVoisin.get(indice)
    }
    fun addStation(ligne :Ligne):Unit{
        listVoisin.add(ligne)
    }

}