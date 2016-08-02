package ii_collections

import java.util.*

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

/*
 *  There are many operations that help to transform one collection into another, starting with 'to'
 */
fun example0(list: List<Int>): Pair<List<Int>, HashSet<Int>> {
    println("List: "+list.toString())
    list.toSet()
    println("List.toSet(): "+list.toSet().toString())
    val set = HashSet<Int>()
    list.to(set)
    println("List.to(set): "+list.to(set).toString())
    return list.to(set)
}

fun Shop.getSetOfCustomers(): Set<Customer> {
    // Return a set containing all the customers of this shop
    return this.customers.toSet()
}

