class MyJavaClass internal constructor(name: String) {
    var name: String
    private val a = 0
    private val b = 0f
    private var c: Double
    private val d: Double
    private val myList: ArrayList<Double>

    init {
        println("Hi from primary constructor")
        this.name = name
        c = 32.4
        d = 32.4
        myList = ArrayList()
        myList.add(32.4)
    }

    internal constructor(name: String, c: Double) : this(name) {
        this.c = c
        println("Hi from secondary constructor")
    }

    fun sendArray(arr: IntArray) {
        for (i in arr.indices) {
            println(arr[i])
        }
    }

    fun sendArray2(arr: Array<Int>) {
        for (i in arr.indices) {
            println(arr[i].toByte())
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello")
        }
    }
}