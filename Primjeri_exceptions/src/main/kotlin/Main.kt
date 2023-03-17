fun main(args: Array<String>) {
    println("Input a number: ")
    val input = readLine()
    try {
        println(input?.toDouble())
    } catch (e: Exception){
        println("An exception has occurred!")
        e.printStackTrace()
    } finally {
        println("The execution has completed")
    }

    val input2 = readLine()
    if ("".equals(input2)){
        throw Exception("Wrong input")
    }
    println("Im done")

    //Unesite broj kuna, ispisite kolko je to eura, te uhvatite iznimku ukoliko se input parametar ne moze konvertirat
    //u double
    println("Upiši kune: ")
    val kune = readLine()
    try {
        println(kune?.toDouble()?.div(7.5354))
    } catch(e: Exception){
        println("An exception has occurred!")
        e.printStackTrace()
    } finally {
        println("The execution has completed")
    }

    val a: Int? = try {
        "3.45".toInt()              //rjesenje je null jer ne zna prebacit 3.45 u int
    } catch (e: Exception){
        null
    }
    println(a)
}