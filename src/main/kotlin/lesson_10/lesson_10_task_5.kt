package lesson_10

const val TOKEN_SIZE = 32

fun main() {
    val login = "login"
    val pass = "pass"

    println("Введите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPass = readln()

    val successAuth = checkCredential(userLogin, login) &&
            checkCredential(userPass, pass)

    getUserBasket(successAuth)

}

fun checkCredential(credential: String, expectedCredential: String): Boolean {
    return (credential == expectedCredential)
}

fun getToken(auth: Boolean): String? {
    return if (auth) generateToken()
    else null
}

fun getUserBasket(successAuth: Boolean, token: String? = getToken(successAuth)) {
    val userBasket = listOf("молоко", "сыр", "сметана", "огурец")

    if (token != null) println(userBasket)
    else println("Ошибка авторизации")
}

fun composeElementList(): List<Char?> {
    val elementList: List<Char>
    val numbers: List<Char> = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    val lowerCaseAlphabet = ('a'..'z').toList()
    val upperCaseAlphabet = ('A'..'Z').toList()

    elementList = upperCaseAlphabet +
            lowerCaseAlphabet +
            numbers
    return elementList
}

fun generateToken(): String {
    var generateToken = ""
    val shuffledList = composeElementList().shuffled()
    for (element in 1..TOKEN_SIZE) {
        generateToken += shuffledList.random().toString()
    }
    return generateToken
}
