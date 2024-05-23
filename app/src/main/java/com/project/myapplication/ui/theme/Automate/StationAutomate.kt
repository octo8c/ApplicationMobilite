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
    private fun isInGraph(str:String,ind:Int,auto:Automate):Boolean {
        if(ind+1==str.length){
            return auto.isFinal()
        }else{
            var autoTransition = auto.getAutomateTransition(str.get(ind))
            if(autoTransition==null){
                return false
            }else {
                return isInGraph(str, ind+1, autoTransition)
            }
        }
    }
    fun isStation(str:String):Boolean = if (str.equals("")) false else isInGraph(str, 0,start)

}