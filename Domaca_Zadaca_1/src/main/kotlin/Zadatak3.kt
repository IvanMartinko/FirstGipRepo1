//Zadatak 3:
/*
Napišite program koji će tražiti unos 3 realna broja i ispisati ih po veličini od najvećeg do najmanjeg.
 */
fun main(){
    println("Upiši tri realna broja: ")
    println("Prvi broj: ")
    var a: Double? = readLine()?.toDouble()
    println("Drugi broj: ")
    var b: Double? = readLine()?.toDouble()
    println("Treći broj: ")
    var c: Double? = readLine()?.toDouble()
    val numberList = listOf(a, b, c).sortedByDescending { it }
    println(numberList)

}
