package lesson_3

fun main() {

    val number: Byte = 5

    val i1 = 1
    val i2 = 2
    val i3 = 3
    val i4 = 4
    val i5 = 5
    val i6 = 6
    val i7 = 7
    val i8 = 8
    val i9 = 9

    println(
        """
        $number X $i1 = ${number * i1}
        $number X $i2 = ${number * i2}
        $number X $i3 = ${number * i3}
        $number X $i4 = ${number * i4}
        $number X $i5 = ${number * i5}
        $number X $i6 = ${number * i6}
        $number X $i7 = ${number * i7}
        $number X $i8 = ${number * i8}
        $number X $i9 = ${number * i9}
    """.trimIndent()
    )

}