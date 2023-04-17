open class Car {
    internal var model = "BMW"
    private fun drive(){
        println("$model is driving")
    }

    fun drive2(){
        drive()
    }
}