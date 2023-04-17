//Zadatak 9:
/*
Napravite program koji omogućuje unošenje cijelih brojeva sve dok se ne unese 0.
Program treba ispisati koliko od unesenih brojeva ima barem jednu parnu znamenku.
(Testni primjer: 3 17 21 87 16 24 18 37 0 , Rjesenje: 5)
 */

fun main(){
    zadatak9()
}

fun zadatak9() {
    var count = 0
    do {
        println("Enter numbers: ")
        var input = readLine()?.toInt() ?: 0
        var evenDigitNumber = false
        var num = input
        while (num != 0 && !evenDigitNumber) {
            val digit = num % 10
            if (digit % 2 == 0) {
                evenDigitNumber = true
            }
            num /= 10
        }
        if (evenDigitNumber && input != 0) {
            count++
        }
    }
        while(input != 0)
    println("Number of numbers with even digits: $count")
}
