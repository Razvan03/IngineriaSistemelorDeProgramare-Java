package isp.lab4.exercise4;


public class Exercise4 {
    
   public static void main(String[] args) {
       TemperatureSensor[] t1 = new TemperatureSensor[3];
     
       t1[0] = new TemperatureSensor(11, "cbjdwkjc");
       t1[1] = new TemperatureSensor(67, "dewcfr");
       t1[2] = new TemperatureSensor(1, "w2w2wd");
       
       FireAlarm f1 = new FireAlarm(false);
       Controler c1 = new Controler(t1, f1);
       
       c1.controlStep();
       
   } 
}
