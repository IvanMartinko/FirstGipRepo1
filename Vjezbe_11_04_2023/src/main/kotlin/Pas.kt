class Pas(name: String, color: String, year: Int) : Animal(name, color, year) {
    override fun walk() {
        println("Dog is walking")
    }

    override fun stop() {
        println("Dog stopped")
    }
}