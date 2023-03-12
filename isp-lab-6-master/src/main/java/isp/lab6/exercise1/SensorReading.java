package isp.lab6.exercise1;

import java.util.Comparator;

public class SensorReading implements Comparable<SensorReading>{
    private int value;
    private String location;
    private Type type;

    public SensorReading(int value, String location, Type type) {
        this.value = value;
        this.location = location;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    public Type getType() {
        return type;
    }
    Comparator<SensorReading> byValue =  (SensorReading o1, SensorReading o2) -> o1.getValue() - o2.getValue();
    @Override
    public int compareTo(SensorReading o){
        return this.location.compareTo(o.location);
    }    
}
    

