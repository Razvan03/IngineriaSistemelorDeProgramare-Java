package isp.lab4.exercise5;

public class TemperatureSensor {

    //atribute
    
    private int value;
    
    private String location;
    
    //constructori
    
    public TemperatureSensor() {
        value = 0;
        location = "here";
    }
    
    public TemperatureSensor(int type, String location) {
        value = type;
        this.location = location;
    }
    
    //metode
    
    public int getValue() {
        return value;
    }
    
    public String getLocation() {
        return location;
    }
    
    @Override
    public String toString() {
        return String.valueOf(value + " " + location);
    }
    
}
