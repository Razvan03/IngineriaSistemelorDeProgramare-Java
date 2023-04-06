/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Razvan
 */

interface Income {
     void income();
}

public class ManagementSystem {
    public static void main(String[] args) {
        FastFoodTruck f1 = new FastFoodTruck("blabla","fast food", 34);
        f1.sellingProduct();
    }
    
    
}


abstract class Truck {
    private String companyName;
    private String foodTruckType;
    private int soldProducts;
    private double totalIncome;
    private int stock;
    
    public Truck(String companyName, String foodTruckType, int stock) {
            this.companyName = companyName;
            this.foodTruckType = foodTruckType;
            this.soldProducts = 0;
            this.totalIncome = 0;
            this.stock = stock;
    }
    
    abstract public void sellingProduct(); 
    
    protected void decrementStock() {
        this.stock--;
    }
    
    protected int getStock() {
        return this.stock;
    }
    
    protected void updateTotalIncome(double discount, double taxes) {
        this.totalIncome = this.totalIncome +  discount - taxes;
    }
            
}

class FastFoodTruck extends Truck implements Income{
    private final double taxes;
    private final double discount;
    
    
    public FastFoodTruck(String companyName, String foodTruckType, int stock) {
        super(companyName, foodTruckType, stock);
        this.taxes = 7.3;
        this.discount = 10;
    }
    
    @Override
    public void sellingProduct() {
        if(super.getStock()>0) {
            super.decrementStock();
            income();
        }
        else {
            System.out.println("Insufficient stock!");
        }
    }
    
    @Override
    public final void income() {
        super.updateTotalIncome(this.discount, this.taxes);
    }
}
