package isp.lab9.exercise2;

import java.util.Random;

public class HumiditySensor extends Observable{
    void readSensor(){
        Random random= new Random();
        System.out.println("humidity is: "+ random.nextInt());
        this.changeState("humidity change");
    }

}
