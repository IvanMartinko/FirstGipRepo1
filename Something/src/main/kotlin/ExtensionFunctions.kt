fun main(){
    //Definirajte funkciju removeFirstLetter koja mice prvo slovo iz stringa i vraca takav string
    println("aaa".removeFirstLetter())
    //Implementirajte funkciju plusOne koja uvecava pedani int za 1
    var myInt = 5
    println(myInt.plusOne())
    val car = Car("Blue", "BMW", 2016)
    //Metoda printDetails ispisuje detalje auta u obliku:
    //"Details for car -> color: X, model: Y, year: Z"
    car.printDetails()
}

fun Car.printDetails() {
    println("Details of car -> color: ${this.color}, model: ${this.model}, year: ${this.year}")
}

fun Int.plusOne(): Int {
    return this + 1 //ili this.plus(1)
}

fun String.removeFirstLetter(): String{
    return this.substring(1)
}