package ii_collections

import ii_collections.data.customers
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.*

class _13_Introduction {
    @Test fun shouldCreateTupleOfIntegersAndEmptySet(){
        val array = arrayListOf(4, 8, 3)
        val set = HashSet<Int>()
        assertEquals(array, example0(array).first)
        assertEquals(set, example0(array).second)
    }

    @Test fun testSetOfCustomers() {
        assertEquals(customers.values.toSet(), shop.getSetOfCustomers())
    }
}
