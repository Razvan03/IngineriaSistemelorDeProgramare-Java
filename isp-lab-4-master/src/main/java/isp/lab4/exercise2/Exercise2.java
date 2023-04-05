package isp.lab4.exercise2;

public class Exercise2 {
    
    public static void main(String[] args) {
        
        FireAlarm f1 = new FireAlarm(true);
        FireAlarm f2 = new FireAlarm(false);
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        
        System.out.println(f2.isActive());
        
        f2.setActive();
        
        System.out.println(f2.isActive());
        
    }
    
    
}
