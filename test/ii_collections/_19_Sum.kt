package ii_collections

import ii_collections.data.customers
import ii_collections.data.lucas
import ii_collections.data.nathan
import org.junit.Assert.*
import org.junit.Test

class _19_Sum {
    @Test fun shouldBeTrue(){
        assertTrue(example6())
    }

    @Test fun shouldReturnSumOfList(){
        assertEquals(80,example6b(listOf(50,9,21)))
    }

    @Test fun testGetTotalOrderPrice() {
        assertEquals(148.0, customers[nathan]!!.getTotalOrderPrice(), 0.001)
    }

    @Test fun testTotalPriceForRepeatedProducts() {
        assertEquals(586.0, customers[lucas]!!.getTotalOrderPrice(), 0.001)
    }
}
