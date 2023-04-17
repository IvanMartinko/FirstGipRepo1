fun main(){
    zadatak15novo()
}

fun zadatak15novo() {
    val palindrome = "anavolimilovana"
    println(isPalindrom(palindrome))
}

fun isPalindrom(palindrome: String): Boolean {
    var i = 0
    var j = palindrome.length - 1
    while(i < j){
        if(palindrome[i] != palindrome[j - i]){
            println("This is not a palindrome")
            return false
        }
        i++
    }
    println("This is a palindrome")
    return true

}
