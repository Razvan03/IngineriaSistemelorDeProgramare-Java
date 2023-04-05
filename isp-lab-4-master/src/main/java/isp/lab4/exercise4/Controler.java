/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise4;


/**
 *
 * @author Razvan
 */



public class Controler {
    
    private TemperatureSensor[] temperatureSensor = new TemperatureSensor[3];
    
    private FireAlarm fireAlarm;
    
    public Controler(TemperatureSensor[] temperatureSensor, FireAlarm fireAlarm) {
        this.temperatureSensor = temperatureSensor;
        this.fireAlarm = fireAlarm;
    }
    
    
    public void controlStep() {
        
        for(int i=0; i<3; i++)
            if(temperatureSensor[i].getValue() > 50) {
                fireAlarm.setActive();
                System.out.println("Fire alarm started!!!");   
            }
            else
              System.out.println("Fire alarm not started.");    
    }
 
}
