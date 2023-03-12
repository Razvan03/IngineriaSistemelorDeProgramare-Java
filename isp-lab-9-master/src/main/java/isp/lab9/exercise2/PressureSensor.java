package isp.lab9.exercise2;

import java.util.Random;

public class PressureSensor extends Observable{
    void readSensor(){
        Random random= new Random();
        System.out.println("pressure is: "+ random.nextInt());
        this.changeState("pressure change");
    }

}
