/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise2;

/**
 *
 * @author Razvan
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
class Observable {
 
   private List<Observer> observers = new ArrayList<>();
 
   public void changeState(Object event, double value) {
      notifyAllObservers(event, value);
   }
 
   public void register(Observer observer) {
      observers.add(observer);		
   }
 
   private void notifyAllObservers(Object event, double value) {
      for (Observer observer : observers) {
         observer.update(event, value);
      }
   } 	
}
 
interface Observer {
   public abstract void update(Object event, double value);
}
 
//usage example

class Sensors extends Observable {
    
    private double TEMPERATURE;
    private double HUMIDITY;
    private double PRESSURE;
    
    void readSensor(String sensor) {
        Random rand = new Random();
        switch (sensor) {
            case "TEMPERATURE":
                TEMPERATURE = rand.nextDouble();
                this.changeState("TEMPERATURE", TEMPERATURE);
                break;
            case "HUMIDITY":
                HUMIDITY = rand.nextDouble();
                this.changeState("HUMIDITY", HUMIDITY);
                break;
            case "PRESSURE":
                PRESSURE = rand.nextDouble();
                this.changeState("PRESSURE", PRESSURE);
                break;
            default:
                break;
        }
        
    }
}



class Controller implements Observer{
     @Override
    public void update(Object event, double value) {
       System.out.println(event + " = " + value);
    }
}

public class SensorsMain {
    public static void main(String[] args) throws InterruptedException{
        Sensors sensors = new Sensors();
        
        Controller controller = new  Controller();
        
        sensors.register(controller);
  
        sensors.readSensor("TEMPERATURE");
        sensors.readSensor("HUMIDITY");
        sensors.readSensor("PRESSURE");
        sensors.readSensor("TEMPERATURE");
 
    }
            
}

