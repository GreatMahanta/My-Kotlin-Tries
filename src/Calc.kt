import java.lang.Exception

fun addValues(num1: Double, num2: Double): Double {
    return num1 + num2
}

fun subtractValues(num1: Double, num2: Double): Double {
    return num1 - num2
}

fun multiplyValues(num1: Double, num2: Double): Double {
    return num1 * num2
}

fun divideValues(num1: Double, num2: Double): Double {
    return num1 / num2
}

fun main(args: Array<String>) {

    try {
        print("Number 1: ")
        val param1 = readLine()
        val num1 = param1!!.toDouble()

        print("Number 2: ")
        val param2 = readLine()
        val num2 = param2!!.toDouble()

        print("Please Enter Operator ( + - * / ) ")
        val operator = readLine()

        val result = when (operator) {

            "+" -> addValues(num1, num2)
            "-" -> subtractValues(num1, num2)
            "*" -> multiplyValues(num1, num2)
            "/" -> divideValues(num1, num2)
            else -> println("Unknown Operator")
        }

        if (result != Unit) {
            println("The Result is ${result}")
        }

    } catch (e: KotlinNullPointerException) {
        println("${e.message} means ${e.cause} and 'Not Allowed'")

    } catch (e: NumberFormatException) {
        println("${e.message} is ${e.cause}")
    }


}