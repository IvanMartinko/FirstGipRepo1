fun main(){
    zadatak14novo()
}

fun zadatak14novo() {
    val myStr = "Što je danas lijep i sunčan dan"
    val myChar = 'a'
    println(numOfOccurances(myStr, myChar))
}

fun numOfOccurances(myStr: String, myChar: Char): Int {
    return myStr.map { it -> if(it == myChar) 1 else 0 }.sum()
}
