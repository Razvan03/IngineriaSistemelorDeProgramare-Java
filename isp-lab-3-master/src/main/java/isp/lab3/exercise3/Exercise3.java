package isp.lab3.exercise3;

public class Exercise3 {
    public static void main(String[] args){
        Vehicle Dacia = new Vehicle("Dacia","Logan",150,'B');
        Vehicle Trabant = new Vehicle("Dacia","1310",80,'D');
        System.out.println(Dacia.toString());
        Dacia.setType("Duster");
        System.out.println("Type: " + Dacia.getType());
        System.out.println(Trabant.toString());
        Trabant.setSpeed(200);
        System.out.println("Type: " + Trabant.getSpeed());
        
    }
}
