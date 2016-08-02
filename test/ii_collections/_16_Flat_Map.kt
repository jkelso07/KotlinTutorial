package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class _16_Flat_Map {
    @Before fun init(){
        example()
    }

    @Test fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}
