/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise1;

/**
 *
 * @author Razvan
 */
public class Tree {
    public int height;
    
    public Tree(){
        height = 15;
    }
    
    public void grow(int meters){
            if(meters >= 1)
                height += meters;
    }
    
    public String toString(Tree t){
        
        return Integer.toString(t.height);
    }
    
}
