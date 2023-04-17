//Zadatak 5:
/*
Napravite program koji će tražiti unošenje prirodnog broja n<10. Program treba izračunati n! (faktorijel)
Faktorijel se racuna kao 1 * 2 * 3 ... * n
 */
fun main() {

    val n = 5
    println(factorial(10))

}
fun factorial(n: Int): Int {
        var product = 1
        for (i in 1..n) {
            product = product * i //ili product *= 1
        }
        return product
    }