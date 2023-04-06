/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;

/**
 *
 * @author Razvan
 */
import java.util.ArrayList;
import java.util.List;
 
class Observable {
 
   private List<Observer> observers = new ArrayList<Observer>();
 
   public void changeState(Object event) {
      notifyAllObservers(event);
   }
 
   public void register(Observer observer) {
      observers.add(observer);		
   }
 
   private void notifyAllObservers(Object event) {
      for (Observer observer : observers) {
         observer.update(event);
      }
   } 	
}
 
interface Observer {
   public abstract void update(Object event);
}
 
//usage example
 
class Alarm extends Observable {
    void startAlarm() {
        System.out.println("Alarm has been started!");
        this.changeState("START");
    }
 
    void stopAlarm() {
        System.out.print("Alarm has been stopped!");
        this.changeState("STOP");
    }
}
 
class AlarmMonitor implements Observer {
 
    @Override
    public void update(Object event) {
        System.out.println("Alarm status has changed!");
        System.out.println("Received event: Event class:"+event.getClass()+":"+event.toString());
 
    }
 
}
 
class AlarmController implements Observer {

    @Override
    public void update(Object event) {
        System.out.println("Sending SMS message to owner.");
    }
    
}
 
public class Client {
    public static void main(String[] args) throws InterruptedException{
        Alarm fireAlarm = new Alarm();
        AlarmMonitor monitor = new AlarmMonitor();
        AlarmController controller = new  AlarmController();
        
        fireAlarm.register(monitor);
        fireAlarm.register(controller);
        
        fireAlarm.startAlarm();
        Thread.sleep(500);
        fireAlarm.stopAlarm();
 
    }
}