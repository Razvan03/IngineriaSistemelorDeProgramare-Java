/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise6;

/**
 *
 * @author Razvan
 */
public class Employee {
    private String firstName;
    private String lastName;
    
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Employee { " + "firstName = " + firstName + ", lastName = " + lastName + " }";
    }
    
    
}
