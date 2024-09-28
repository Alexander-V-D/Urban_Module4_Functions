import kotlin.math.pow

fun main() {

}

//Функция для задачи 1
fun exponentiation(a: Double, n: Double) = a.pow(n)

//Функция для задачи 2
fun sumInterval(a: Int, b: Int): Int {
    var sum = a
    for (i in a + 1..b) {
        sum *= i
    }
    return sum
}

//Функция для задачи 3
fun calculateLargestCommonDivisor(a: Int, b: Int): Int {
    var divisor = 1
    for (i in 2..b) {
        if (a % i == 0 && b % i == 0) divisor = i
    }
    return divisor
}