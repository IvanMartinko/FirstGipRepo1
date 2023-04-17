class Car(val color: String, val model: String, val year: Int) {
    override fun toString(): String {
        return "Car [color = $color, model = $model, year = $year]"
    }

    operator fun component1() = color

    operator fun component2() = model

    operator fun component3() = year

}