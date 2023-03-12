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

## Exercise 2

A class called Rectangle contains:
- Three private instance variables: length (of type int), width(of type int) and color (of type String), with default value of 2, 1 and “red”, respectively.
- One overloaded constructor which sets the length and the width;
- One overloaded constructor which sets the length, the width and the colors;
- Five public methods: getLength(), getWidth(), getColor(), getPerimeter() and getArea().

1. Write a class which models the class Rectangle.
2. Create a rectangle object, call all his methods and print out the values(in main)


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

