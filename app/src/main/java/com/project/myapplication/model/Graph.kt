package com.project.myapplication

import com.project.myapplication.Station
import com.project.myapplication.StationAutomate
import com.project.myapplication.Automate
import java.io.File

class Graph(fileGraph : String,fileLigne : String){
    private var mapStation : HashMap<String,Station>
    private var automateStation : StationAutomate  
    init{
        mapStation = HashMap<String,Station>()
        initGraph(fileGraph)
        automateStation = StationAutomate(this)
    }
    fun initGraph(filename:String){
        var listLines = File(filename).bufferedReader().readLines()
        listLines.forEach{str -> mapStation.put(str,Station(str))}
    }

    fun keyValues():Set<String>{
        return mapStation.keys
    }

}