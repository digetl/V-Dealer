import Vehicles.Bus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus1;

    @Before
    public void before(){
        bus1 = new Bus(3950.00, "Ford", "Transit100");
    }

    @Test
    public void busHasAPrice(){
        assertEquals(3950.00, bus1.getPrice(), 0.02);
    }

    // Check manufacturer
    @Test
    public void busHasaMake(){
        assertEquals("Ford", bus1.getMake());
    }

    @Test
    public void busHasAModel(){
        assertEquals("Transit 100", bus1.getModel());
    }

}
