package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        //instantiati obiect
        TemperatureSensor t1 = new TemperatureSensor();
        TemperatureSensor t2 = new TemperatureSensor(10, "Cluj Napoca");
        
        System.out.println(t2.getValue());
        System.out.println(t2.getLocation());
        System.out.println(t2.toString());
        System.out.println(t1.getValue());
        System.out.println(t1.getLocation());
        System.out.println(t1.toString());
        
    }
}
