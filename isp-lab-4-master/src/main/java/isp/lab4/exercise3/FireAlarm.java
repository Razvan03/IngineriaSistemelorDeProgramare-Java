/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise3;

/**
 *
 * @author Razvan
 */
public class FireAlarm {
    
    private boolean active;
    
    public FireAlarm(boolean active) {
        this.active = active;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public void setActive() {
        active = true;
    }
    
    public void setActiveFalse()
    {
        active = false;
    }
    
    @Override
    public String toString() {
        return String.valueOf("Fire Alarm is set on: " + active);
    }
    
    
    
    
}
