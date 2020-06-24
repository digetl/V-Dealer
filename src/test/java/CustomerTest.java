import Customers.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer1;

    @Before
    public void before(){
        customer1 = new Customer ("Janine", "07545", 5000);
    }

    @Test
    public void customerHasName(){
        assertEquals("Janine", customer.getName);
    }
}
