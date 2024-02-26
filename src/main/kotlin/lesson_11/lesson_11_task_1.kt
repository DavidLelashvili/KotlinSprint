package lesson_11

class UserTask1(
    val id: Int,
    val login: String,
    val pass: String,
    val mail: String,
)

fun getRandomId() = (0..9999).random()

fun main() {
    val user1 = UserTask1(
        getRandomId(),
        "login1",
        "pass1",
        "mail@mail.com",
    )
    val user2 = UserTask1(
        getRandomId(),
        "login2",
        "pass2",
        "mail2@mail.com",
    )

    println(
        """
        Данные юзера1:
        ${user1.id}
        ${user1.login}
        ${user1.pass}
        ${user1.mail}        
        Данные юзера2:
        ${user2.id}
        ${user2.login}
        ${user2.pass}
        ${user2.mail}
    """.trimIndent()
    )
}
