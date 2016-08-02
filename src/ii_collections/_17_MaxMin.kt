package ii_collections

import ii_collections.data.customers
import ii_collections.data.orderedProducts
import v_builders.data.getProducts

fun example4(): Int? {
    val max = listOf(1, 42, 4).max()
    return max
}

fun example4b(): String? {
    val longestString = listOf("ac", "b").maxBy { it.length }
    return longestString
}

fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    // Return a customer whose order count is the highest among all customers
    return customers.maxBy { it.orders.size }
}

fun Customer.getMostExpensiveOrderedProduct(): Product? {
    // Return the most expensive product which has been ordered
    return orderedProducts.maxBy { it.price }
}
