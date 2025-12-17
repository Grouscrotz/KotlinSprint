package lesson_1

fun main() {
    val seconds: Int = 6480
    val minutes: Int = seconds / 60 % 60
    val hours : Int = seconds / 3600

    println("0$hours:$minutes:00")
}