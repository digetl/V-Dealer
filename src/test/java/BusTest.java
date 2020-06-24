import Vehicles.Bus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus1;

    @Before
    public void before(){
        bus1 = new Bus(3950.00);
    }

    @Test
    public void busHasAPrice(){
        assertEquals(3950.00, bus1.getPrice(), 0.02);
    }

}
