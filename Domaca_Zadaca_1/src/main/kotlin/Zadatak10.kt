//Zadatak 10:
/*
Napišite program koji će za uneseni prirodan broj n provjeriti je li on "potpuno neparan".
(Napomena: Broj je "potpuno neparan" ako mu je svaka znamenka neparna)
 */

fun main() {
    zadatak10()
}

fun zadatak10() {
    var num = 1111
    println(potpunoNeparan(num))

}

fun potpunoNeparan(num: Int): Boolean {
    var myNum = num
    while (myNum > 0) {
        val lastDigit = myNum % 10
        if (lastDigit % 2 == 0) {
            return false
        }
        myNum /= 10
    }
    return true


}
