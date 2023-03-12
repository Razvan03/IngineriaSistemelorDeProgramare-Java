package isp.lab3.exercise2;

public class Exercise2 {
    public static void main(String[] args){
        
    Rectangle dreptunghi = new Rectangle(3,4,"green");
    Rectangle patrat = new Rectangle(3,3);
    System.out.println("length: " + dreptunghi.getLength());
    System.out.println("width: " + dreptunghi.getWidth());
    System.out.println("color: " + dreptunghi.getColor());
    System.out.println("perimeter: " + dreptunghi.getPerimeter());
    System.out.println("area: " + dreptunghi.getArea());
    
    System.out.println("length: " + patrat.getLength());
    System.out.println("width: " + patrat.getWidth());
    System.out.println("color: " + patrat.getColor());
    System.out.println("perimeter: " + patrat.getPerimeter());
    System.out.println("area: " + patrat.getArea());
    }
}
