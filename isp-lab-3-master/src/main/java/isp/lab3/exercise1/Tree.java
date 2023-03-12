package isp.lab3.exercise1;

/**
 *
 * @author Razvan
 */
public class Tree {
    int height;
    public Tree(){
        height = 15;
    }
    
    public int grow(int meters){
        if(meters >=1){
        height = height + meters;
        }
        return height;
    }
    @Override
    public String toString(){
        return ""+height;
    }
}
