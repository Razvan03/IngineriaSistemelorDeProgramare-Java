/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author Razvan
 */


public class ControlerTest {
    @Test
    public void testToString() {
       
        FireAlarm f1 = new FireAlarm(false);
        TemperatureSensor t1 = new TemperatureSensor(10, "Cluj Napoca");
        Controler c1 = new Controler(t1, f1);
       
        c1.controlStep();
        assertEquals("Should be equal.", false, f1.isActive());
        
    }
}
