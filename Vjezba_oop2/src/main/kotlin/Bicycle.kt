open class Bicycle (open var color: String){

    open fun ride(){
        println("Bicycle with color $color is riding")
    }

    open fun stop(){
        println("Bicycle with color $color is stopped")
    }

    open fun repair(){
        println("Bicycle with color $color is repairing")
    }
}