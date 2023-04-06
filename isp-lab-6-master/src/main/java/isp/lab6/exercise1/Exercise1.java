package isp.lab6.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Test implementation here.");
        SensorReading reading1 = new SensorReading(10, "Cluj Napoca", Type.TEMPERATURE);
        SensorReading reading2 = new SensorReading(11, "Cluj Napoca", Type.PRESSURE);
        SensorReading reading3 = new SensorReading(12, "Cluj Napoca", Type.HUMIDITY);
        SensorReading reading4 = new SensorReading(13, "Sibiu", Type.TEMPERATURE);
        SensorReading reading5 = new SensorReading(14, "Cluj Napoca", Type.TEMPERATURE);
        SensorReading reading6 = new SensorReading(15, "Bucuresti", Type.TEMPERATURE);
        SensorReading reading7 = new SensorReading(16, "Cluj Napoca", Type.TEMPERATURE);
        
        SensorReadingList l = new SensorReadingList();
        l.addReading(reading1);
        l.addReading(reading2);
        l.addReading(reading3);
        l.addReading(reading4);
        l.addReading(reading5);
        l.addReading(reading6);
        l.addReading(reading7);
        
        for (SensorReading reading : l.list)
            System.out.println(reading.getLocation());
        l.listSortedByLocation();
        System.out.println("\n");
        for (SensorReading reading : l.list)
            System.out.println(reading.getLocation());
        
        for (SensorReading reading : l.list)
            System.out.println(reading.getValue());
        l.listSortedByValue();
        System.out.println("\n");
        for (SensorReading reading : l.list)
            System.out.println(reading.getValue());
        
    }
}
