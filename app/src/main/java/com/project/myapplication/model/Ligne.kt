package com.project.myapplication

data class Ligne(val station1:Station, val station2:Station,val time:Double,val num:Int){
    constructor(list : List<String>,graph : Graph){
        this()
    }
    private val first : Station = station1
    get() = field
    private val second : Station  = station2
    get() = field
    private val timeBeetweenStation :Double  = time
    get() = field
    private var problem : Boolean  =false
    get()=field
    set(value){field=value} 
    private val numLigne : Int = num
    get() = field

}