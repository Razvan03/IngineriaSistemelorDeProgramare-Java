package isp.lab3.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        
        // Rectangle
        System.out.println("\nExercitiul 2: \n\n");
        
        System.out.println("\nPrimul dreptunghi: ");
        Rectangle r1 = new Rectangle();
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.getColor());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
        
        System.out.println("\nAl doilea dreptunghi: ");
        Rectangle r2 = new Rectangle(10, 12);
        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());
        System.out.println(r2.getColor());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getArea());
        
        System.out.println("\nAl treilea dreptunghi: ");
        Rectangle r3 = new Rectangle(10, 12, "rosu");
        System.out.println(r3.getLength());
        System.out.println(r3.getWidth());
        System.out.println(r3.getColor());
        System.out.println(r3.getPerimeter());
        System.out.println(r3.getArea());
        
    }
}
