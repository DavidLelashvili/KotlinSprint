package lesson_11

class User2(
    val id: Int,
    val login: String,
    var pass: String,
    val mail: String,
    var bio: String? = null,
) {
    fun getUserInfo() {
        println("""
            Ваши данные:
            id - $id
            login - $login
            password - $pass
            mail - $mail
            bio - $bio
        """.trimIndent())
    }

    fun fillUserBio() {
        println("Введите информацию о себе")
        bio = readln()
    }

    fun changeUserPassword() {
        println("Для смены пароля сначала введите свой текущий пароль")
        val oldPass = readln()

        if (oldPass == pass) {
            println("Отлично! Введите новый пароль")
            pass = readln()
            println("Ваш пароль успешно изменен!")
        }
    }

}

fun main() {

    val user = User2(
        getRandomId(),
        "login1",
        "pass1",
        "mail@mail.com",
    )

    user.fillUserBio()
    user.changeUserPassword()
    user.getUserInfo()

}