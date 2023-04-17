fun main(){
    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
    2 to Car("red", "Ford", 2016),
    3 to Car("silver", "Honda", 2013),
    17 to Car("red", "BMW", 2015),
    8 to Car("green", "Ford", 2010))

    //Ispisite samo elemente mape kojima je model auta "Ford"
    println(immutableMap.filter { it.value.model == "Ford" })
    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color })
    val myMapResult = immutableMap.filter { it.value.model == "Ford"}.map { it.value.model.uppercase() }.toMutableList()
    println(myMapResult)
    myMapResult.add("HONDA")
    println(myMapResult)
    val myList = listOf("Marry","Jane","Joe")
    println(myList.map{
        println("mapping $it")
        it.uppercase()
    }.filter{
        println("filtering $it")
        it[0] == 'J'
    }.find{
        it.endsWith("E")
    })


    //klasican nacin




}