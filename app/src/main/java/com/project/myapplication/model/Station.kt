package com.project.myapplication

class Station(
        val station: String,
        val numId: Int,
        val X: Double,
        val Y: Double,
        idConnection: String , 
        mode :Mode
) {
    private val ind_Station = numId
    private val coord_x: Double = X
    private val coord_y: Double = Y
    private val nom_Station: String = station
    private val listLigne: ArrayList<Pair<Int, String>> = ArrayList<Pair<Int, String>>()
    private val mode :Mode = mode
    init {
        listLigne.add(Pair<Int, String>(numId, idConnection)) 
        // Ajout de la ligne ainsi que de son id pour demander une connection
    }
    fun addLigne(indLigne: Int, idConnec: String) {
        listLigne.add(Pair<Int, String>(indLigne, idConnec))
    }
    fun isTram():Boolean{
        return this.mode==Mode.TRAMWAY
    }
    fun isMetro():Boolean{
        return this.mode==Mode.METRO
    }
    fun isRer():Boolean{
        return this.mode==Mode.RER
    }
}
