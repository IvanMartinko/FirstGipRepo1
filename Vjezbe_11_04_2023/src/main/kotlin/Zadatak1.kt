//1. Kreiraj funkciju koja kao parametre prima:
//dan -> cijeli broj
//mjesec -> cijeli broj
// godinu -> cijeli broj
//te ispisuje:
//"Uneseni datum je dan.mjesec.godina."
//Testni primjer:
//unos: 25,9,1995
//rezultat: "Uneseni datum je 25.9.1995."

//DODATNO: ispisite ime mjeseca umjesto rednog broja mjeseca
//rezultat za gornji testni primjer: "Uneseni datum je 25. rujan 1995."

fun main() {
    println(danMjesecGodina(25, 10, 1995))
    println(danMjesecGodina2(25,10, 1995))
    println(danMjesecGodina3(25,4, 1995))
    println(danMjesecGodina4(25,4, 1995))
}

fun danMjesecGodina(dan: Int, mjesec: Int, godina: Int) : String {
    return "Uneseni datum je: $dan.$mjesec.$godina."
}

fun danMjesecGodina2(dan: Int, mjesec: Int, godina: Int) : String {
    val month = when(mjesec){
        1 -> "sijecanj"
        2-> "veljaca"
        3-> "ozujak"
        4-> "travanj"
        5-> "svibanj"
        6-> "lipanj"
        7 -> "srpanj"
        8-> "kolovoz"
        9-> "rujan"
        10-> "listopad"
        11-> "studeni"
        12-> "prosinac"
        else-> ""
    }
    return "Uneseni datum je $dan. $month $godina."
}

fun danMjesecGodina3(dan: Int, mjesec: Int, godina: Int) : String {
    val months = arrayOf("sijecanj", "veljaca", "ozujak", "travanj", "svibanj", "lipanj") //itd
    return "Uneseni datum je $dan. ${months[mjesec-1]} $godina."
}

fun danMjesecGodina4(dan: Int, mjesec: Int, godina: Int) : String {
    val monthsMap = mapOf<Int, String>(1 to "sijecanj", 2 to "veljaca", 3 to "ozujak", 4 to "travanj") //itd
    return "Uneseni datum je $dan. ${monthsMap[mjesec]} $godina."
}