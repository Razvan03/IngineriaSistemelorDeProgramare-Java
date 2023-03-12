package isp.lab4.exercise4;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Exercise4 {
     public static void main(String[] args) {
        TemperatureSensor [] temperatura  = new TemperatureSensor[3];
        temperatura[0]= new TemperatureSensor(30,"Cluj");
        temperatura[1]= new TemperatureSensor(45,"Dej");
        temperatura[2]= new TemperatureSensor(55,"Gherla");
        FireAlarm FA = new FireAlarm(false);
        Controler control = new Controler(temperatura,FA);
        control.controlStep();
        //control.controlStep();
     }
}