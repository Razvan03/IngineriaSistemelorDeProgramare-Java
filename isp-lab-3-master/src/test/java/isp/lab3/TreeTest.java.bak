/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Antonia
 */
public class TreeTest {
    
    @Test
    public void testGrow() {
        Tree t1 = new Tree();
        t1.grow(10);
        assertEquals("Should add meters to height", 25, t1.height);
    }

    @Test
    public void testToString() {
        Tree t1 = new Tree();
        
        assertEquals("Should return the height", "15", t1.toString(t1));
    }
    
    @Test
    public void test() {
        Tree t1 = new Tree();
        t1.grow(-1);
        assertEquals("Should not add meters to height", 15, t1.height);
    }

}
