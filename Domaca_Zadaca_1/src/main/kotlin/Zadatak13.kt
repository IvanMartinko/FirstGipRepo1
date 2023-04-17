//Zadatak 13:
/*
Napravite funkciju obrni() koja će predani prirodan broj ispisati obrnutim poretkom znamenki.
(Testni primjer: 1234 Rezultat: 4321)
 */

fun main(){
    zadatak13()
}

fun zadatak13() {
    val num = 123456789
    val obrnutiBroj = obrni(num)
    println("Broj $num obrnuto je: $obrnutiBroj")
}

fun obrni(num: Int): Int {
    var n = num
    var reverseNum = 0

    while (n > 0) {
        val lastDigit = n % 10
        reverseNum = reverseNum * 10 + lastDigit
        n /= 10
    }
    return reverseNum   
}

