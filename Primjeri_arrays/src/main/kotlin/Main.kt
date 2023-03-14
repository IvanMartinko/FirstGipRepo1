fun main(args: Array<String>) {
    //Arrays
    val names = arrayOf("Renato", "Mateja", "Antonija")
    println(names[0])
    names[0] = "Ivan"  //muteable je, moze se mijenjati
    println(names[0])

    val names2 = arrayOf("Renato", "Mateja", "Antonija")

    val intArr = intArrayOf(1, 2, 3) //primitives
    val intVals2 = arrayOf(1, 2, 3)
    varargDemo(*intArr)
    varargDemo(*intVals2.toIntArray())
    varargDemo(x = intVals2.toIntArray())

    val generatedArray = Array(5){0}
    println(generatedArray.joinToString(prefix = "[", separator = ", ", postfix = "]" ))

    val generatedArray2 = Array(100){i -> i + 1}
    println(generatedArray2.joinToString(prefix = "[", separator = ", ", postfix = "]" ))
    println(generatedArray2.sum())

    //ili
    println(Array(100){i -> i + 1}.sum())

    //
    val names4 = arrayOf("Renato", "Lucija", null, 2)
    varargDemo2(*names)
}

fun varargDemo(vararg x: Int){
    for(elem in x){
        print("$elem ")
    }
    println()
}

fun varargDemo2(vararg x: String) {
    for (elem in x) {
        print("$elem ")
    }
    println()
}