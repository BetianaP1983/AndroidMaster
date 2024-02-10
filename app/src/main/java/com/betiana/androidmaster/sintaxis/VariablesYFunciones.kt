package com.betiana.androidmaster.sintaxis

val age: Int = 30

fun main() {
    showMyName ()
    showMyAge(52)
    add(25, 76)
    val mySubtract = subtract(10,5)
    println (mySubtract)
}

fun showMyAge(currentAge: Int = 30) {
    println("Tengo $currentAge años")
}

fun showMyName() {
    println("Me llamo Betiana")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract (firstNumber: Int, secondNumber: Int): Int{
    return firstNumber - secondNumber
   // println("Adios :(")
}

fun subtractCool (firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber
    // println("Adios :(")


fun variablesAlfanumericas() {
    /**
     * VARIBLES ALFANUMERICAS (NUMEROS Y LETRAS)
     */

    //CHAR 1 solo caracter
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //string
    val stringExample: String = "Betiana suscribete"
    val stringExample2: String = "Betiana"
    val stringExample3: String = "4"
    val stringExample4: String = "23"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    print(stringConcatenada)
    val example123: String = age.toString()
}

fun variablesBoolean() {
    /**
     * Variables booleanas
     */

    //boolean true o false
    val booleanExample: Boolean = true
    val booleanExample1: Boolean = false
    val booleanExample2: Boolean = false
}

fun variablesNumericas() {

    /**
     * VARIABLES NUMERICAS
     */

    //int: entero -2,147,483,647 a 2,147,483,647
    var age2: Int = 30
    age2 = 29


    //long -9,223,372,836,854,775,807 a 9,223,372,836,854,775,807
    val example: Long = 30
    val example2: Long = 30


    //float decimales
    val floatExample: Float = 30.5f

    //Doubles
    val doubleExample: Double = 3241.3123123

    println("Sumar:")
    println(age + age2)

    println("Restar:")
    println(age - age2)

    println("Multiplicar:")
    println(age * age2)

    println("Dividir:")
    println(age / age2)

    println("Modulo:")
    println(age % age2)

    var exampleSuma = age + floatExample


}