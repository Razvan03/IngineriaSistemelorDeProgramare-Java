/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Razvan
 */
public class SensorReadingList implements IReadingRepository{
   
    List<SensorReading> list=new ArrayList<>();
    
    /**
     * Add a new sensor reading.
     *
     * @param reading
     */
    @Override
    public void addReading(SensorReading reading) {
        this.list.add(reading);
    }

    /**
     * Return avarage of all readings for a specific sensor type and location.
     *
     * @param type
     * @param location
     * @return
     */
    @Override
    public double getAvarageValueByType(Type type, String location) {
        int avarage = 0, ct = 0;
        for (int i=0; i <list.size(); i++) {
            if(location.equals(list.get(i).getLocation()) && list.get(i).getType().equals(type)) {
                avarage += list.get(i).getValue();
                ct++;
            }   
        }   
        return avarage /= ct;
    }

    /**
     * Return all readings for a specific type.
     *
     * @param type
     * @return
     */
    @Override
    public List<SensorReading> getReadingsByType(Type type) {
        List<SensorReading> newList=new ArrayList<>();
        for (int i=0; i <list.size(); i++) {
            if(list.get(i).getType().equals(type)) {
               newList.add(list.get(i));
            }   
        }
        return newList;
    }

    /**
     * List all readings sorted by location (alphabetical).
     */
    @Override
    public void listSortedByLocation() {
        Collections.sort(list);
    }

    /**
     * List all readings sorted by value;
     */
    @Override
    public void listSortedByValue() {
        
        // <<<<<< lambda expression >>>>>>
        Collections.sort(list, (SensorReading o1, SensorReading o2) -> {
            if(o1.getValue() < o2.getValue())
                return -1;
            if(o1.getValue() == o2.getValue())
                return 0;
            return 1;
        });
        /*
            <<<< clasa anonima >>>>
            Collections.sort(list, new Comparator<SensorReading>() {
            @Override
            public int compare(SensorReading o1, SensorReading o2) {
                if(o1.getValue() < o2.getValue())
                    return -1;
                if(o1.getValue() == o2.getValue())
                    return 0;
                return 1;
            }
        })*/
    }

    /**
     * Return all readings filtered by type and location.
     *
     * @param location
     * @param type
     * @return
     */
    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
        List<SensorReading> newList=new ArrayList<>();
        for (int i=0; i <list.size(); i++) {
            if(list.get(i).getType().equals(type) && list.get(i).getLocation().equals(location)) {
               newList.add(list.get(i));
            }   
        }
        return newList;
    }

}
