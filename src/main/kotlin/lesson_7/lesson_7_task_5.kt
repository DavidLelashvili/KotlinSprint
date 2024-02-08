package lesson_7

const val PASSWORD_LENGHT_MIN = 6

fun main() {

    val numbersRange = (0..9)
    val lowerCaseAlphabetRange = 'a'..'z'
    val upperCaseAlphabetRange = 'A'..'Z'
    var passwordLenght: Int
    var pass = ""

    val passList = (numbersRange.toList() +
            lowerCaseAlphabetRange.toList() +
            upperCaseAlphabetRange.toList()).shuffled()

    do {
        println("Введите длину пароля. Минимальная длина пароля - 6 символов")
        passwordLenght = readln().toInt()

    } while (passwordLenght < PASSWORD_LENGHT_MIN)

    for (i in 1..passwordLenght) {
        pass += passList.random().toString()
    }

    println("Отлично, ваш сгенерированный пароль: $pass")

}