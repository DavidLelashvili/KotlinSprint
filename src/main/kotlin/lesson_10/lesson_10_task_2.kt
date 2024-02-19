package lesson_10

const val CREDENTIAL_LENGHT = 4

fun main() {

    println("Введите логин")
    val userLogin = readln()

    println("Введите пароль")
    val userPass = readln()

    if (
        validateLenght(userLogin) ||
        validateLenght(userPass)
    ) println("Логин или пароль недостаточно длинные")
    else println("Добро пожаловать")

}

fun validateLenght(credential: String): Boolean = credential.count() <= CREDENTIAL_LENGHT
