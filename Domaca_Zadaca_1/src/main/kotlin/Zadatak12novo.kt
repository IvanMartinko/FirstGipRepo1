fun main(){
    zadatak12novo()
}

fun zadatak12novo() {
    val myKunas = 100.0
    val myExchangeRate = 7.5354
    println(promijeni2(myKunas, myExchangeRate))
}

fun promijeni2(myKunas: Double, myExchangeRate: Double): Double = myKunas / myExchangeRate
