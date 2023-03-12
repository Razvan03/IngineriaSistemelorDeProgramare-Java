package isp.lab4.exercise3;

import isp.lab4.exercise1.TemperatureSensor;
import isp.lab4.exercise2.FireAlarm;

public class Exercise3 {
    public static void main(String[] args) {
        TemperatureSensor temperatura = new TemperatureSensor(40,"Cluj");
        FireAlarm FA = new FireAlarm(true);
        Controler control = new Controler(temperatura,FA);
        control.controlStep();
    }
}
