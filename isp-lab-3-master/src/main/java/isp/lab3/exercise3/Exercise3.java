package isp.lab3.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        
        // Vehicle 
        System.out.println("\nExercitiul 3: \n\n");
        
        Vehicle v1 = new Vehicle("â€œ5SERIES", "BMW", 250, 'D');
        Vehicle v2 = new Vehicle("â€œA6", "AUDI", 250, 'D');
        System.out.println(v1.toString());
        
        if(v1.equals(v2))
            System.out.println("\nSunt identice!");
        else
            System.out.println("\nNu sunt identice!");
        
        v2.nrVehicles();
        
    }
    
}
