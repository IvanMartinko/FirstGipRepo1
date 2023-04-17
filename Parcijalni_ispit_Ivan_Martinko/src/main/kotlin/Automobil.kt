class Automobil(boja: String, godiste: Int) : Vozilo(boja, godiste) {
    companion object {
        var automobili = arrayListOf<Automobil>()

        fun prosjecnoGodiste(): Double {
            var sum = 0
            for (automobil in automobili) {
                sum += automobil.godiste
            }
            return sum.toDouble() / automobili.size
        }


        fun najveceGodiste(): Int {
            val najnovijiAutomobil = automobili.maxBy { it.godiste }
            return najnovijiAutomobil.godiste
        }

        fun najmanjeGodiste(): Int {
            val najstarijiAutomobil = automobili.minBy { it.godiste }
            return najstarijiAutomobil.godiste
        }

    }
}