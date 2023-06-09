/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise2;

/**
 *
 * @author Razvan
 */

public class Rectangle {
    private int length;
    private int width;
    private String color;
    
    public Rectangle(){
        length = 2;
        width = 1;
        color = "â€œredâ€";
    }
    
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        color = "x";
    }
    
    public Rectangle(int length, int width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public int getPerimeter() {
        return this.length*2+this.width*2;
    }
    
    public int getArea() {
        return this.length*this.width;
    }

}
