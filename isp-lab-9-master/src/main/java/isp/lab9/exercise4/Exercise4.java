/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise4;

/**
 *
 * @author Razvan
 */
public class Exercise4 {
    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m, v);
        c.initController();
    }
}
