package lesson_7

fun main() {

    val numbersRange = 0..9
    val alphabetRange = 'a'..'z'
    val passwordLenght = 6
    var pass = ""

    for (i in 1..passwordLenght / 2) {
        pass += alphabetRange.random().toString() + numbersRange.random().toString()
    }

    println(pass)

}