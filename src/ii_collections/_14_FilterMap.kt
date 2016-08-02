package ii_collections

import java.util.*

fun example1PositiveNumbers(list: List<Int>): List<Int> {
    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }
    return positiveNumbers
}

fun example1Squares(list: List<Int>): List<Int> {
    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val squares = list.map { it * it }
    return squares
}

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    // Return the set of cities the customers are from
    val cities = ArrayList<City>()
    for(customer in customers){
        cities.add(customer.city)
    }

    return cities.toSet()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    // Return a list of the customers who live in the given city
    val customersFromCity = ArrayList<Customer>()
    for(customer in customers){
        if(customer.city == city){
            customersFromCity.add(customer)
        }
    }
    return customersFromCity.toList()
}


