//2.Kreiraj funkciju koja prima dva cijela broja veca od 1 i ispisuje
// sve proste brojeve od manjeg primljenog broja do veceg. (prosti brojevi su oni koji su djeljivi samo sa 1 i sa samim sobom)
fun main(){
    zadatak2(2,50)
}

fun zadatak2(n1: Int, n2: Int){
    val range = when {
        n1 < n2 -> n1..n2
        n1 > n2 -> n2..n1
        else -> n1..n2
    }
    for(num in range)
        if(primeNumber(num)){
            println(num)
        }
}

fun primeNumber(num: Int): Boolean {
    var flag = true
    for(i in 2..num / 2){
        if(num % i == 0){
            flag = false
            break
        }
    }
    return flag
}

