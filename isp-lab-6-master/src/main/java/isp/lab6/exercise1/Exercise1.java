package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        SensorReading sensor1=new SensorReading(30,"Cluj",Type.HUMIDITY);
        SensorReading sensor2=new SensorReading(45,"Cluj",Type.HUMIDITY);
        SensorReading sensor3=new SensorReading(25,"Suceava",Type.PRESSURE);
        SensorReading sensor4=new SensorReading(55,"Suceava",Type.PRESSURE);
        SensorReading sensor5=new SensorReading(20,"Cluj",Type.TEMPERATURE);
        SensorReadingList list = new SensorReadingList();
        list.addReading(sensor1); 
        list.addReading(sensor2); 
        list.addReading(sensor3); 
        list.addReading(sensor4); 
        list.addReading(sensor5); 
        System.out.println(list.getAvarageValueByType(Type.HUMIDITY));
        
        List<SensorReading> listByType = list.getReadingsByType(Type.PRESSURE);
        for(int i=0;i<listByType.size();i++){
           System.out.println(listByType.get(i).getLocation());
        }
        list.listSortedByLocation();
        for(int i=0;i<list.list.size();i++){
           System.out.println(list.list.get(i).getLocation());
        }
        list.listSortedByValue();
        for(int i=0;i<list.list.size();i++){
           System.out.println(list.list.get(i).getValue());
        }
        List<SensorReading> listByLocationAndType = list.findAllByLocationAndType("Cluj",Type.HUMIDITY);
        for(int i=0;i<listByLocationAndType.size();i++){
           System.out.println(listByLocationAndType.get(i).getLocation());
        }
    }
}
