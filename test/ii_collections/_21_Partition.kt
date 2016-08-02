package ii_collections

import ii_collections.data.customers
import ii_collections.data.*
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class _21_Partition {
    @Test fun shouldBeTheSame(){
        assertEquals(example8Before(), example8After())
    }
    @Test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        assertEquals(setOf(customers[reka], customers[lucas]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}
