import Customers.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer1;

    @Before
    public void before(){
        customer1 = new Customer ("Janine", 07561);
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

    @Test
    public void customerCantHaveNullName(){
        customer1.setName(null);
        customer1.setName("");
        assertEquals("Janine", customer1.getName());
    }
    
    @Test
    public void customerHasPhoneNumber(){
        assertEquals(07561, customer1.getPhoneNumber());
    }

    @Test
    public void canSetCustomerPhoneNumber(){
        customer1.setPhoneNumber(07001);
        assertEquals(07001, customer1.getPhoneNumber());
    }
}
