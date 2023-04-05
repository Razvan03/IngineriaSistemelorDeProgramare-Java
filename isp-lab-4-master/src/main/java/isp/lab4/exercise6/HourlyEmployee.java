/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise6;

/**
 *
 * @author Razvan
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    
    public HourlyEmployee(double wage, double hours, String firstName, String lastName) {
        super(firstName, lastName);
        this.hours = hours;
        this.wage = wage;
    }
    
    @Override
    public double getPaymentAmount() {
        return wage*hours;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHourlyEmployee { " + "wage = " + wage + ", hours = " + hours + " }";
    }
    
    
}
