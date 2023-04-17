fun main(){
    zadatak2(15, 10)
}

fun zadatak2(num1: Int, num2: Int) {
    val smallerNum = if(num1 < num2) num1 else num2

    val biggerNum = if(num1 > num2) num1 else num2

    for(num in smallerNum..biggerNum){
        println(num)
    }
}
