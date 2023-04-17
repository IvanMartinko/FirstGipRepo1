import kotlin.text.Typography.euro

//Zadatak 12:
/*
Napravite funkciju promijeni() koja traži unos kuna te upisivanje tečaja
1 eura u odnosu na 1 kn (npr za uneseni broj 7.5354 korisnik kaže da je 1 euro=7.5354 kn).
Funkcija treba vratiti broj eura koje će korisnik dobiti za dane kune.
 */

fun main(){
    zadatak12()
}

fun zadatak12() {
    val euri = promijeni()  // val myKunas = 100
    println("Euro: $euri")  // val myExchangeRate = 7.5354
    //println(promijeni(myKunas, myExchangeRate))
}

fun promijeni(): Double {
    println("Unesi kune: ")
    val kune = readLine()?.toDouble() ?: 0.0

    println("Unesi tečaj: ")
    val tecaj = readLine()?.toDouble() ?: 1.0

    val euri = kune / tecaj
    return euri

    //fun promijeni(myKunas: Double, myExchangeRate: Double): Double = myKunas / myExchangeRate
}

