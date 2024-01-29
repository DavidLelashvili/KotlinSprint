package lesson_2

fun main() {

    val employeeCount :Byte = 50
    val employeeSalary: Short= 30000
    val newcomersCount: Byte = 30
    val newcomersSalary: Short = 20000

    val costEmployee: Int = employeeCount * employeeSalary

    println("Расходы на сотрудников до прихода стажеров - $costEmployee")

    val costWithNewcomers: Int = newcomersCount * newcomersSalary

    println("Расходы на стажеров - $costWithNewcomers")

    val generalCost: Int = costEmployee + costWithNewcomers

    println("Общие расходы на сотрудников после прихода стажеров - $generalCost")

    val averegeSalary: Int = generalCost / (newcomersCount + employeeCount)

    println("Средняя ЗП сотрудника с учетом стажеров - $averegeSalary")


}