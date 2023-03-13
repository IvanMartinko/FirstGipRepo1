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
    println("Name length is: ${myInput?.length}")

    //Zadatak 4 - Read a message from the console. Print out the message or a default greeting "Hi" (assume that
    // readline can return a null value
    println("Enter a greeting")
    val greeting = readLine() ?: "Hi"
    println(greeting)

    //Zadatak 5 - Read a number from a console, read variable is not null, multiply that number by 5
    println("Enter number:")
    val number: Double? = readLine()?.toDouble()  // readline je string pa ga treba prebacit u double
    println(number!! * 5)  // !! mu govori da nije nullable i onda ne treba pisat times zbog toga  (ali treba izbjegavat ovo)

    //Zadatak 6 (DZ) - Read a number from a console and convert it to Double. Multiply by 7 and convert to string



}