//Zadatak 14:
/*
Napravite funkciju koja će primati niz znakova(string) te posebno još jedan znak(char)
 te ispišite koliko puta se taj znak pojavljuje u tome stringu.
 */

fun main(){
    zadatak14()
}

fun zadatak14(){
    println("Unesi niz znakova:")
    val niz = readLine() ?: ""
    println("Unesi znak:")
    val znak = readLine()?.get(0) ?: return
    var count = 0
    for (c in niz) {
        if (c == znak) {
            count++
        }
    }
    println("Znak '$znak' se pojavio $count puta u nizu.")
}
