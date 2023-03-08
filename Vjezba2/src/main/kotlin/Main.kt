fun main(args: Array<String>) {
    //Zadatak 1: napravite cjelobrojnu varijablu i ispisite ju - potvrdi da je cjelobrojna

    var number: Int = 20
    println("Class ${number::class.java}")

    //Zadatak 2: napravite long varijablu i ispisi
    var number1: Long = 64
    println("Class ${number1::class.java}")

    //Zadatak 3: napravite long varijablu bez eksplicitnog def tipa
    var num2 = 42L
    println("Class ${num2::class.java}")

    //Zadatak 4: definiraj dvije cjelobrojne varijable i provedite osnovne aritmeticke operacije nad njima, ispisi rezultat
    var num3 = 5
    var num4 = 2
    println(num3 + num4)
    println(num3 - num4)
    println(num3 * num4)
    println(num3 / num4)
    println(num3 % num4)
    val num5 = (num3 / num4).toDouble()  //da bude decimala dosta je pretvorit jedan broj u double
    println(num5)

    println("------------------------------------")


    //Zadatak 5: definirajte jednu cjelobrojnu varijablu i jednu realnu te provedite osnovne..
    val num6 = 5.0
    val num7 = 2
    println(num6 + num7)
    println(num6 - num7)
    println(num6 * num7)
    println(num6 / num7)
    println(num6 % num7)
    println((num6 / num7)::class.java)

    println("------------------------------------------------------------------------------------------")


    //inkrement, dekrement, operatori usporedivanja
    println(5 > 2)
    println(5 < 2)
    println(5 == 5)
    println(5 <= 4)
    println(5 >= 4)
    println(5 != 4)

    var a = 5
    var b = ++a  //tu je 5, tu je a 6
    println("b = $b")
    println("a = $a")
    println("--------------------------------------")

    b = b + 1
    println(b)
    b += 1
    println(b)

//    b = b - 1 // isto ko i b -= 1
//    b = b * 2 // isto ko i b *= 2
//    b = b / 2 // isto ko i b /= 2
//    b = b % 2 // isto ko i b %= 2




}