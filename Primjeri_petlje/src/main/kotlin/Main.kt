@OptIn(ExperimentalStdlibApi::class)
fun main(args: Array<String>) {

    //For petlja
    val animals = arrayListOf("cat", "dog", "goldfish")

    for (animal in animals){
        println("Feed the $animal")
    }

    //ispisivanje brojeva od 1 do 10
    for (i in 1..10){
        print("$i\t")  // \t razmak(tab)
    }
    println()

    //mjeseci
    for(i in 1..12){
        val month = when(i){
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            else -> "December"
        }
        println("$i. month is $month")
    }

    //Program sumira prvih 100 prirodnih brojeva
    var total = 0
    for (i in 1..100){
        total += i  // iliti total = total + i
    }
    println("Sum of first 100 numbers is $total")

 //   val n = 100
 //   println((n * (n + 1)) / 2)  alternativa, Gaussova formula

    val customers = hashMapOf(Pair("Ivan", 1), Pair("Renato", 2), Pair("Luka", 3))

    for (customerName in customers.keys){
        val purchase = customers[customerName]
        println("$customerName purchased $purchase items")
    }

    for (i in 10 downTo 0){  //ispiše od 10 do 0
        print("$i ")
    }
    println()

    for (i in 10 downTo 0 step 2){  //ispiše svaki drugi
        print("$i ")
    }
    println()

    //Nested for-loops
    println("------------------MULTIPLICACTION TABLE------------------")
    for (i in 1..10){
        for(j in 1..10){
            print("${i * j} | ")
        }
        println()
        println("--------------------------------------------------")
    }

    //While loops
    println("----------------WHILE LOOPS-----------------")
    var i = 0

    while (i < 10){ //ispisuje brojeve od 1 do 10
        print("$i ")
        i++
    }
//    println()
//    println("Input a name: ")
//    var inputName = readLine() ?: "Default name"
//    var numOfInput = 1

//    while(inputName != "Renato"){
//        println("The name isn't Renato!")
//        println("Input a name: ")
//        inputName = readLine() ?: "Default name"
//        numOfInput++
//    }
//    println("The name is Renato! You've put $numOfInput names")
    println()

    val dogs = listOf("Rex", "Max", "Floki")

    var index = 0

    while (index < dogs.size){
        println(dogs[index])
        index++
    }

    //moze i
    for(i in 0..dogs.size - 1){
        println(dogs[i])
    }

    var input:String
    var finished = false
    var numOfNameInputs = 0

    do {
        println("Enter a name: ")
        input = readLine() ?: "Default input"
        numOfNameInputs++
        println("You've put: $input")
        if(input == "Renato"){
            finished = true
            println("You've put $numOfNameInputs name(s)")
        }
    } while (!finished)

    println("---------------------------------------------------")

    val usernames = hashSetOf("Ivan", "Renato", "Rea")
    var finishedUsernameInput = false
    var usernameInput:String

    do{
        println("Enter your username: ")
        usernameInput = readLine() ?: "Default input"
        if(usernameInput in usernames){
            println("Username already taken, please enter a new one!")
        }
        else{
            usernames.add(usernameInput)
            println("Username added")
            println(usernames)
            finishedUsernameInput = true
        }
    } while(!finishedUsernameInput)

    //Continue, break
    for (i in 1..10)
        if(i == 7){
            break
        }
        else{
            print("$i ")
        }
    println()

    for (i in 1..10)
        if(i == 7){
            continue  //sad bude ispisal sve osim 7
        }
        else{
            print("$i ")
        }
    println()

    //
    for (i in 1..10) {
        for (j in 1..10) {
            if (i % 3 == 0) {
                break
            }
            println("$i, $j")
        }
    }


}