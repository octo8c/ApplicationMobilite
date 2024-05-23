package com.project.myapplication

class StationAutomate(val graph:Graph){
    private var start :Automate=Automate(true)
    init{
        createStationAutomate(graph.keyValues())
    }

    private fun createStationAutomate(stationNames:Set<String>):Unit{
        stationNames.forEach{str -> createAutomate(start,str,0)}
    }

    private fun createAutomate(auto:Automate,str:String,indStart:Int){
        var char =str.get(indStart)
        var final = indStart+1==str.length
        var autoTransition = auto.getAutomateTransition(char)
        if(autoTransition==null){
            var automate = Automate(final)
            auto.addTransition(char, automate)
            if(!final){
                createAutomate(automate, str, indStart+1)
            }
        }else{
            if(!final){
                createAutomate(autoTransition, str, indStart+1)
            }
        }

    }
    private fun isInGraph(str:String,ind:Int):Boolean {

    }
    fun isStation(str:String):Boolean = isInGraph(str, 0)

}