package ii_collections

fun example9(): Int {
    val result = listOf(1, 2, 3, 4).fold(1, { partResult, element -> element * partResult })
    return result
}

// The same as
fun whatFoldDoes(): Int {
    var result = 1
    listOf(1, 2, 3, 4).forEach { element -> result *= element}
    return result
}

fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    // Return the set of products ordered by every customer
    return customers.fold(allOrderedProducts, {
        orderedByAll, customer ->
        todoCollectionTask()
    })
}
