/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise6;

/**
 *
 * @author Razvan
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee(String firstname,String lastname,double weeklySalary){
        super(firstname,lastname);
        this.weeklySalary=weeklySalary;
    }
}
