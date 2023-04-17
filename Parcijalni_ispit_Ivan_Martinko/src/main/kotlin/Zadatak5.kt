//Kreiraj polje i inicijaliziraj ga sa prvih 100 parnih brojeva. Ispiši zbroj svih brojeva. Ispiši srednju
//vrijednost prvih 100 parnih brojeva

fun main(){
    val poljeParnih = Array(100){i -> (i + 1) * 2}

    val zbroj = poljeParnih.sum()
    println(zbroj)

    val srednjaVrijednost = zbroj.toDouble() / poljeParnih.size
    println(srednjaVrijednost)




}