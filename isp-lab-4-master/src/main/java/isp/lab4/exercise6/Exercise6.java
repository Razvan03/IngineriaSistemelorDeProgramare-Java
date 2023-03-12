package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        Employee employee = new Employee("Roman","Razvan");
        employee = new ComissionEmployee("Roman","Razvan",1500,1000);
        employee = new HourlyEmployee("Roman","Razvan",1500,50);
        employee = new SalariedEmployee("Roman","Razvan",450);
        System.out.println("PaymentAmount: " + HourlyEmployee.getPaymentAmount());
        System.out.println("PaymentAmount: " + employee.getPaymentAmount());
    }
}
