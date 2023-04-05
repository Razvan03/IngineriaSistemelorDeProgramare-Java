/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Razvan
 */

public class ControlerTest {
    @Test
    public void testToString() {
       
        TemperatureSensor[] t1 = new TemperatureSensor[3];
     
        t1[0] = new TemperatureSensor(11, "cbjdwkjc");
        t1[1] = new TemperatureSensor(67, "dewcfr");
        t1[2] = new TemperatureSensor(1, "w2w2wd");

        FireAlarm f1 = new FireAlarm(true);
        Controler c1 = new Controler(t1, f1);

        c1.controlStep();
        
        assertEquals("Should be equal.", true, f1.isActive());
        
    }
}
