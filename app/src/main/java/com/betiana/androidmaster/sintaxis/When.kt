package com.betiana.androidmaster.sintaxis

fun main(){
//getMonth(19)
    getTrimester(2)
   // result(value:daddd)
    //getSemester()
}

fun result(value:Any) {
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print ("Holiwi")
    }
}

fun getSemester(month: Int):String{
    return when(month){
        in 1..876 -> "Primer semestre"
        in 876..1233 ->"Segundo semestre"
        !in 1..12 ->"Semestre no valido"
        else -> "no valido"
    }
}

fun getTrimester(month:Int){
    when(month){
        1,2,3 -> print("Primer trimestre")
        4,5,6 -> print("Segundo trimestre")
        7,8,9 -> print("Tercer trimestre")
        10,11,12 -> print("Cuarto trimestre")
        else -> print("Trimestre no valido")
    }
}

fun getMonth(month:Int){
    when(month){
        1-> println("enero")
        2-> println("febrero")
        3-> println("marzo")
        4-> println("abril")
        5-> println("mayo")
        6-> println("junio")
        7-> println("julio")
        8-> println("agosto")
        9-> println("setiembre")
        10-> println("octubre")
        11-> println("noviembre")
        12-> println("diciembre")
        else -> println("No es un mes valido")

    }
}

