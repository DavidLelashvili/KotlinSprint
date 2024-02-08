package lesson_7

fun main() {

    val numbersRange = (0..9)
    val lowerCaseAlphabetRange = 'a'..'z'
    val upperCaseAlphabetRange = 'A'..'Z'
    var passwordLenghtMax: Int
    var pass = ""

    val passList = (numbersRange.toList() +
            lowerCaseAlphabetRange.toList() +
            upperCaseAlphabetRange.toList()).shuffled()

    do {
        println("Введите длину пароля. Минимальная длина пароля - 6 символов")
        passwordLenghtMax = readln().toInt()

    } while (passwordLenghtMax < 6)

    for (i in 1..passwordLenghtMax) {
        pass += passList.random().toString()
    }

    println("Отлично, ваш сгенерированный пароль: $pass")

}