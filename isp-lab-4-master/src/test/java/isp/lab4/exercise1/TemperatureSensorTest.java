package isp.lab4.exercise1;

import isp.lab4.exercise1.TemperatureSensor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author Razvan
 */

public class TemperatureSensorTest {
    //implement minimal tests
     @Test
    public void testToString() {
       
        TemperatureSensor t1 = new TemperatureSensor();
        TemperatureSensor t2 = new TemperatureSensor(10, "Cluj Napoca");
        
        assertEquals("Should be equal.", "10 Cluj Napoca", t2.toString());

        assertEquals("Should be equal.", "0 here", t1.toString());
    }
}
