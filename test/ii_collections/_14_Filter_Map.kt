package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class _14_Filter_Map {
    @Test fun shouldOnlyReturnPositiveNumbers(){
        assertEquals(arrayListOf(5, 2, 10), example1PositiveNumbers(arrayListOf(5, 2, 10, -5, 0)))
    }

    @Test fun shouldOnlyReturnSquares(){
        assertEquals(arrayListOf(4,81,100), example1Squares(arrayListOf(2,9,10)))
    }

    @Test fun testCitiesCustomersAreFrom() {
        assertEquals(setOf(Canberra, Vancouver, Budapest, Ankara, Tokyo), shop.getCitiesCustomersAreFrom())
    }

    /**
     * Returns the list of the customers who live in the city 'city'
     */
    @Test fun testCustomersFromCity() {
        assertEquals(listOf(customers[lucas], customers[cooper]), shop.getCustomersFrom(Canberra))
    }
}
