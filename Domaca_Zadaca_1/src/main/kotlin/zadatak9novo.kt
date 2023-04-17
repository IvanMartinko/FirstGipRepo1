fun main(){
    zadatak9novo()
}

fun zadatak9novo() {
    val listOfNumbers = arrayListOf<Int>()
        do{
            val input = readLine()?.toInt() ?: 1
            listOfNumbers.add(input)
        } while(input != 0)
        println(listOfNumbers.map {if(hasEvenDigit(it)) 1 else 0 }.sum( ))
}

fun hasEvenDigit(num: Int): Boolean{
    var myNumber = num
    while(myNumber > 0){
        val lastDigit = myNumber % 10
        if(lastDigit % 2 ==0){
            return true
        }
        myNumber /= 10
    }
    return false
}
