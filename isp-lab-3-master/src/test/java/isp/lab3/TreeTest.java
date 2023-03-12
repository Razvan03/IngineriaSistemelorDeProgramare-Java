package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mihai.hulea
 */
public class TreeTest {
    Tree t = new Tree();
    @Test
    public void testgrow(){
    assertEquals("Should test the grow function", 25, t.grow(10));
    }
    @Test
    public void testtoString() {
    assertEquals("Should show the height", "15", t.toString());
    }
}

