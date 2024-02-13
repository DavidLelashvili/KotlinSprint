package lesson_10


fun main() {

    println("Введите длину пароля")
    val userPassLenght = readln().toInt()

    println("Ваш сгенерированный пароль: ${generatePassword(userPassLenght)}")

}

fun generatePassword(passLenght: Int): String {
    val numberList = (0..9).toList()
    val symbolsRange = '!'..'/'
    var pass = ""
    val symbolsListWithWhiteSpace = symbolsRange.toMutableList()
    symbolsListWithWhiteSpace.add(' ')

    for (passSymbol in 1..passLenght) {
        if (passSymbol % 2 == 0) {
            pass += symbolsListWithWhiteSpace.random().toString()
        } else pass += numberList.random().toString()
    }
    return pass
}