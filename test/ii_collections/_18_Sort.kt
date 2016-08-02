package ii_collections

import ii_collections.data.shop
import ii_collections.data.sortedCustomers
import org.junit.Assert.*
import org.junit.Test

class _18_Sort {
    @Test fun shouldReturnTrue(){
        assertTrue(isSorted())
    }
    @Test fun shouldSortItsOwnList(){
        assertEquals(listOf("a", "cc", "bbb"), returnSorted())
    }
    @Test fun shouldSortMyList(){
        assertEquals(listOf("a", "543", "BBBBBB", "bnweruifew"), mySort(listOf("a", "BBBBBB", "543", "bnweruifew")))
    }

    @Test fun testGetCustomersSortedByNumberOfOrders() {
        assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
