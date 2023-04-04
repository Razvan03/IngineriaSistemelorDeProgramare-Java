package isp.lab3.exercise4;

public class Exercise4 {
    
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 1, 1);
        MyPoint p2 = new MyPoint(1, 1, 1);

        System.out.println("\nDistance from p1 to (1, 1, 2): " + p1.distance(1, 1, 2));
        System.out.println("\nDistance from p1 to p2: " + p1.distance(p2));
    }
    
}
