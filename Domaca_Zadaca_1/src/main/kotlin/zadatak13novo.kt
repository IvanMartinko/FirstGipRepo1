fun main(){
    zadatak13novo()
}

fun zadatak13novo() {
    val number = 1234
    obrniNovo(number)
    obrniNovo2(number)
}

fun obrniNovo2(number: Int) {
    println(number.toString().reversed())
}

fun obrniNovo(number: Int) {
    var myNumber = number
    while(myNumber > 0){
        val lastDigit = myNumber % 10
        println("$lastDigit")
        myNumber /= 10
    }
    println()
}
