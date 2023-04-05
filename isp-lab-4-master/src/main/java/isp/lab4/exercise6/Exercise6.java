package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        
        /*
        ComissionEmployee c = new ComissionEmployee(2000, 54.3, "Popescu", "Marian");
        HourlyEmployee h = new HourlyEmployee(60, 32.5, "Popa", "Gheorghe");
        SalariedEmployee s = new SalariedEmployee(1599, "Rusu", "George");
        
        System.out.println(c.getPaymentAmount());
        System.out.println(h.getPaymentAmount());
        System.out.println(s.getPaymentAmount());
        */
        
        
        Employee[] employees = new Employee[6];
        
        employees[0] = new ComissionEmployee(2000, 54.3, "Popescu", "Marian");
        employees[1] = new ComissionEmployee(2000, 99.3, "Popescu", "Maria");
        employees[2] = new HourlyEmployee(60, 32.5, "Popa", "Gheorghe");
        employees[3] = new HourlyEmployee(60, 100.5, "Popa", "Georgiana");
        employees[4] = new SalariedEmployee(1599, "Rusu", "George");
        employees[5] = new SalariedEmployee(3899, "Rusu", "Alexia");
        
        for(int i=0; i<6; i++)
        {
            System.out.println(employees[i].toString());
            System.out.println("Payment amount" + employees[i].getPaymentAmount());
            
        }
        
        
        
   } 

    
    
    
}
