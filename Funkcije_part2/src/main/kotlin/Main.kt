fun main(args: Array<String>) {
    val myArr = intArrayOf(1, 2, 3) //polje cijelih brojeva
    println(sumNumbers(ints = myArr))
    println(sumNumbers(x = 2, ints = myArr))
    println(sumNumbers())  //radi jer je x defaultno 0
}

fun sumNumbers(x: Int = 0, vararg ints: Int): Int {
    var sum = x
    for (int in ints){
        sum += int
    }
    return sum

}
