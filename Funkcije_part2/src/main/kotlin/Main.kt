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
    //Dobivamo zbroj svih znakova imena koja su duza od 4 znaka
    val totalChars = names.map{ it.length}.filter { it > 4 }.reduce{ acc, i -> acc + i}
    println(totalChars)

    //Zadatak 1 - Dan je skup cijelih brojeva ispisite samo one koji su dvoznamenkasti
    println("-------------------VJEZBA-------------------")
    val numbersSet = setOf(3, 5, 7, 897, 52, 34)

    //Rjesenje 1
    for(i in numbersSet){
        if(i >= 10 && i<100){
            println(i)
        }
    }

    //Rjesenje 2
    zad1(numbersSet)
    //Rjesenje 3
    println(numbersSet.filter { it in 10..99 })

    //Zadatak 2
    //Dana je list klijenata iz neke online trgovine
    //Prikazite listu koja je sortirana po imenu
    val clients = listOf("Renato", "Ivan", "Marijana", "Marko", "Bozica")
    println(clients.sortedBy { it })

    //Zadatak 3
    //Dana je lista troznamenkastih brojeva, ispisite broj koji ima najvecu srednju znamenku
    val threeDigitNumbers = listOf(372, 836, 191, 989,444)
    //opcenito (x/10) % 10 - vraca drugu znamenku broja
    println(threeDigitNumbers.maxBy { it / 10 % 10 })
    println(threeDigitNumbers.maxBy(::middleDigit))

    //DZ probaj rijesit funkcijom i  for petljom u funkciji

    //Zadatak 4
    //Zadana je list cijelih brojeva. Napravit novu listu na sljedeci nacin:
    //1. Ako je broj u listi neparan, udvostrucie ga.
    //2. Ako je broj paran, prepolovite ga
    //3. Ispite samo one elemente koji su nakon transformacije veci od 25
    val randomIntegers = arrayListOf(1, 5, 10, 20, 60, 80)
    println(randomIntegers)
    val newList = randomIntegers.map { if (it % 2 != 0){it * 2} else {it / 2} }.filter { it > 25 }
    println(newList)


}


fun middleDigit(n: Int): Int {
    return n / 10 % 10

}

fun zad1(numbersSet: Set<Int>){
    for(i in numbersSet){
    if(i >= 10 && i < 99){
        println(i)
    }
}

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

