package ii_collections

import ii_collections.data.orderedProducts
import java.util.*

fun example8Before(): Pair<List<Int>, List<Int>> {
    val positive = listOf(1, 3, 2)
    val negative = listOf(-4, -11)
    return Pair(positive, negative)
}

fun example8After(): Pair<List<Int>, List<Int>> {
    val initialNumbers = listOf(1, 3, -4, 2, -11)
    // The details (how multi-assignment works) will be explained later in the 'Conventions' task
    val (positive, negative) = initialNumbers.partition { it > 0 }
    return Pair(positive, negative)

}

fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    // Return customers who have more undelivered orders than delivered
    val orderDelivered: (Order) -> Boolean{ it.isDelivered }
    return customers.filter {
        val (isDelivered, isNotDelivered) = it.orders.partition { it.isDelivered }
        return true
    }.toSet()
    
}
