import java.text.FieldPosition

fun main(args: Array<String>) {
    //Enums
    val color = Colors.RED
    chooseColor(color)
    println(Colors.RED.timesUsed)
    println(Colors.GREEN.name)
    println(Colors.BLUE.ordinal)
    println(getWarmth(Colors.RED))
    println(getMedal(1))
    println(getMedal(10))




}

fun chooseColor(color: Colors) {
        when(color){
            Colors.RED -> println("You chose red")
            Colors.GREEN -> println("You chose green")
            Colors.BLUE -> println("You chose blue")

        }

}

enum class Colors(val timesUsed: Int){
    RED(34),
    GREEN(12),
    BLUE(7)
}

fun getWarmth(color: Colors) = when(color){
    Colors.RED -> "Warm"
    Colors.GREEN -> "Neutral"
    Colors.BLUE -> "Cold"
}

enum class Medal{
    GOLD,
    SILVER,
    BRONZE,
    NONE
}

fun getMedal(position: Int): Medal{
    return when(position){
        1 -> Medal.GOLD
        2 -> Medal.SILVER
        3 -> Medal.BRONZE
        else -> Medal.NONE
    }

}


