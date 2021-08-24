import java.lang.NumberFormatException

fun result(num1 : Double, num2 : Double, operation : Char?){
when(operation){
    '+' -> println("result : ${num1+num2}")
    '-' -> println("result : ${num1-num2}")
    '*' -> println("result : ${num1*num2}")
    '/' -> println("result : ${num1/num2}")
}
}
fun equa(input : String) {
    var num1: String = "";
    var num2: String = "";
    var operation: Char? = null

    for (i in input) {
        if (operation == null) {
            if (i.isDigit()) {
                num1 += i
            } else if (i == '.') {
                num1 += i
            } else if (i == '+' || i == '-' || i == '/' || i == '*') {
                operation = i
            } else {
                println("equation is not correct")
                System.exit(0)
            }
        } else {
            if (i.isDigit()) {
                num2 += i
            } else if (i == '.') {
                num2 += i
            }else
            {
                println("equation is not correct")
                System.exit(0)
            }
        }
    }
    try{
    result(num1 = num1.toDouble() , num2= num2.toDouble() , operation=operation)
}catch (e:NumberFormatException){
    println("equation is not correct")
}
}

fun main(){
    print("enter the the equation"+ "\n")
    var input : String? = readLine()
    if (input == ""){
        print("please , enter an  equation")
    }else
    {
equa(input.toString())
    }
}