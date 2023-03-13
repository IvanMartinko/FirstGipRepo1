fun main(args: Array<String>) {
    val x = 7
    val result = when(x){
        0, 1 -> {
            "x == 0 or x == 1"
        }
        else ->
            "otherwise"
    }
    println(result)

    //Zadatak 1 - provjeri je li broj jednoznamenkast, dvo, tro ili nista
    val y = 25
    val result2 = when(y){
        in 1..9-> "Single digit number"
        in 10..99-> "Two digit number"
        in 100..999-> "Three digit number"
        else -> "Number has more than 3 digits"
    }
    println(result2)

    //Zadatak 2 - program koji za uneseni mjesec govori koliko ima dana u mjesecu
    val month = 12
    val result3 = when (month){
        1, 3, 5, 7, 8, 10, 12 -> "That month has 31 days"
        2 -> "That month has 29 days"
        4, 6, 9, 11 -> "That month has 30 days"
        else -> "That is an invalid input for a month"
    }
    println(result3)


}