package ii_collections

import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.*

fun example2(list: List<Int>) {
    val isZero: (Int) -> Boolean = { it == 0 }
    val hasZero: Boolean = list.any(isZero)
    println(hasZero)
    val allZeros: Boolean = list.all(isZero)
    println(allZeros)
    val numberOfZeros: Int = list.count(isZero)
    println(numberOfZeros)
    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
    println(firstPositiveNumber)
}

fun Customer.isFrom(city: City): Boolean {
    // Return true if the customer is from the given city
    return if(this.city == city) true else false
}

fun Customer.isFromCity(city: City): (Customer) -> Boolean {
    // Return true if the customer is from the given city
    return { it.city == city }
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    // Return true if all customers are from the given city
    val isFrom: (Customer) -> Boolean = { it.city == city }
    return customers.all(isFrom)
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    // Return true if there is at least one customer from the given city
    val isFrom: (Customer) -> Boolean = { it.city == city }
    return customers.any(isFrom)
}

fun Shop.countCustomersFrom(city: City): Int {
    // Return the number of customers from the given city
    val isFrom: (Customer) -> Boolean = { it.city == city }
    return customers.count(isFrom)
}

fun Shop.findAnyCustomerFrom(city: City): Customer? {
    // Return a customer who lives in the given city, or null if there is none
    val isFrom: (Customer) -> Boolean = { it.city == city }
    return customers.firstOrNull(isFrom)
}
