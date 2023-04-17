abstract class Shape (var a: Int, var b: Int) {

    open fun sayHello(){
        println("Hello from Shape")
    }
    abstract fun calculateArea() : Int
}