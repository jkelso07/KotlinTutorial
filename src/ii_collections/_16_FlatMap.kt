package ii_collections

import ii_collections.data.customers
import ii_collections.data.orderedProducts
import v_builders.data.getProducts
import java.util.*

fun example() {
    val result = listOf("abc", "12").flatMap { it.toList() }
    val result2 = listOf("abc", "12").toList()
    println(result)
    println(result2)
    result == listOf('a', 'b', 'c', '1', '2')
    println(result)
}

val Customer.orderedProducts: Set<Product> get() {
    // Return all products ordered by customer
    return orders.flatMap { it.products }.toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    // Return all products that were ordered by at least one customer
    return customers.flatMap { it.orderedProducts }.toSet()
}
