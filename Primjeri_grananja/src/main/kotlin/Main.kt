fun main(args: Array<String>) {
    println("Input a boolean value. Is it night time?")

    val input = readLine() ?: "true"
    val night = input.toBoolean()

    if(night) {
        println("Sleep")
    } else {
        println("Be awake")
    }

    //veći od dva broja
    val a = 12
    val b = 7

    val myMax = if(a < b){
        b
    }else {
        a
    }
    println(myMax)

    println("--------------------------------------------------------------------------")
    val myNum = 5555
    if(myNum >= 0 && myNum < 10){
        println("Single digiti number")
    } else if(myNum >= 10 && myNum <= 100){
        println("Two digit number")
    } else if(myNum >=100 && myNum <= 1000){
        println("Three digit number")
    } else{
        println("Number has more than 3 digits")
    }
     //da ne pisemo print stalno
    val result = if (myNum >= 0 && myNum < 10){
        "Single digit number"
    } else if (myNum >= 10 && myNum < 100){
        "Two digit number"
    } else if (myNum >= 100 && myNum < 1000){
        "Three digit number"
    } else {
        "Number has more than 3 digits"
    }
    println(result)

    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = true

    if (petStore.contains("cat")){
        if (hasCatFood){
            println("Buy cat and cat food")
        } else{
            println("Buy cat only")
        }
    } else{
        print("Ask the store owner to get a cat")
    }

    val number = 25
    val isEven = if(number % 2 == 0) true else false
    println(isEven)

    val favoritePet = "dog"
    val availablePets = listOf("dog", "cat", "fish")
    if(favoritePet in availablePets){
        println("Favorite pet is available")
    } else {
        println("Sorry, $favoritePet is not available")
    }

    val exampleNumber = 9
    if (exampleNumber in 0..9){
        println("Single digit number")
    } else {
        println("Number is not a single digit")
    }
}