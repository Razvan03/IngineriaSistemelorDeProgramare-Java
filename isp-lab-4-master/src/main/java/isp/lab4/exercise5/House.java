/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise5;

/**
 *
 * @author Razvan
 */
public class House {
    private Controler controler;
    
    public House(Controler controler) {
        this.controler = controler;
    }
    
    public Controler getControler() {
        return controler;
    }
}

class Controler {
    
    private TemperatureSensor[] temperatureSensor;
    private FireAlarm fireAlarm;
    
    
    public Controler() {
        
        temperatureSensor = new TemperatureSensor[3];
        temperatureSensor[0] = new TemperatureSensor(11, "cbjdwkjc");
        temperatureSensor[1] = new TemperatureSensor(67, "dewcfr");
        temperatureSensor[2] = new TemperatureSensor(1, "w2w2wd");
        fireAlarm = new FireAlarm(false);
        
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
