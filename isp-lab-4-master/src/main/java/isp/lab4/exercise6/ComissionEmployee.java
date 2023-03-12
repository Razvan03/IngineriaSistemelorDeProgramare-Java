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
    public ComissionEmployee(String firstname,String lastname,double grossSales,double comissionSales){
        super(firstname,lastname);
        this.grossSales=grossSales;
        this.comissionSales=comissionSales;
    }
}
