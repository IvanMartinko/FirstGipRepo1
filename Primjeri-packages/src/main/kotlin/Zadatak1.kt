fun zadatak1Map(){
    val seasons = mapOf(Pair(1, "Winter"), Pair(2, "Spring"), Pair(3, "Summer"), Pair(4, "Fall"))
    val input = zadatak1InputNumber()
    if(input < 1 || input > 4){
        println("Invalid input range, please input a number from 1 to 4")
    } else {
        println(seasons[input])
    }
}

fun zadatak1When(){
    val input = zadatak1InputNumber()
    if(input < 1 || input > 4){
        println("Invalid input range, please input a number from 1 to 4")
    } else {
        when(input){
            1 -> println("Winter")
            1 -> println("Spring")
            1 -> println("Summer")
            1 -> println("Autumn")
            else -> println("Default value ")
        }
    }
}

fun zadatak1InputNumber(): Int{
    println("Input a number 1-4")
    val input = try {
        readLine()?.toInt() ?: 1
    } catch (e: Exception){
        println("Couldn't convert to int, using a default value of 1")
        1
    }
    return input
}