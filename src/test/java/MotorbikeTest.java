import Vehicles.Motorbike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

    Motorbike motorbike1;

    @Before
    public void before(){
        motorbike1 = new Motorbike(1350.00, "Honda", "Monkey");
    }

    @Test
    public void motorbikeHasAPrice(){
        assertEquals(1350.00, motorbike1.getPrice(), 0.02);
    }

    // Check manufacturer
    @Test
    public void motorbikeHasaMake(){
        assertEquals("Honda", motorbike1.getMake());
    }

    @Test
    public void motorbikeHasAModel(){
        assertEquals("Monkey", motorbike1.getModel());
    }
}
