package ii_collections

fun example6(): Boolean {
    println(listOf(1, 5, 3).sum())
    return true
}

fun example6b(list: List<Int>): Int {
    return list.sum()
}

fun Customer.getTotalOrderPrice(): Double {
    // Return the sum of prices of all products that a customer has ordered.
    // Note: a customer may order the same product for several times.
    val products = orders.flatMap { it.products }
    return products.sumByDouble { it.price }
}
