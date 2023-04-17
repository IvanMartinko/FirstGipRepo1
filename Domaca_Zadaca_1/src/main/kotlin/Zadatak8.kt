//Zadatak 8:
/*
Napravite program koji će korisniku omogućiti učitavanje brojeva sve dok se ne unese -1.
Program treba ispisati na zaslon koliko je medu unesenim brojevima onih koji su djeljivi s 5.
 */

fun main(){
    zadatak8()
}

fun zadatak8() {
    var count = 0
    do {
        println("Enter numbers: ")
        var input = readLine()?.toInt() ?: 0
        if(input % 5 == 0)
            count++
        } while(input != -1)
    println("Number of numbers dividable by 5: $count")
}
