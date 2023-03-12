package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FireAlarm FA = new FireAlarm(true);
        System.out.println("isActive: " + FA.isActive());
        FA.setActive(false);
        System.out.println('\'' + FA.toString());
    }
}
