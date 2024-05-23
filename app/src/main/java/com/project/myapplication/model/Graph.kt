package com.project.myapplication

import com.project.myapplication.Station
import java.io.File

class Graph(fileGraph : String,fileLigne : String){
    private var mapStation : HashMap<String,Station> = HashMap<String,Station>()
    init{
       initGraph(fileGraph)
       //initLigne(fileLigne) Finir
    }
    fun initGraph(filename:String){
        var listLines = File(filename).bufferedReader().readLines()
        listLines.forEach{str -> mapStation.put(str,Station(str))}
    }
    /*fun initLigne(fileLigne:String){
        var listLignes = File(fileLigne).bufferedReader().readLines()
        listLignes.forEach{str -> var split = str.split(";")

    }*/

    fun keyValues():Set<String>{
        return mapStation.keys
    }

}