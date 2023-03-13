import kotlin.math.PI

fun main(args: Array<String>) {
    val myArr = intArrayOf(1, 2, 3) //polje cijelih brojeva
    println(sumNumbers(ints = myArr))
    println(sumNumbers(x = 2, ints = myArr))
    println(sumNumbers())  //radi jer je x defaultno 0
    createUser("admin", "user", username = "Ivan", age = 24)
    createUser(username = "Ivan", age = 24, roles = arrayOf("admin", "user"))
    listAnimals()
    //Kreiraj funkciju koja za uneseni polumjer kruga (r) racuna njegovu promjenu
    println(circleArea(1.0))

    //Lambdas
    //Anonymous function
    val myLamda = {name: String -> println("Hello $name")}
    val names = arrayOf("Ivan", "Luka", "Matej", "Valentina")
    println("-------------------------LAMBDA VERSION-------------------------")
    sayHello(names, myLamda)
    println("-------------------------NORMAL VERSION-------------------------")
    sayHello(names, ::helloName)
    val numbers = arrayListOf(2, 4, 10, 20, 100, 55, 99)
    println(numbers)
    val numbersLambda = {number: Int -> number / 10}
    val newNumbers = myUpdate(numbers, numbersLambda)
    println(newNumbers)
    println(numbers)
    numbers.forEach{ print("${it / 10} ")}
    println()
    println(numbers)
    val newNames = names.filter { it.length > 4 }
    println(names)
    println(newNames)
    val resultMap = names.map { it -> it.uppercase() }
    println(names)
    println(resultMap)
    val stringsConcatenated = names.reduce{ acc: String, s: String -> "$acc$s" }
    println(stringsConcatenated)
    val totalChars = names.map{ it.length}.filter { it > 4 }.reduce{ acc, i -> acc + i}
    println(totalChars)
    
}

fun myUpdate(numbers: ArrayList<Int>, numbersLambda: (Int) -> Int): ArrayList<Int> {
    for (i in 0 until numbers.size) {
        if (numbers[i] % 2 == 0) {
            numbers[i] = numbersLambda(numbers[i])
        }
    }
    return numbers

}

fun sayHello(names: Array<String>, myLamda: (String) -> Unit) {
    for(name in names){
        myLamda(name)
    }
}

fun helloName(name: String){
    println("Hello $name")
}

fun circleArea(r: Double): Double = r * r * PI



fun listAnimals() {
    fun listOneAnimal(animal: String){
        println("I have a $animal")
    }
    val animals = listOf("cat", "dog", "goldfish")
    for(animal in animals){
        listOneAnimal(animal)
    }
}

fun sumNumbers(x: Int = 0, vararg ints: Int): Int {
    var sum = x
    for (int in ints){
        sum += int
    }
    return sum

}

fun createUser(vararg roles: String, username: String, age: Int){
    for(role in roles){
        print("$role ")
    }
    print("$username $age\n")
}

