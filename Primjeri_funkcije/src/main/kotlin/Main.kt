fun main(args: Array<String>) {
    //Funkcije

    println()
    println("Parametar")

    val result = addNumbers(1,2)
    println(result)
    sayHello()

    val squareResult = numberSquared(3.14)
    println(squareResult)
    println(numberSquared(3.14))

    //
    println(addNumbers(5, numberSquared(3.14).toInt()))
    println(addNumbers(4))
    println(addNumbers(4.5))
    //
    println("----------------")
    foo("a", "b")
    foo("c", "d", "e")
    foo("a1")
    foo(strings = arrayOf("a", "b", "c"))
    println("-----------------")
    foo()

    //
    firstAndSecond()
    firstAndSecond(2,3)
    firstAndSecond(first = 2, second = 3)
    firstAndSecond(second = 3, first = 2)
}

fun addNumbers(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun addNumbers(num1: Int): Int{
    return num1 + 2
}

fun addNumbers(num1: Double) :Double{
    return num1 + 2.0
}


fun sayHello() {
    val greeting = "Hello"
    println(greeting)
    greeting.sayHello()
}

fun numberSquared(num: Double) :Double {
    return num * num
}

fun String.sayHello(){
    println("sayHello")
}

fun foo(vararg strings:String = arrayOf("a")){
    for(a:String in strings){
        println(a)
    }
}

fun firstAndSecond(first: Int = 1, second: Int = 2){
    println("First: $first, Second: $second")
}