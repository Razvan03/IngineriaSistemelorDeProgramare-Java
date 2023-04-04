package isp.lab3.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        VendingMachine p1 = new VendingMachine(10, "banana", 10);
        VendingMachine p2 = new VendingMachine(25, "apa", 16);
        VendingMachine p3 = new VendingMachine(46, "ciocolata", 25);
        VendingMachine p4 = new VendingMachine(70, "coffeee", 30);

        VendingMachine.userMenu();
    }
    
}
