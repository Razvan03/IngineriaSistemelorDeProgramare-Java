/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise6;

/**
 *
 * @author Razvan
 */
public class SalariedEmployee extends Employee {
    
    private double weeklySalary;
    
    SalariedEmployee(double weeklySalary, String firstName, String lastName) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }
    
    
    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalariedEmployee { " + "weeklySalary = " + weeklySalary + " }";
    }
    
    
}   

