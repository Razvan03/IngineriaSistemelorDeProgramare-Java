/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise2;

import isp.lab4.exercise2.FireAlarm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author Razvan
 */


public class FireAlarmTest {
    @Test
    public void testToString() {
       
        FireAlarm f1 = new FireAlarm(true);
        FireAlarm f2 = new FireAlarm(false);
        
        assertEquals("Should be equal.", true, f1.isActive());
        assertEquals("Should be equal.", false, f2.isActive());
        
        f2.setActive();
        
        assertEquals("Should be equal.", true, f2.isActive());
        assertEquals("Should be equal.", "Fire Alarm is set on: true", f2.toString());
    }
}
