package isp.lab8.carparkaccess;

import isp.lab8.carparkaccess.file.ParkingAccessFileControl;
import java.util.concurrent.TimeUnit;

public class CarParkingAccessApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("It works!");
        
        ParkingAccessControl pac = new ParkingAccessControl();
        
        Car c1 = new Car("CJ-01-AAA", System.currentTimeMillis());
        Car c7 = new Car("CJ-03-AAA", System.currentTimeMillis());
        
        pac.carEntry(c1);
        pac.carEntry(c7);
        
        TimeUnit.SECONDS.sleep(3);
        
        int price1 = pac.carExit("CJ-01-AAA");
        pac.viewCurrentCars();
        System.out.println("Price for parking is = "+price1);
        
        ////////////////////////////////
        
        /*ParkingAccessFileControl fpac = new ParkingAccessFileControl();
        Car c2 = new Car("CJ-02-AAA", System.currentTimeMillis());
        Car c3 = new Car("CJ-02-BBB", System.currentTimeMillis());
        Car c4 = new Car("CJ-02-CCC", System.currentTimeMillis());*/
        
        //fpac.carEntry(c2);
        //fpac.carEntry(c3);
        //fpac.carEntry(c4);
        
        //price = fpac.carExit("CJ-02-CCC");
        
        //fpac.viewCurrentCars();
        
        //System.out.println("Price to be payed = "+price);
    }
}
