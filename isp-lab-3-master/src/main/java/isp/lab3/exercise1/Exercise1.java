package isp.lab3.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        
        // Tree 
        System.out.println("\nExercitiul 1: \n\n");
        
        Tree t1 = new Tree();
        System.out.println(t1.height);
        
        t1.grow(-1);
        System.out.println(t1.height);
        
        t1.grow(10);
        System.out.println(t1.height);
       
        System.out.println(t1.toString(t1));
              
    }
    

}
