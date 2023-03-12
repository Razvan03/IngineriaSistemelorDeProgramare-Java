package isp.lab3.exercise1;

public class Exercise1 {
    public static void main(String[] args){
        Tree t;
        t = new Tree();
        System.out.println(" height: " + t.toString());
        t.grow(10);
        System.out.println(" height: " + t.toString());
    }
}
