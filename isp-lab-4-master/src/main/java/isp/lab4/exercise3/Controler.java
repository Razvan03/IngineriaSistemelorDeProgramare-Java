/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise3;

/**
 *
 * @author Razvan
 */



public class Controler {
    
    private TemperatureSensor temperatureSensor;
    
    private FireAlarm fireAlarm;
    
    public Controler(TemperatureSensor temperatureSensor, FireAlarm fireAlarm) {
        this.temperatureSensor = temperatureSensor;
        this.fireAlarm = fireAlarm;
    }
    
    
    public void controlStep() {
        if(temperatureSensor.getValue() > 50) {
            fireAlarm.setActive();
            System.out.println("Fire alarm started!!!");   
        }
        else
           System.out.println("Fire alarm not started.");    
    }
    
    
    
}
