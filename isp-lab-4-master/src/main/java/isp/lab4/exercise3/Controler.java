/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

/**
 *
 * @author Razvan
 */
public class Controler {
    private TemperatureSensor temperatureSensor;
    private FireAlarm fireSensor;
    public Controler(TemperatureSensor temperatureSensor,FireAlarm fireSensor){
        this.temperatureSensor=temperatureSensor;
        this.fireSensor=fireSensor;
    }
    public void controlStep(){
        if(temperatureSensor.getValue() > 50){
            fireSensor.setActive(true);
            System.out.println("Fire alarm started");
        }
        else{
            fireSensor.setActive(false);
            System.out.println("Fire alarm not started");
        }
    }
}
