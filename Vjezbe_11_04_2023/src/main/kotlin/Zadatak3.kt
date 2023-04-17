//3.Kreiraj polje i inicijaliziraj ga sa brojevima od 1 do 200.
//  a) Ispisi zbroj svih elemenata
//  b) Ispisi polje koje sadrzi udvostrucene elemente inicijalnog polja

fun main(){
    val generateField = Array(200){ i -> i + 1 }

    val add = generateField.sum()
    println("Zbroj je $add")

    val doubled = generateField.map{ it * 2 }
    println("Udvostruceno polje od prvog polja je $doubled")
}
