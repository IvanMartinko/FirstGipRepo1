class Patka(name: String, color: String, year:Int): Animal(name, color, year) {
    override fun walk() {
        println("Duck is walking")
    }

    override fun stop() {
        println("Duck stopped")
    }

}