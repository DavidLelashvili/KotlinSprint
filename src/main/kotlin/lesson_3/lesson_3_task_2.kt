package lesson_3

fun main() {

    val name = "Татьяна"
    var secondName = "Андреева"
    val middleName = "Сергеевна"
    var age: Byte = 20

    println("$secondName $name $middleName, $age")

    secondName = "Сидорова"
    age = 22

    println("$secondName $name $middleName, $age")
}