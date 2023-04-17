//Zadatak 1:
/*
Napravite program koji će unesenim realnim brojevima a i b zamijeniti mjesta te ih ispisati prije i poslije zamjene.
 */

fun main(){
    zadatak1()
}

fun zadatak1() {
    println("Upišite prvi broj: ")
    var num1: Double? = readLine()?.toDouble()
    println("Upišite drugi broj: ")
    var num2: Double? = readLine()?.toDouble()
    println("Prvi broj je $num1, drugi broj je $num2")
    val temp: Double? = num1
    num1 = num2
    num2 = temp
    println("Nakon zamjene prvi broj je $num1, drugi broj je $num2")
}

