package ii_collections

import ii_collections.data.*
import ii_collections.shopBuilders.customer
import ii_collections.shopBuilders.order
import ii_collections.shopBuilders.shop
import org.junit.Assert.assertEquals
import org.junit.Test


class _22_Fold {
    @Test fun shouldReturn24(){
        assertEquals(24, example9())
    }
    @Test fun shouldAlsoReturn24(){
        assertEquals(24, whatFoldDoes())
    }
    @Test fun shouldProduceSameAnswer(){
        assertEquals(example9(), whatFoldDoes())
    }
    @Test fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'") {
            customer(lucas, Canberra) {
                order(idea)
                order(webStorm)
            }
            customer(reka, Budapest) {
                order(idea)
                order(youTrack)
            }
        }
        assertEquals(setOf(idea), testShop.getSetOfProductsOrderedByEveryCustomer())
    }
}
