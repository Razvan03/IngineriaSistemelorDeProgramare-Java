package isp.lab3.exercise3;

/**
 *
 * @author Razvan
 */
public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    static int numberOfVehicles=0;
    public Vehicle(String model, String type, int speed, char fuelType){
        this.model=model;
        this.type=type;
        this.speed=speed;
        this.fuelType=fuelType;
        numberOfVehicles++;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setFuelType(char fuelType){
        this.fuelType=fuelType;
    }
    public String getModel(){
        return model;
    }
    public String getType(){
        return type;
    }
    public int getSpeed(){
        return speed;
    }
    public char getFuelType(){
        return fuelType;
    }
    public static int getNumberOfVehicles(){
        return numberOfVehicles;
    }
    @Override
    public String toString(){
        return "" + model + " " + type + " speed " + speed + " fuel type " +fuelType;
    }
}
