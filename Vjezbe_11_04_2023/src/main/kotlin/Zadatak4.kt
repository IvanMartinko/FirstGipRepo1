//4. Kreiraj klasu "Zivotinja" koja ima svojstva:
// ime tipa String
// boja tipa String
// starost tipa Int
//te funkcije "hodaj", "stani" koje nemaju definirano ponasanje.
// Kreiraj klase "Patka" i "Pas" koje nasljeduju klasu "Zivotinja" i definiraj proizvoljno sve metode koje su potrebne.
//Na klasi "Zivotinja" kreiraj funkcije koje izracunavaju prosjecnu, najmanju i najvecu starost unesenih zivotinja.
//Kreiraj 5 zivotinja i ispisi prosjecnu, najmanju i najvecu starost unesenih zivotinja.

fun main(){
    val p1 = Patka("Patka 1", "bijela", 4)
    val p2 = Patka("Patka 2", "bijela", 2)
    val p3 = Patka("Patka 3", "bijela", 6)
    val p4 = Pas("Pas 1", "crn", 5)
    val p5 = Pas("Pas 2", "bijel", 7)
    println(Animal.lowestYear())
    println(Animal.lowestYear2())
    println(Animal.highestYear())
    println(Animal.highestYear2())
    println(Animal.averageYear())
    println(Animal.averageYear2())
    println(Animal.youngestAnimal())
    p1.walk()
    p4.walk()
}