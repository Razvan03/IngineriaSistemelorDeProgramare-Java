/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3;



import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author Antonia
 */
public class VendingMachineTest {
    @Test
    public void testDisplayProducts() {
        VendingMachine p3 = new VendingMachine(46, "ciocolata", 25);
        VendingMachine p4 = new VendingMachine(70, "coffeee", 30);
        p4.displayProducts();
        assertEquals("Should be equal.", "ciocolata", p4.getName(0));
        assertEquals("Should be equal.", "coffeee", p4.getName(1));
    }
    
    @Test
    public void testInsertCoin() {
        VendingMachine p4 = new VendingMachine(70, "coffeee", 30);
        p4.insertCoin(1);
        assertEquals("Should be equal.", 1, p4.getCoin());
    }
    
    @Test
    public void testSelectProduct() {
        VendingMachine p3 = new VendingMachine(46, "ciocolata", 25);
        VendingMachine p4 = new VendingMachine(70, "coffeee", 30);

        assertEquals("Should be equal.", "coffeee", VendingMachine.selectProduct(70));
    }
}
