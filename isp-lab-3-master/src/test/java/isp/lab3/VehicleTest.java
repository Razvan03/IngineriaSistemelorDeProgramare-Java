/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3;

import isp.lab3.exercise3.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author Antonia
 */
public class VehicleTest {
    @Test
    public void testToString() {
        Vehicle v1 = new Vehicle("â€œ5SERIES", "BMW", 250, 'D');
        
        assertEquals("Should be equal.", "â€œ5SERIES (BMW) speed 250 fuel type Dâ€", v1.toString());
    }
    
}
