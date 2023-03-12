package isp.lab4.exercise5;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;
import isp.lab4.exercise4.Controler;

public class Exercise5 {
     public static void main(String[] args) {
        TemperatureSensor [] temperatura  = new TemperatureSensor[3];
        temperatura[0]= new TemperatureSensor(30,"Cluj");
        temperatura[1]= new TemperatureSensor(45,"Dej");
        temperatura[2]= new TemperatureSensor(55,"Gherla");
        FireAlarm FA = new FireAlarm(false);
        Controler control = new Controler(temperatura,FA);
        Controler control2 = new Controler(temperatura,FA);
        House house = new House(control);
     }
}
