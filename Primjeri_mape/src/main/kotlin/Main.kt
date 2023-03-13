fun main(args: Array<String>) {
    //Skup key-value parova
    //Keys (kljucevi) su jedinstveni, vrijednosti (values) ne moraju biti jedinstvene

    val exampleMap = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))  //uređeni parovi
    println(exampleMap)

    var emptyMap = mapOf<Int, String>()
    print(emptyMap)

    //vrijednost mape za određeni ključ
    println(exampleMap[2])

    val exampleMap2 = mapOf(Pair(1.5, "one"), Pair(2.3, "two"), Pair(3.1, "three"))
    println(exampleMap2)
    println(exampleMap2[3.1])
    val exampleMap2Keys = exampleMap2.keys   //ovaj keys je tu set
    println(exampleMap2Keys)
    val exampleMap2Values = exampleMap2.values
    println(exampleMap2Values)

    //Hashmap
    println("----------HASHMAP------------")
    val exampleHashmap = hashMapOf(Pair(4, "four"), Pair(5, "five"), Pair(6, "six"))
    println(exampleHashmap)
    //dodavanje elemenata
    exampleHashmap[7] = "seven"
    println(exampleHashmap)
    //dodavanje druge mape
    exampleHashmap.putAll(exampleMap)
    println(exampleHashmap)
    //micanje elementa
    exampleHashmap.remove(7)
    println(exampleHashmap)
    exampleHashmap.clear()
    println(exampleHashmap)
    println(exampleHashmap.size)
    println(exampleHashmap.containsKey(2))
    println(exampleMap.containsValue("one"))

}