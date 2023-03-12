package isp.lab4.exercise1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author mihai.hulea
 */

public class TemperatureSensorTest {
    TemperatureSensor termometru = new TemperatureSensor(5,"Cluj");
     @Test
    public void testAdd() {
        assertEquals("Should return the value", 5, termometru.getValue());
    }

    @Test
    public void testSubstract() {
        assertEquals("Should return the location", "Cluj", termometru.getLocation());
    }
}
