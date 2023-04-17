//Zadatak 2:
/*
Napišite program koji će tražiti unos 3 realna broja i ispisati vrijednost najveceg od njih.
 */

fun main(){
    var a: Double? = readLine()?.toDouble()
    var b: Double? = readLine()?.toDouble()
    var c: Double? = readLine()?.toDouble()
    val myMax = when {
        a!! > b!! && a > c!! -> a
        b > a && b > c!! -> b
        else -> c
    }
    println("Max je: $myMax")
}