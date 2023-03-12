package isp.lab4.exercise1;

public class TemperatureSensor {

    private int value;
    private String location;
    public static int numberOfSensors=0;
    public TemperatureSensor(){
    };
    public TemperatureSensor(int type, String location){
        value = type;
        this.location=location;
        numberOfSensors++;
    }
    public int getValue(){
        return value;
    }
    public String getLocation(){
        return location;
    }
    @Override
    public String toString() {
        return "TemperatureSensor{ " +
                "value=" + value +
                ", location=" + location + '\'' + "}";
    }
    //constructori
    //metode
}
