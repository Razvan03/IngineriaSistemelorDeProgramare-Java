package isp.lab4.exercise3;


public class Exercise3 {
    
   public static void main(String[] args) {
       TemperatureSensor t1 = new TemperatureSensor(56, "Cluj Napoca");
       FireAlarm f1 = new FireAlarm(true);
       Controler c1 = new Controler(t1, f1);
       
       c1.controlStep();
       
   } 
   
   
   
}
