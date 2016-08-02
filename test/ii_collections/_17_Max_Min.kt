package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class _17_Max_Min {
    @Test fun shouldReturn42(){
        assertEquals(42, example4())
    }

    @Test fun shouldReturnLongestString(){
        assertEquals("ac", example4b())
    }

    @Test fun testCustomerWithMaximumNumberOfOrders() {
        assertEquals(customers[reka], shop.getCustomerWithMaximumNumberOfOrders())
    }

    @Test fun testTheMostExpensiveOrderedProduct() {
        assertEquals(rubyMine, customers[nathan]!!.getMostExpensiveOrderedProduct())
    }
}
