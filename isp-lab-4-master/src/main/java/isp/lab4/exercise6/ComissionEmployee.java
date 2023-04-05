/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise6;

/**
 *
 * @author Razvan
 */
public class ComissionEmployee extends Employee{
    private double grossSales;
    private double comissionSales;
    
    public ComissionEmployee(double grossSales, double comissionSales, String firstName, String lastName){
        super(firstName, lastName);
        this.comissionSales = comissionSales;
        this.grossSales = grossSales;
    }
    
    @Override
    public double getPaymentAmount() {
        return grossSales+comissionSales;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nComissionEmployee { " + "grossSales = " + grossSales + ", comissionSales = " + comissionSales + " }";
    }
    
    
}
