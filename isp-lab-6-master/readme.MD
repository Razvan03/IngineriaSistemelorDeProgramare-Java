# Implement the following exercises

## Exercise 1

Provide implementation for IReadingRepository interface. Follow description (method comments) from interface to identify exact behaviour needed.

```java
import java.util.List;

public interface IReadingRepository {

    /**
     * Add a new sensor reading.
     *
     * @param reading
     */
    public void addReading(SensorReading reading);

    /**
     * Return avarage of all readings for a specific sensor type and location.
     *
     * @param type
     * @return
     */
    public double getAvarageValueByType(Type type, String location);

    /**
     * Return all readings for a specific type.
     *
     * @param type
     * @return
     */
    public List<SensorReading> getReadingsByType(Type type);

    /**
     * List all readings sorted by location (alphabetical).
     */
    public void listSortedByLocation();

    /**
     * List all readings sorted by value;
     */
    public void listSortedByValue();

    /**
     * Return all readings filtered by type and location.
     *
     * @param location
     * @param type
     * @return
     */
    public List<SensorReading> findAllByLocationAndType(String location, Type type);

}

```

```java
public class SensorReading implements Comparable<SensorReading>{
    private int value;
    private String location;
    private Type type;

    public SensorReading(int value, String location, Type type) {
        this.value = value;
        this.location = location;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    public Type getType() {
        return type;
    }

    @Override
    public int compareTo(SensorReading o) {
        return this.location.compareTo(o.location);
    }

}
```

```java
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
```

```java
public enum Type {
    TEMPERATURE, HUMIDITY, PRESSURE;
}

```

```java
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
```

## Exercise 2

Review classes Equipment and EquipmentController from package 'isp.lab6.exercise2'. Provide implementation for methods so that all tests from EquipmentControllerTest and EquipmentTest classes will pass.

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EquipmentController {

    List<Equipment> list = new ArrayList<>();
    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        list.add(equipment);
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return list;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return list.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String, List<Equipment>> map = new HashMap<>(); 
 
        for(int i=0; i<list.size(); i++) {
            List<Equipment> ownerEquipments = new ArrayList<>();
            for(int j=0; j<list.size(); j++) {
                if(list.get(i).getOwner().equals(list.get(j).getOwner()))
                    ownerEquipments.add(list.get(i));
            }
            map.put(list.get(i).getOwner(), ownerEquipments);
        }

        return map;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getSerialNumber().equals(serialNumber)) {
                Equipment eq;
                eq = list.get(i);
                list.remove(i);
                return eq;
            }
        }
        return null;
    }
}
```

```java
public class Equipment {
    private String name;
    private String serialNumber;
    private String owner;
    private boolean taken;

    public Equipment(String serialNumber) {
        this.serialNumber = serialNumber;
        name = "bbb";
        owner = null;
        taken = false;
    }

    public Equipment(String name, String serialNumber) {
        this.serialNumber = serialNumber;
        this.name = name;
        owner = null;
        taken = false;
    }

    public Equipment(String name, String serialNumber, String owner) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.owner = owner;
        taken = true;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isTaken() {
        return taken;
    }

    /**
     * Provide the owner of the equipment
     * Equipment should be set as taken
     *
     * @param owner - owner name
     */
    public void provideEquipmentToUser(final String owner) {
        taken = true;
        this.owner = owner;
    }

    /**
     * Equipment is returned to the office
     * Equipment should not be set as taken
     * Remove the owner
     */
    public void returnEquipmentToOffice() {
        taken = false;
        this.owner = null;
    }
}
```

## Exercise 3
![Exercise 1 image](docs/ex1.jpg)

Given the UML class diagram above, implement the corresponding Java program.

1. Create Java class based on the diagram above. 
    * _SensorReading_ should should implement ```Comparable<SensorReading>``` for comparing by date and time
    * _Sensor_ should use ```Comparator<SensorReading>``` for comparing _SensorReading_ by value
2. Demonstrate the functionality of application in Exercise1 class main method.
    * Use _SensorsCluster.addSensor_ to add few sensors. NOTE: The method should return an instance to the newly created Sensor object or null if a sensor with given id already exists
    * Use _SensorsCluster.writeSensorReading_ to add some readings for previously added sensors. This method should search for sensor by sensorId and use the sensor addSensorReading() to add a new value. Method will return false if sensor cannot be found
    * Use _SensorsCluster.getSensorById_ to obtain a reference for a previously added sensor and display sorted readings by the 2 provided criterias
3. Create minimal unit tests for testing the behavior of the program.

**Note 1: Constructors and setter\getter methods are not represented in the diagram but can\should be implemented."**

**Note 2: You can add any extra methods if required.**

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum SensorType{
    TEMP, PRES;
}
/////////////////////////////////////////
class SensorReading implements Comparable<SensorReading>{
    double value;
    long dateAndTime;

    public SensorReading(double value, long dateAndTime) {
        this.value = value;
        this.dateAndTime = dateAndTime;
    }

    @Override
    public int compareTo(SensorReading o) {
        return (int)(value - o.value);
    }
}
/////////////////////////////////////////
class Sensor{
    ArrayList<SensorReading> readings = new ArrayList<>();
    String id;
    SensorType type;

    public Sensor(String id, SensorType type) {
        this.id = id;
        this.type = type;
    }

    public boolean addSensorReading(SensorReading reading){
        readings.add(reading);
        return true;
    }

    List<SensorReading> getSensorReadingSortedByValue(){
        Collections.sort(readings); //aceasta metoda utilizeaaz criteriul definiti in compareTo din clasa SensorReading)
        return readings;
    }

}
/////////////////////////////////////////
class SensorCluster{
    ArrayList<Sensor> sensors = new ArrayList<>();

    public void addSensor(String id, SensorType type){
        sensors.add(new Sensor(id, type));
    }

    public void writeSensorReading(String id, double value, long dtaeTime){
        for(Sensor s: sensors){
            if(s.id.equals(id)){
                s.addSensorReading(new SensorReading(value,dtaeTime));
            }
        }
    }

    public Sensor getSensorById(String id){
        return sensors.stream().filter(s -> s.id==id).findFirst().get();
    }

}
/////////////////////////////////////////
public class Exercise3 {

    public static void main(String[] args) {
        SensorCluster c = new SensorCluster();
        c.addSensor("1",SensorType.TEMP);

        c.writeSensorReading("1",8,9);
        c.writeSensorReading("1",1,91);
        c.writeSensorReading("1",7,92);
        c.writeSensorReading("1",5,93);
        c.writeSensorReading("1",2,19);

        Sensor s1 = c.getSensorById("1");
        List<SensorReading> rez = s1.getSensorReadingSortedByValue();


        ////////////
        rez.stream().forEach(s -> System.out.println(s.value));

        //////////
//        for(SensorReading s: rez){
//            System.out.println(s.value);
//        }


    }
}
```

## Exercise 4

Create a new version of ATM exercise from Laboratory 5 and use ArrayList instead of simple arrays[] for storing accounts in Bank class.

```java
import java.util.ArrayList;

//////////////////////////////////////////
abstract class Transaction{
    protected Account account;

    public Transaction(Account account) {
        this.account = account;
    }

    abstract String execute();
}

//////////////////////////////////////////
class Withdraw extends Transaction{
    private int amount;

    public Withdraw(int amount, Account account) {
        super(account);
        this.amount = amount;

    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String execute(){
        if(account.getBalance()>amount){
            account.setBalance(account.getBalance()-amount);
            System.out.println("Transaction executed");
        }
        return "EXECUTED!";
    }
}

//////////////////////////////////////////
class Card{
    private String cardId;
    private String pin;

    public Card(String cardId, String pin) {
        this.cardId = cardId;
        this.pin = pin;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}

//////////////////////////////////////////
class Account{
    private String owner;
    private int balance;
    private Card card;

    public Account(String owner, int balance, Card card) {
        this.owner = owner;
        this.balance = balance;
        this.card = card;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

//////////////////////////////////////////
class Bank{
    ArrayList<Account> list = new ArrayList<>();

    public void addAccount(Account a){
        list.add(a);
    }

    public void executeTransaction(Transaction t){
        t.execute();
    }

    public Account getAccountByCardId(String id){
        //....
        
        for(int i=0; i<=list.size(); i++)
            if(id.equals(list.get(i).getCard().getCardId()))
                return list.get(i);
                
        //return card
        return null;
    }
}

//////////////////////////////////////////
class ATM{
    private Bank bank;
    private Card card;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void insertCard(Card c, String pin){
        if(card==null){
            if(c.getPin().equals(pin)){
                System.out.println("Card accepted.");
                card = c;
            }else{
                System.out.println("Pin is not valid.");
            }
        }else{
            System.out.println("Card already inserted.");
        }
    }

    public void removeCard(){
        card = null;
    }

    public void withdraw(int amount){
        if(card!=null){
            Account acc = bank.getAccountByCardId(card.getCardId());
            Withdraw tw = new Withdraw(amount, acc);
            bank.executeTransaction(tw);

        }else{
            System.out.println("No card present.");
        }
    }
    
    public void checkMoney() {
        Account acc = bank.getAccountByCardId(card.getCardId());
        CheckMoney c = new CheckMoney(acc);
        bank.executeTransaction(c);
    }
    
    public void changePin(String oldPin, String newPin) {
        Account acc = bank.getAccountByCardId(card.getCardId());
        ChangePin p = new ChangePin(oldPin, newPin, acc);
        if(oldPin.equals(this.card.getPin()))
            bank.executeTransaction(p);
        else
            System.out.println("Invalid PIN!");
  
    } 
    
}

class CheckMoney extends Transaction{
    
    public CheckMoney(Account account) {
        super(account);
    }
    
    @Override
    public String execute() {
        System.out.println(this.account.getBalance());
        return "EXECUTED!";
    }
}

class ChangePin extends Transaction {
    private String oldPin;
    private String newPin;
    
    public ChangePin(String oldPin, String newPin, Account account) {
        super(account);
        this.oldPin = oldPin;
        this.newPin = newPin;
    }        
    
    @Override
    public String execute(){
        this.account.getCard().setPin(newPin);
        
        return "EXECUTED!";
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Card c1 = new Card("12345","0000");
        System.out.println(c1.getCardId());
        
        Account a1 = new Account("Mihai",1000, c1);

        System.out.println(a1.getCard().getPin());
        System.out.println(a1.getOwner());
        
        Bank bank = new Bank();
        bank.addAccount(a1);

        
        System.out.println(bank.list.get(0).getOwner());
        
        ATM atm = new ATM(bank);

        
        atm.insertCard(c1,"0000");
        atm.checkMoney();
        atm.withdraw(900);
        atm.checkMoney();
        atm.insertCard(c1,"1000");
        System.out.println(bank.getAccountByCardId("12345").getOwner());
}
}
```