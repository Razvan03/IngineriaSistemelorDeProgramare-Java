/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess;

import java.util.ArrayList;

/**
 *
 * @author Razvan
 */
public class ParkingAccessControl {

    public static final int MAX_CAPACITY = 5;
    
    private ArrayList<Car>  parkedCars = new ArrayList<>();
   
    private ArrayList<Car>  previousCars = new ArrayList<>(); 
    

    public void carEntry(Car car){
        //1. sa verific capacitatea 
        //2. daca capacitatea este depasita -> return 
        //3. verific daca nu cumva masina este deja in parcare, si daca este -> return 
        //4. daca masina nu este in parcare salvez obiectul de tip car in parkedCars 
        
        if(checkSpaceAvailability()) {
            return;
        }
        
        for(Car parkedCar : parkedCars) {
            if(parkedCar.equals(car))
                return;
        }
        
        
        parkedCars.add(car);
        /*System.out.println(car);
        for(Car parkedCar : parkedCars) {
            System.out.println(parkedCar);
        }*/
        System.out.println("Car "+car+" is entering car park!");
    }
    
    public boolean checkSpaceAvailability(){
            return parkedCars.size() >= MAX_CAPACITY;
    }
    
    public int carExit(String plateNumber){
        //1. cautam dupa plate number un Car in parkedCars
        //2. daca nu am gasit plateNumber -> return 
        //3. daca am gasit masina, 
            //calculez timpul de asteptare in parcare, -> System.currentTimeMiliseconds()
            //calculez pretul, 
            //sterg masina din parkedCars si o adaug in previousCars
            //returnez pretul
        Car car = null;
        for(Car parkedCar : parkedCars) {
            if(parkedCar.getPlateNumber().equals(plateNumber))
                car = parkedCar;
        }
        if(car == null)
            return 0;
        long time = System.currentTimeMillis() - car.getEntryTime();
        
        System.out.println("Car with plate number "+plateNumber+" is exiting");
        
        previousCars.add(car);
        parkedCars.remove(car);
        
        return usageCost(time);
    }
    
    public int usageCost(long time){
        return 1*(int)time/1000;
    }
    
    public void viewCurrentCars(){
        System.out.println("Display all parked cars: ");
        if(parkedCars.isEmpty()) {
            System.out.println("No cars. ");
        } else {
            for(Car parkedCar : parkedCars) {
                System.out.println(parkedCar);
            }
        }
        
    }
    
    public void viewPastEntriesForCar(String plateNumber){
        System.out.println("Display all past entries for a car.");
        for(Car parkedCar : previousCars) {
            if(parkedCar.getPlateNumber().equals(plateNumber)) {
                System.out.println(parkedCar);
            }     
        }
    }
    
    public void viewPastUniqueEntries(){
        System.out.println("Display all unique entries.");
        
        int nb;
        
        for(int i=0; i<previousCars.size(); i++) {
            nb = 0;
            Car car = previousCars.get(i);
            for(int j=i+1; j<previousCars.size(); j++) {
                if(car.equals(previousCars.get(j)))
                {
                    nb++;
                    previousCars.remove(previousCars.get(j));
                }
            }
            System.out.println(previousCars.get(i).getPlateNumber() + " entered times: " + nb);
        }
    }
    
}
