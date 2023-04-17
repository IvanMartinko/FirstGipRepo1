import kotlin.random.Random

class SoundBoard {
    fun generateSound(): Animal {
        val randomNumber = Random.nextInt(10)
        return when (randomNumber) {
            in 1..3 -> Dog()
            in 4..6 -> Cat()
            else -> Parrot()
        }
    }
}
