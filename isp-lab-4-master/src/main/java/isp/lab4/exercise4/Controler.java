/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise4;

/**
 *
 * @author Razvan


/**
 *
 * @author Razvan
 */
import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

/**
 *
 * @author Razvan
 */
public class Controler {
    private TemperatureSensor [] temperatureSensors ;
    private FireAlarm fireSensor;
    public Controler(TemperatureSensor [] temperatureSensors,FireAlarm fireSensor){
        this.temperatureSensors = temperatureSensors;
        this.fireSensor=fireSensor;
    }
    public void controlStep(){
        for(int i=0; i<temperatureSensors.length; i++)
        {
        if(temperatureSensors[i].getValue() > 50){
            fireSensor.setActive(true);
            System.out.println("Fire alarm started");
        }
        else{
            fireSensor.setActive(false);
            System.out.println("Fire alarm not started");
        }
    }
    }
}