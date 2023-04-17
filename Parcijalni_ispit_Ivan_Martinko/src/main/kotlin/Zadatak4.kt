//Kreiraj sučelje "Drivable" koje ima dvije apstraktne metode "vozi" i "stani". Kreiraj klase "Romobil" i "Bicikl" koje
//implementiraju sučelje "Drivable" i njegove metode. Metode trebaju ispisati naziv klasi + "vozi/zaustavlja" se ovisno
//o klasi koja implementira sučelje
fun main(){
    val romobil = Romobil()
    val bicikl = Bicikl()

    romobil.vozi()
    romobil.stani()
    bicikl.vozi()
    bicikl.stani()
}