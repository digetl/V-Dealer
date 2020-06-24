import Customers.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer1;
    ArrayList vehicles;

    @Before
    public void before(){
        customer1 = new Customer ("Janine", 07561, 5000.00);
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

    @Test
    public void phoneNumberCantBeNull(){
        customer1.setName(null);
        customer1.setName("");
        assertEquals(07561, customer1.getPhoneNumber());
    }

    @Test
    public void phoneNumberCantBeString(){
        customer1.setName("Bob");
        assertEquals(07561, customer1.getPhoneNumber());
    }

    @Test
    public void hasMoney() {
        assertEquals(5000.00, customer1.getMoney(), 0.02);
    }

    @Test
    public void canSpendMoney__canAfford() {
        customer1.spendMoney(1000.00);
        assertEquals(4000, customer1.getMoney(), 0.02);
    }

    @Test
    public void canSpendMoney__cantAfford(){
        customer1.spendMoney(5500);
        assertEquals(5000, customer1.getMoney(), 0.02);
    }

    @Test
    public void hasNoVehiclesToStart() {
        assertEquals(0, customer1.countVehicles());
    }

}
