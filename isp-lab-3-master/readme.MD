# Implement the following exercises:

## Exercise 1

A class Tree contains:
- One instance variable 'height' (of type int) representing the height of tree;
- One default constructor which initialize the height to 15;
- One grow(int meters) method which add to the current height the meters given as long as meters >= 1;
- One toString() method which returns the height of the tree;
   
1. Write a class which models the class Tree. 
2. Write a class TreeTest which test the Tree class. You have to write three tests:
    * for grow(int meters) method
    * for toString() method
3. Create a tree object and call all his methods and print out the values(in main)

```java
package isp.lab3.exercise1;

/**
 *
 * @author Razvan
 */
public class Tree {
    public int height;
    
    public Tree(){
        height = 15;
    }
    
    public void grow(int meters){
            if(meters >= 1)
                height += meters;
    }
    
    public String toString(Tree t){
        
        return Integer.toString(t.height);
    }
    
}
 
```


## Exercise 2

A class called Rectangle contains:
- Three private instance variables: length (of type int), width(of type int) and color (of type String), with default value of 2, 1 and “red”, respectively.
- One overloaded constructor which sets the length and the width;
- One overloaded constructor which sets the length, the width and the colors;
- Five public methods: getLength(), getWidth(), getColor(), getPerimeter() and getArea().

1. Write a class which models the class Rectangle.
2. Create a rectangle object, call all his methods and print out the values(in main)

```java
package isp.lab3.exercise2;

/**
 *
 * @author Razvan
 */

public class Rectangle {
    private int length;
    private int width;
    private String color;
    
    public Rectangle(){
        length = 2;
        width = 1;
        color = "â€œredâ€";
    }
    
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        color = "x";
    }
    
    public Rectangle(int length, int width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public int getPerimeter() {
        return this.length*2+this.width*2;
    }
    
    public int getArea() {
        return this.length*this.width;
    }

}
```

## Exercise 3 

A class called Vehicle contains:
- Four private instance variables: model (String), type (String), speed (int) and fuelType (char of either 'D' or 'B');
- One constructor to initialize the attributes;
    * There is no default constructor
- Public getters/setters for all attribtes; 
  A toString() method that returns “{mode} ({type}) speed {teem} ”, e.g., “Dacia (Logan) speed 150 fuel type B”.

1. Write the Vehicle class.
2. Create two Vehicle object and test getter and setter methods (in main).
3. Compare and test if the two objects created in step before are equals (using public boolean equals(Object o) method).
4. Use a static atribute in Vehicle class to test number of Vehicle objects created. Add static method in Vehicle class which display number of objects created of type Vehile.
5. Write a test class (called VehicleTest) to test toString() method.

```java
package isp.lab3.exercise3;

/**
 *
 * @author Razvan
 */

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    public static int nrVehicles = 0;
    
    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        nrVehicles++;
    }
    
    public String getModel() {
        return this.model;
    }
      
    public String getType() {
        return this.type;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public char getFuelType() {
        return this.fuelType;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }
    
    public String toString(){
        
        return String.valueOf(this.getModel() + " (" + this.getType() + ") speed " + this.getSpeed() + " fuel type " + this.getFuelType() + "â€");
    }
    
    public static void nrVehicles() {
        System.out.println("\nNb. of vehicles: " + nrVehicles);
    }
    
 
}
```

## Exercise 4

A class called MyPoint, which models a 3D point with x, y and z coordinates contains:
- Three instance variables x (int), y (int) and z(int).
- A “no-argument” (or “no-arg”) constructor that construct a point at (0, 0, 0).
- A constructor that constructs a point with the given x, y and z coordinates.
- Getter and setter for the instance variables x, y and z.
- A method setXYZ(int x, int y, int z) to set all  x, y and z.
- A toString() method that returns a string description of the instance in the format “(x, y, z)”.
- A method called distance(int x, int y, int z) that returns the distance from this point to another point at the given (x, y, z) coordinates.
- An overloaded distance(MyPoint another) that returns the distance from this point to the given MyPoint instance another.

1. Write the code for the class MyPoint.
2. Write a test class (called MyPointTest) to test distance(...) method.
3. Create two point objects, calculate and display distance between them (in main). 

```java
package isp.lab3.exercise4;

/**
 *
 * @author Razvan
 */
public class MyPoint {
    private int x, y, z;
    
    public MyPoint() {
        x = 0;
        y = 0;
        z = 0;
    }
    
    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setZ(int z) {
        this.z = z;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getZ() {
        return z;
    }
    
    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public String toString() {
        return String.valueOf("â€œ(" + this.getX() + ", " +  this.getY() + ", " + this.getZ() + ")â€");
    }
    
    public int distance(int x, int y, int z) {
        int dx, dy, dz;
        
        dx = (int)Math.pow(this.x - x, 2); 
        dy = (int)Math.pow(this.y - y, 2);
        dz = (int)Math.pow(this.z - z, 2);
        
        return (int)Math.sqrt(dx+dy+dz);
    }
    
    public int distance(MyPoint another) {
        int dx, dy, dz;
        
        dx = (int)Math.pow(this.x - another.x, 2); 
        dy = (int)Math.pow(this.y - another.y, 2);
        dz = (int)Math.pow(this.z - another.z, 2);
        
        return (int)Math.sqrt(dx+dy+dz);
    }
    
}
```


# Exercise 5 

A class VendingMachine contains:
- A method displayProducts() - display available products and corresponding selection id; 
- A method insertCoin(int value) - add coins to current vending machine credit;
- A method String selectProduct(int id) - return a String representing name of the selected product or an error message; 
- A method displayCredit - display current available credit; 
- A method userMenu() - provide a text based menu for interacting with vending machine. 

1. Write the code for VendingMachine. Consider adding any additional methods and attributes (if required) to implement the vending machine behaviour.
2. Write a test class (called VendingMachineTest) to test methods: displayProducts, insertCoin, selectProduct.
3. Create a vending machine object and test it in main.

```java
package isp.lab3.exercise5;

import java.util.Scanner;

/**
 *
 * @author Razvan
 */
public class VendingMachine {
    static int credit = 0;
    static private int[] id = new int[10];
    static private String[] name = new String[10];
    static private int[] productValue = new int[10];
    static private int nrProduse = 0;
    
    static int produseSelectate = 0;
    static int costTotalProduseSelectate = 0;
    
    public VendingMachine(int id, String name, int productValue) {
        this.id[nrProduse] = id;
        this.name[nrProduse] = name;
        this.productValue[nrProduse++] = productValue;
    }
    
    public String getName(int i) {
        return name[i];
    }
    
    public int getCoin() {
        return credit;
    }
    
    static public void displayProducts() {
        for(int i=0; i<nrProduse; i++)
            System.out.println("\nProdus " + (i + 1) + ") " + name[i] + ", pret: " + productValue[i] + ", id: " + id[i]);
    }
    
    static public void insertCoin(int value) {
        if(value >= 0)
            credit += value;
    }
    
    static public String selectProduct(int idC) {
        for(int i=0; i<nrProduse; i++)
            if(id[i] == idC)
            {
                costTotalProduseSelectate += productValue[i];
                return name[i];
            }
        
        return "\nError! Product not found.";
    }
    
    static private void displayCredit() {
        System.out.println("\nCredit: " + credit);
    }
    
    static public void userMenu() {
        boolean semn = true; 
        Scanner scan = new Scanner(System.in);
        displayProducts();

        while(semn) {
            
            System.out.println("\nApasati tasta:  <0> pentru a selecta produse.");
            System.out.println("\n                <1> pentru a introduce creditul.");
            System.out.println("\n                <2> pentru a anula comanda.");
            
            int op = scan.nextInt();
        
            switch(op)
            {
                case 0: {
                            if(credit != 0)
                            {
                                System.out.println("\nFinalizati comanda inainte de a face alta!");
                                break;
                            }
                            System.out.println("\nIntroduceti id-ul produsului: ");
                            String n = selectProduct(scan.nextInt());
                            if(n == "\nError! Product not found.")
                                System.out.println("\n " + n + "\n\nIncercati din nou.");
                            else
                            {
                                System.out.println("\nProdusul selectat: " + n);
                                produseSelectate++;
                                System.out.println("\nTotal produse: " + produseSelectate);
                                System.out.println("\nTotal cost: " + costTotalProduseSelectate);  
                            }
                            break;
                        }
                case 1: {
                            if(costTotalProduseSelectate == 0)
                            {
                                System.out.println("\nIntroduceti produsele dorite prima data!");
                                break;
                            }
                            System.out.println("\nIntroduceti creditul: ");

                            insertCoin(scan.nextInt());
                            if(credit < costTotalProduseSelectate)
                            {
                                displayCredit();
                                System.out.println("\nMai trebuie sa introduceti: " + (costTotalProduseSelectate - credit) + " credit.");
                            }
                            else
                            {
                                if(credit > costTotalProduseSelectate)
                                      System.out.println("\nO sa primiti rest: " + (credit - costTotalProduseSelectate));
                                semn = false;
                                System.out.println("\n\nAsteptati sa primiti produsele!");
                            }

                            break;
                        }
                case 2: {
                            if(credit != 0)
                                System.out.println("\nAsteptai sa va fie returnat creditul!");
                            credit = 0;
                            costTotalProduseSelectate = 0;
                            break;
                        }
                default:    {
                                System.out.println("\nOptiune gresita! \nIncercati din nou.");
                                break;
                            }
            }
        }
    }
    
}
```
# Exercise 6 

Create a new version of VendingMachine and transform the class in a singleton. References:
- https://sourcemaking.com/design_patterns/singleton 
- https://sourcemaking.com/design_patterns/singleton/java/2 

```java
package isp.lab3.exercise6;

import java.util.Scanner;

/**
 *
 * @author Razvan
 */
public final class VendingMachineNew {
    private static volatile VendingMachineNew instance;
    static int credit = 0;
    static private int[] id = new int[10];
    static private String[] name = new String[10];
    static private int[] productValue = new int[10];
    static private int nrProduse = 0;
    
    static int produseSelectate = 0;
    static int costTotalProduseSelectate = 0;
    
    private VendingMachineNew(int id, String name, int productValue) {
        this.id[nrProduse] = id;
        this.name[nrProduse] = name;
        this.productValue[nrProduse++] = productValue;
    }
    
    public static VendingMachineNew getInstance() {
        if (instance == null) {
            synchronized (VendingMachineNew.class) {
                if (instance == null) {
                    instance = new VendingMachineNew(10, "banana", 10);
                    instance = new VendingMachineNew(25, "apa", 16);
                    instance = new VendingMachineNew(46, "ciocolata", 25);
                    instance = new VendingMachineNew(70, "coffeee", 30);

                }
            }
        }
        return instance;
    }

    public String getName(int i) {
        return name[i];
    }
    
    public int getCoin() {
        return credit;
    }
    
    static public void displayProducts() {
        for(int i=0; i<nrProduse; i++)
            System.out.println("\nProdus " + (i + 1) + ") " + name[i] + ", pret: " + productValue[i] + ", id: " + id[i]);
    }
    
    static public void insertCoin(int value) {
        if(value >= 0)
            credit += value;
    }
    
    static public String selectProduct(int idC) {
        for(int i=0; i<nrProduse; i++)
            if(id[i] == idC)
            {
                costTotalProduseSelectate += productValue[i];
                return name[i];
            }
        
        return "\nError! Product not found.";
    }
    
    static private void displayCredit() {
        System.out.println("\nCredit: " + credit);
    }
    
    static public void userMenu() {
        boolean semn = true; 
        Scanner scan = new Scanner(System.in);
        displayProducts();

        while(semn) {
            
            System.out.println("\nApasati tasta:  <0> pentru a selecta produse.");
            System.out.println("\n                <1> pentru a introduce creditul.");
            System.out.println("\n                <2> pentru a anula comanda.");
            
            int op = scan.nextInt();
        
            switch(op)
            {
                case 0: {
                            if(credit != 0)
                            {
                                System.out.println("\nFinalizati comanda inainte de a face alta!");
                                break;
                            }
                            System.out.println("\nIntroduceti id-ul produsului: ");
                            String n = selectProduct(scan.nextInt());
                            if(n == "\nError! Product not found.")
                                System.out.println("\n " + n + "\n\nIncercati din nou.");
                            else
                            {
                                System.out.println("\nProdusul selectat: " + n);
                                produseSelectate++;
                                System.out.println("\nTotal produse: " + produseSelectate);
                                System.out.println("\nTotal cost: " + costTotalProduseSelectate);  
                            }
                            break;
                        }
                case 1: {
                            if(costTotalProduseSelectate == 0)
                            {
                                System.out.println("\nIntroduceti produsele dorite prima data!");
                                break;
                            }
                            System.out.println("\nIntroduceti creditul: ");

                            insertCoin(scan.nextInt());
                            if(credit < costTotalProduseSelectate)
                            {
                                displayCredit();
                                System.out.println("\nMai trebuie sa introduceti: " + (costTotalProduseSelectate - credit) + " credit.");
                            }
                            else
                            {
                                if(credit > costTotalProduseSelectate)
                                      System.out.println("\nO sa primiti rest: " + (credit - costTotalProduseSelectate));
                                semn = false;
                                System.out.println("\n\nAsteptati sa primiti produsele!");
                            }

                            break;
                        }
                case 2: {
                            if(credit != 0)
                                System.out.println("\nAsteptai sa va fie returnat creditul!");
                            credit = 0;
                            costTotalProduseSelectate = 0;
                            break;
                        }
                default:    {
                                System.out.println("\nOptiune gresita! \nIncercati din nou.");
                                break;
                            }
            }
        }
    }
    
}
```