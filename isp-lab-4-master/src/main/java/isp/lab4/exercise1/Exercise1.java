package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        TemperatureSensor termometru = new TemperatureSensor(5,"Cluj");
        System.out.println("value: " + termometru.getValue());
        System.out.println("location: " + termometru.getLocation());
        System.out.println('\'' + termometru.toString());
    }
}
