package lesson_2

fun main() {

    val employeeCount = 50
    val employeeSalary = 30000
    val newcomersCount = 30
    val newcomersSalary = 20000

    val costEmployee = employeeCount * employeeSalary

    println("Расходы на сотрудников до прихода стажеров - $costEmployee")

    val costWithNewcomers = newcomersCount * newcomersSalary

    println("Расходы на стажеров - $costWithNewcomers")

    val generalCost = costEmployee + costWithNewcomers

    println("Общие расходы на сотрудников после прихода стажеров - $generalCost")

    val averegeSalary = generalCost / (newcomersCount + employeeCount)

    println("Средняя ЗП сотрудника с учетом стажеров - $averegeSalary")


}