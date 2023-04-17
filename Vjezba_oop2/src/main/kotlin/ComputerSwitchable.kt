interface ComputerSwitchable : Switchable {

    companion object{
        val BOOTING_UP_STANDARD_DELAY = 0.5
    }
    fun enterBios()

    fun bootUp(speed: Double) : Double = speed + BOOTING_UP_STANDARD_DELAY
}