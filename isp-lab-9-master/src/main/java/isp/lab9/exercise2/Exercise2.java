/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab9.exercise2;

/**
 *
 * @author Admin
 */
public class Exercise2 {
     public static void main(String[] args) throws InterruptedException{
         TempSensor tempSensor= new TempSensor();
         HumiditySensor humiditySensor= new HumiditySensor();
         PressureSensor pressureSensor= new PressureSensor();
         SensorController sensorController = new SensorController();
         tempSensor.register(sensorController);
         humiditySensor.register(sensorController);
         pressureSensor.register(sensorController);


         tempSensor.readSensor();
         Thread.sleep(500);
         humiditySensor.readSensor();
         Thread.sleep(500);
         pressureSensor.readSensor();



    }
}
