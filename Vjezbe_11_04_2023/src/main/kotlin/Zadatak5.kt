//5. Kreiraj sucelje "Glasanje" koje ima apstraktnu metodu glasajSe(). Kreiraj klase "Macka" i "Papiga" koje implementiraju
//sucelje "Glasanje" i njenu metodu glasajSe(). Metoda treba ispisati "Macka/Papiga se glasa"
fun main(){
    val macka = Macka()
    val papiga = Papiga()
    macka.glasajSe()
    papiga.glasajSe()
}