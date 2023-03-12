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
    ArrayList<SensorReading> list = new ArrayList<>();
    @Override
    public void addReading(SensorReading reading){
        list.add(reading);
    }
    
    @Override
    public double getAvarageValueByType(Type type){
        double sum=0,nr=0;
        for(int i=0;i<list.size();i++)
            if(type.equals(list.get(i).getType()))
            {
                sum+=list.get(i).getValue();
                nr++;
            }
        sum/=nr;
        return sum;
        
    }
    @Override
    public List<SensorReading> getReadingsByType(Type type){
        ArrayList<SensorReading> listByType = new ArrayList<>();
        for(int i=0;i<list.size();i++)
            if(type.equals(list.get(i).getType()))
            {
                listByType.add(list.get(i));
            }
        return listByType;
    }
    @Override
    public void listSortedByLocation(){
        Collections.sort(list);
    }
    @Override
    public void listSortedByValue(){
        Collections.sort(list, (SensorReading o1, SensorReading o2) -> o1.getValue() - o2.getValue());
    }
    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type){
         ArrayList<SensorReading> newList = new ArrayList<>();
         for(int i=0;i<list.size();i++)
            if((type.equals(list.get(i).getType())) && location.equals(list.get(i).getLocation()))
            {
                newList.add(list.get(i));
            }
        return newList;
    }
}
