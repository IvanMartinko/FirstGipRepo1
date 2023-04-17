//Kreiraj klasu "Vozilo" koja ima svojstva boja i godište te funkcije "vozi", "parkiraj", "ubrzaj" i
//"zaustavi se", koje nemaju definirano ponašanje. Kreiraj klase "Automobil" i "Kamion" koje nasljeđuju klasu
//"Vozilo" i definiraj proizvoljno sve metode koje su potrebne. Na klasi "Automobil kreiraj funkcije koje izračunavaju
//prosječno, najmanje i najveće godište svih kreiranih automobila. Kreiraj 5 automobila i ispiši prosječno, najmanje i
//najveće godište kreiranih automobila

fun main(){
    val automobil1 = Automobil("crna", 1998)
    val automobil2 = Automobil("crvena", 2005)
    val automobil3 = Automobil("plava", 2006)
    val automobil4 = Automobil("bijela", 2009)
    val automobil5 = Automobil("siva", 2022)

    Automobil.automobili.add(automobil1)
    Automobil.automobili.add(automobil2)
    Automobil.automobili.add(automobil3)
    Automobil.automobili.add(automobil4)
    Automobil.automobili.add(automobil5)

    println("Prosječno godište je ${Automobil.prosjecnoGodiste()}")
    println("Najmanje godište je ${Automobil.najmanjeGodiste()}")
    println("Najveće godište je ${Automobil.najveceGodiste()}")
}