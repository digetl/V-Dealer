import Customers.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer1;

    @Before
    public void before(){
        customer1 = new Customer ("Janine");
    }

    @Test
    public void customerHasName(){
        assertEquals("Janine", customer1.getName());
    }

    @Test
    public void canSetName(){
        customer1.setName("Jenny");
        assertEquals("Jenny", customer1.getName());
    }
}
