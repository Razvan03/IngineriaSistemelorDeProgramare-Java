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
    public HourlyEmployee(String firstname,String lastname,double wage,double hours){
        super(firstname,lastname);
        this.wage=wage;
        this.hours=hours;
    }
}
