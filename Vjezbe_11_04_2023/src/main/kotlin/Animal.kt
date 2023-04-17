abstract class Animal(val name: String, val color: String, val year: Int) {

    abstract fun walk()

    abstract fun stop()

    override fun toString(): String {
        return "Animal(name='$name', color='$color', year=$year)"
    }

    companion object {
        var animals = arrayListOf<Animal>()

        fun addToAnimals(animal: Animal){
            animals.add(animal)
        }

        fun averageYear(): Double {
            var sum = 0
            for (animal in animals) {
                sum += animal.year
            }
            return sum.toDouble() / animals.size
        }

        fun averageYear2() : Double

        {
            return animals.map{ it.year }.sum().toDouble() / animals.size

        }

        fun lowestYear(): Int {
            val youngestAnimal = animals.minBy { it.year }
            return youngestAnimal.year
        }

        fun youngestAnimal(): Animal {
            val youngestAnimal = animals.minBy { it.year }
            return youngestAnimal
        }

        fun lowestYear2(): Int
        {
            return animals.map{it.year}.min()
        }

        fun highestYear(): Int {
            return animals.maxBy { it.year }.year
        }

        fun highestYear2(): Int
        {
            return animals.map{it.year}.max()
        }
    }
}

