package lesson_11

class MeetingRoom(
    val cover: String,
    val name: String,
    val users: MutableList<Users> = mutableListOf(),
) {

    fun addUserToMeetingRoom(user: Users): Boolean {
        println("Добавляем ${user.name} в комнату $name")
        return users.add(user)
    }

    fun getRoomInfo() {
        println(
            """
        Обложка комнаты - $cover
        Комната - $name
        Участники - $users
    """.trimIndent()
        )
    }

}


class Users(
    val avatar: String,
    var name: String,
    var status: String,
) {

    fun userUpdateStatus(userName: String, userNewStatus: String) {
        if (userName == name) status = userNewStatus
    }

    fun getUserInfo() {
        println("Аватор - $avatar")
        println("Никнейм - $name")
        println("Статус - $status")
    }

}

fun main() {

    val talking = "разговаривает"
    val disableMic = "микрофон выключен"
    val blockUser = "пользователь заглушен"

    val user1 = Users(
        "Аватар1",
        "Юзер1",
        talking,
    )
    val user2 = Users(
        "Аватар2",
        "Юзер2",
        disableMic,
    )

    val meetingRoom1 = MeetingRoom(
        "Обложка1",
        "Комната1",
    )

    println("Информация о юзере1:")
    user1.getUserInfo()
    println()
    println("Информация о юзере2:")
    user2.getUserInfo()
    println()
    meetingRoom1.addUserToMeetingRoom(user1)
    println("Обновлние статуса юзера1")
    user1.userUpdateStatus("Юзер1", disableMic)
    user1.getUserInfo()
    println()
    meetingRoom1.addUserToMeetingRoom(user2)
    user2.userUpdateStatus("Юзер2", blockUser)
    user2.getUserInfo()
    println()
    println("Информация по комнате")
    meetingRoom1.getRoomInfo()

}