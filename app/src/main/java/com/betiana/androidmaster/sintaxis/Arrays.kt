package com.betiana.androidmaster.sintaxis

fun main(){
    var name: String = "AristiDevs"


//indice de 0 - 6
//tamaño 7
 val weekDays= arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

    //println(weekDays[0])

    weekDays[0] = "Holita"

    //println(weekDays.size)

    //tamaños
    if(weekDays.size >= 8){
   // println(weekDays[7])
} else{
    //println("No hay mas valores en el array")
}

    //modificar valores
    weekDays[0]="Feliz viernes"
    //println(weekDays[0])

    //Bucles para arrays

    for(position in weekDays.indices){
       // println("He pasado por aqui $position")
       // println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
        println("La posicion $position, contiene $value" )
    }

    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
    }