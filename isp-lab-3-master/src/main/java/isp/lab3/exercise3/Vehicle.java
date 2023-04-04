/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    public static int nrVehicles = 0;
    
    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        nrVehicles++;
    }
    
    public String getModel() {
        return this.model;
    }
      
    public String getType() {
        return this.type;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public char getFuelType() {
        return this.fuelType;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }
    
    public String toString(){
        
        return String.valueOf(this.getModel() + " (" + this.getType() + ") speed " + this.getSpeed() + " fuel type " + this.getFuelType() + "â€");
    }
    
    public static void nrVehicles() {
        System.out.println("\nNb. of vehicles: " + nrVehicles);
    }
    
 
}
