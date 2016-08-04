package ii_collections

import ii_collections.data.orderedProducts

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    // Return the set of customers who ordered the specified product
    return customers.filter { it.orderedProducts.contains(product) }.toSet()
}

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    // Return the most expensive product among all delivered products
    // (use the Order.isDelivered flag)
    val deliveredOrders = orders.filter { it.isDelivered }
    return deliveredOrders.flatMap { it.products }.toSet().maxBy { it.price }
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    // Return the number of times the given product was ordered.
    // Note: a customer may order the same product for several times.
    val isProduct: (Product) -> Boolean = { it == product }
    customers.flatMap { it.orders.flatMap { it.products } }.count(isProduct)
    return customers.flatMap { it.orders.flatMap { it.products } }.count(isProduct)
}
