/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise5;

import java.util.Scanner;

/**
 *
 * @author Razvan
 */
public class VendingMachine {
    static int credit = 0;
    static private int[] id = new int[10];
    static private String[] name = new String[10];
    static private int[] productValue = new int[10];
    static private int nrProduse = 0;
    
    static int produseSelectate = 0;
    static int costTotalProduseSelectate = 0;
    
    public VendingMachine(int id, String name, int productValue) {
        this.id[nrProduse] = id;
        this.name[nrProduse] = name;
        this.productValue[nrProduse++] = productValue;
    }
    
    public String getName(int i) {
        return name[i];
    }
    
    public int getCoin() {
        return credit;
    }
    
    static public void displayProducts() {
        for(int i=0; i<nrProduse; i++)
            System.out.println("\nProdus " + (i + 1) + ") " + name[i] + ", pret: " + productValue[i] + ", id: " + id[i]);
    }
    
    static public void insertCoin(int value) {
        if(value >= 0)
            credit += value;
    }
    
    static public String selectProduct(int idC) {
        for(int i=0; i<nrProduse; i++)
            if(id[i] == idC)
            {
                costTotalProduseSelectate += productValue[i];
                return name[i];
            }
        
        return "\nError! Product not found.";
    }
    
    static private void displayCredit() {
        System.out.println("\nCredit: " + credit);
    }
    
    static public void userMenu() {
        boolean semn = true; 
        Scanner scan = new Scanner(System.in);
        displayProducts();

        while(semn) {
            
            System.out.println("\nApasati tasta:  <0> pentru a selecta produse.");
            System.out.println("\n                <1> pentru a introduce creditul.");
            System.out.println("\n                <2> pentru a anula comanda.");
            
            int op = scan.nextInt();
        
            switch(op)
            {
                case 0: {
                            if(credit != 0)
                            {
                                System.out.println("\nFinalizati comanda inainte de a face alta!");
                                break;
                            }
                            System.out.println("\nIntroduceti id-ul produsului: ");
                            String n = selectProduct(scan.nextInt());
                            if(n == "\nError! Product not found.")
                                System.out.println("\n " + n + "\n\nIncercati din nou.");
                            else
                            {
                                System.out.println("\nProdusul selectat: " + n);
                                produseSelectate++;
                                System.out.println("\nTotal produse: " + produseSelectate);
                                System.out.println("\nTotal cost: " + costTotalProduseSelectate);  
                            }
                            break;
                        }
                case 1: {
                            if(costTotalProduseSelectate == 0)
                            {
                                System.out.println("\nIntroduceti produsele dorite prima data!");
                                break;
                            }
                            System.out.println("\nIntroduceti creditul: ");

                            insertCoin(scan.nextInt());
                            if(credit < costTotalProduseSelectate)
                            {
                                displayCredit();
                                System.out.println("\nMai trebuie sa introduceti: " + (costTotalProduseSelectate - credit) + " credit.");
                            }
                            else
                            {
                                if(credit > costTotalProduseSelectate)
                                      System.out.println("\nO sa primiti rest: " + (credit - costTotalProduseSelectate));
                                semn = false;
                                System.out.println("\n\nAsteptati sa primiti produsele!");
                            }

                            break;
                        }
                case 2: {
                            if(credit != 0)
                                System.out.println("\nAsteptai sa va fie returnat creditul!");
                            credit = 0;
                            costTotalProduseSelectate = 0;
                            break;
                        }
                default:    {
                                System.out.println("\nOptiune gresita! \nIncercati din nou.");
                                break;
                            }
            }
        }
    }
    
}
