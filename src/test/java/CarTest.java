import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car1;

    @Before
    public void before(){
        car1 = new Car(3500.00, "Volvo", "T6504");
    }

    @Test
    public void carHasAPrice(){
        assertEquals(3500.00, car1.getPrice(), 0.02);
    }

    // Check manufacturer
    @Test
    public void carHasaMake(){
        assertEquals("Volvo", car1.getMake());
    }

    @Test
    public void carHasAModel(){
        assertEquals("T6504", car1.getModel());
    }

}

