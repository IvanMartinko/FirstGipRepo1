fun main() {
    //Napravite nepromjenjivu listu stringova sa vrijednostima: spring, summer, fall, winter
    //ispisite ju i ispisite i elemente obrnutim redoslijedom
    val listOfStrings = listOf("spring", "summer", "fall", "winter")
    println(listOfStrings)
    println(listOfStrings.reversed())

    //Napravite praznu listu i ispiste ju
    //Provjerite je li ta lista prazna te ispiste rezultat
    val emptyList = arrayListOf<Int>()
    println(emptyList.isEmpty())
    //Nadodajte elemente 1, 2, 4
    //Promijenite prvi element u 8
    //Nadodajte element 6
    //Ispisite listu
    emptyList.add(1)
    emptyList.add(2)
    emptyList.add(4)
    emptyList[0] = 8
    emptyList.add(6)
    println(emptyList)
    //Na drugo mjesto dodajte element 7 i ispisi
    emptyList[1] = 7
    println(emptyList)   // moze bit i emptyList(1, 7)
    val emptyList2 = emptyList.toArray()
    for (i in 0 until emptyList2.size){
        println(emptyList2[i])
    }
    println(emptyList2)
    val array = arrayOf("black", "white", "green")
    val colorList = array.toMutableList()
    colorList.add("red")
    println(colorList)
    println(colorList.zip(listOfStrings))  // vraća listu parova,iz kolekcija
    val combined = listOf(colorList, listOfStrings) // nova lista s ostalim listama
    println(combined)
    println(combined.flatten()) //spaja ih ljepse




}