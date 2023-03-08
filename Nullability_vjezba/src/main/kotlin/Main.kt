fun main(args: Array<String>) {

    //Zadatak 1 - Declare a nullable variable of type String and give it a value. Print substring 2 to 4
    var test1: String? = "something"
    println(test1?.substring(2,4))

    //Zadatak 2 -  Declare a nullable variable of type Double, multiply by 6, convert to Float and print
    var num: Double? = 7.0
    val floatNum = num?.times(6)?.toFloat()
    println(floatNum)

    //Zadatak 3 - Recieve the name of the user from the console. Print out the length
    println("Write your name:")
    val myInput = readLine()
    println(myInput?.length)



}