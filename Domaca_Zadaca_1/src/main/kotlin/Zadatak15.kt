//Zadatak 15:
/*
Napravite funkciju isPalindrome() koja će za predani string vratiti true ukoliko je string palindrom i false ukoliko nije.
(Napomena: rijec je palindrom ukoliko se jednako cita s pocetka i s kraja, "ana" je palindrom , "ananas" nije)
 */

fun main(){
    zadatak15()
}

fun zadatak15() {
    val result = isPalindrome()
    if (result) {
        println("To je palindrom.")
    } else {
        println("To nije palindrom.")
    }

}

fun isPalindrome(): Boolean {
    println("Unesi poruku:")
    val poruka = readLine() ?:""
    val n = poruka.length
    for(i in 0 until n / 2){
        if(poruka[i] != poruka[n - i - 1] ){
            return false
        }
    }
    return true
}
