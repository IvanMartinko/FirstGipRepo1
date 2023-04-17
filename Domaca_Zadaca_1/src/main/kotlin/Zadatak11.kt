//Zadatak 11:
/*
    Napravite funkciju aps() koja će za predani realan broj ispisati njegovu apsolutnu vrijednost.
|-5| = 5, |5| = 5
 */

fun main(){
    zadatak11()
}

fun zadatak11() {
    println("Enter number: ")
    readLine()?.toDouble()?.let { aps(it) }
}

fun aps(x: Double) {
    val aps = if(x < 0) -x else x  //if(x >= 0) x else -x  (else * -x)
    println("|$x| = $aps")
}
