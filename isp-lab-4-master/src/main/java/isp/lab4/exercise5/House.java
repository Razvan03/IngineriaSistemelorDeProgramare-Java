/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise5;

import isp.lab4.exercise4.Controler;

/**
 *
 * @author Razvan
 */
public class House {
    private Controler controler;
    public House(Controler controler){
        this.controler=controler;
    }
    public Controler getControler(){
        return controler;
    }
}
