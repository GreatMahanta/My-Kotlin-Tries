import java.util.Arrays

fun main(args: Array<String>) {

    val cart = mutableMapOf<ClothingItem, Int>()

    cart.put(ClothingItem("Shirt", "XL", 19.99), 2)
    cart.put(ClothingItem("Pant", "39", 12.99), 4)
    cart.put(ClothingItem("Hat", "8.5", 16.43), 1)
    cart.put(ClothingItem("Scarf", "23", 18.54), 3)


    var myPrintMap = ""
    var totalValue = 0.0

    for ((cartValue, quantity) in cart) {
        myPrintMap += "ClothingItem(type=${cartValue.type}, size=${cartValue.size}, price=${cartValue.price}) = $quantity, "
    }

    println("{$myPrintMap}")

    for ((cartValue, quantity) in cart) {
        println("Item ${cartValue.type} @ ${cartValue.price} = ${cartValue.price * quantity}")
        totalValue += (cartValue.price * quantity)
    }
    println("-----------------------")

    println("Total : $totalValue")



}