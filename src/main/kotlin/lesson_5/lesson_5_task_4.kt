package lesson_5

fun main() {

    val name = "Zaphod"
    val pass = "PanGalactic"

    println(
        """
        Внимание, пассажир. 
        Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". [вздыхает...] 
        Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
        Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] 
        Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent()
    )
    val userName = readln()

    if (userName == name) {

        println("Введите пароль")
        val userPass = readln()

        if (userPass == pass) {
            println(
                """
                [вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
                Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
                Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] 
                Надеюсь, вам понравится пребывание здесь больше, чем мне.
                """.trimIndent()
            )
        } else println("Пароль введен неаверно")

    } else println("[вздыхает...] Ваши данные проверены, и мы вас не знаем. Пройдите, пожалуйста, процесс регистрации ")

}