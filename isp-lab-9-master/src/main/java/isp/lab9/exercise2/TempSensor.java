package isp.lab9.exercise2;

import java.util.Random;

public class TempSensor extends Observable{
    void readSensor(){
        Random random= new Random();
        System.out.println("temp is: "+ random.nextInt());
        this.changeState("temp change");
    }


}
