/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise4;

/**
 *
 * @author Razvan
 */
public class MyPoint {
    private int x, y, z;
    
    public MyPoint() {
        x = 0;
        y = 0;
        z = 0;
    }
    
    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setZ(int z) {
        this.z = z;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getZ() {
        return z;
    }
    
    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public String toString() {
        return String.valueOf("â€œ(" + this.getX() + ", " +  this.getY() + ", " + this.getZ() + ")â€");
    }
    
    public int distance(int x, int y, int z) {
        int dx, dy, dz;
        
        dx = (int)Math.pow(this.x - x, 2); 
        dy = (int)Math.pow(this.y - y, 2);
        dz = (int)Math.pow(this.z - z, 2);
        
        return (int)Math.sqrt(dx+dy+dz);
    }
    
    public int distance(MyPoint another) {
        int dx, dy, dz;
        
        dx = (int)Math.pow(this.x - another.x, 2); 
        dy = (int)Math.pow(this.y - another.y, 2);
        dz = (int)Math.pow(this.z - another.z, 2);
        
        return (int)Math.sqrt(dx+dy+dz);
    }
    
}
