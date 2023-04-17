class MountainBike(color: String, val numOfGears: Int, val maxSpeed: Double) : Bicycle(color) {

    fun adjustToRegularRoad(){
        println("Adjust to regular road")
    }
    override fun ride(){
        println("Mountain Bike with color $color is riding")
    }

    override fun repair(){
        println("Mountain Bike with color $color is repairing")
    }
}
