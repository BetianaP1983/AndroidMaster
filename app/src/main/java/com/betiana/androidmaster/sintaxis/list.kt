package com.betiana.androidmaster.sintaxis

fun main(){
    //inmutableList()
    mutableList()
    }

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    weekDays.add(3,"Arist")
    println(weekDays)

    if(weekDays.isEmpty()){
        //No voy a pintar nada porque no hay
    }else{
        weekDays.forEach{ println(it)}
    }
    if (weekDays.isNotEmpty()){
        weekDays.forEach{println (it)}
    }
    weekDays.last()

    for (Suscribete in weekDays){
    }

}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

//println(readOnly.size)
 //   println(readOnly)
 //   println(readOnly[2])
  //  println(readOnly.last())
 //   println(readOnly.first())

    //Filtrar
  //  val example =readOnly.filter {it.contains("a")}
  //  println(example)

    readOnly.forEach{ weekDay ->println (weekDay)}
}
