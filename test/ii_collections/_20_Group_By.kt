package ii_collections

import ii_collections.data.groupedByCities
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class _20_Group_By {
    @Before fun init(){
        example7()
    }
    @Test fun testGroupCustomersByCity() {
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
