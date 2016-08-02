package ii_collections

fun isSorted(): Boolean {
    val result = listOf("a", "bbb", "cc").sortedBy { it.length }
    return (result == listOf("a", "cc", "bbb"))
}

fun returnSorted(): List<String> {
    return listOf("a", "bbb", "cc").sortedBy { it.length }
}

fun mySort(list: List<String>): List<String> {
    return list.sortedBy { it.length }
}

fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> {
    // Return a list of customers, sorted by the ascending number of orders they made
    return customers.sortedBy { it.orders.size }
}
