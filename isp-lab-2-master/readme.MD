# Starting from the template, implement the following exercises:

1) Implement a program according to speciffications bellow:
- Generate a random number n between 2 and 10;
- Populate an array of size n with integers read from the keyboard;
- Compute the arithmetical mean of the array populated in previous step.

```java

 package isp.lab2;

import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
       int n = (int)(Math.random()*(10 - 2) + 2);
        int[] intArray= new int[n]; //declarare vect de nr intregi, de marime n;
        Scanner scan= new Scanner(System.in);
        System.out.println("Dati" + n + " numere:");
        for(int i=0;i<n;i++){ //citim de la tastatura si punem in Array
            int num=scan.nextInt();
            intArray[i]= num;
           
        }
        return intArray;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        double media=0;
        for(int i=0;i<userNumbers.length;i++){
            media=media+userNumbers[i];}
        return media/userNumbers.length;
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
```

2) Implement an application that allows the users to search and find all the words that start with a specific letter in an array.
First, the user is asked to input all the words, on one line, separated by comma (e.g. apples,computer,bread,tea,car).
Next, the user is asked to input the starting letter.
The result(s) are to be printed on a new line.
Hint: use the String's split() method to extract the words from the first input line. Then, store them into an array.

```java
package isp.lab2;

import java.util.Scanner;

/**
 * Check readme.md file for the exercise requirements.
 *
 * @author Radu Miron
 */
public class Exercise2 {
    /**
     * Reads an enumeration of words separated by comma.
     *
     * @return The console input enumeration if it's valid, null otherwise.
     */
    public static String readEnumeration() {
        System.out.println("Please input an enumeration of words separated by comma:");

        Scanner scanner = new Scanner(System.in);
        String enumeration = scanner.nextLine();

        if (enumeration.trim().length() > 0) {
            return enumeration;
        } else {
            return null;
        }
    }

    /**
     * Reads the searched words starting letter.
     *
     * @return The starting character if it's a valid letter, null otherwise.
     */
    public static Character readStartingLetter() {
        System.out.println("Please input the starting letter of the words you want to search:");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (line.length() > 0) {
            return line.charAt(0);
        } else {
            return null;
        }
    }

    /**
     * Splits a given {@link String} by comma.
     * TODO: Use {@link String#split(String splitBy)} to split the enumeration;
     * TODO: If you plan on using also whitespace characters in your enumeration (eg. " apple , cat, mouse"), use {@link String#trim()} for each word.
     *
     * @param inputEnumeration The words' enumeration.
     * @return An array of words.
     */
    public static String[] splitEnumerationIntoWords(String inputEnumeration) {
        String[] words = inputEnumeration.split(",");
        
        return words;   
    }

    /**
     * Finds the words starting with a given letter in an array.
     *
     * @param words          The array of words.
     * @param startingLetter The starting letter.
     * @return All the words starting with the given letter.
     */
    public static String[] findWordsStartingWith(String[] words, Character startingLetter) {
        int k=0;
        String[] results = new String[20];
        for(int i=0; i<words.length; i++)
        {
            if(words[i].charAt(0) == startingLetter)
               results[k++] = words[i];
        }
        String[] resultsFinal = new String[k];
        for(int i=0; i<k; i++)
            resultsFinal[i] = results[i];
        return resultsFinal;
    }

    public static void main(String[] args) {
        String enumeration = readEnumeration();
        Character startingLetter = readStartingLetter();

        if (enumeration != null && startingLetter != null) {
            String[] words = splitEnumerationIntoWords(enumeration);
            String[] results = findWordsStartingWith(words, startingLetter);
            // print results
            if(results[0] != null)
            {
                for(int i=0; i<results.length; i++)
                    if(results[i] != null)
                        System.out.println(results[i] + " ");
            }
            else
                System.out.println(" ########## niciun cuvant potrivit ########## ");        
        } else {
            System.out.println(" ########## invalid input ########## ");
            // print invalid input(s) message
        }
    }
}
```

3) 
- Write a program which display the geometric mean of the primes number from [a,b] where a,b->[1,200] a<b, a and b are read from keyboard.
- Giving a vector of first N prime numbers, display the number of prime numbers which have the sum of digits an even number.

```java
package isp.lab2;

import java.util.Scanner;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
       if (number <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(number); i++) {  
           if (number % i == 0) {  
               return false;  
           }  
       }  
       return true; 
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while(number!=0)
        {
            sum += number%10;
            number /= 10;
        }
        return sum;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
        int[] vector = new int[20];
        int k=0;
        for(int i=a;i <=b; i++)
            if(isPrimeNumber(i))
                vector[k++] = i;
        int[] vectorFinal = new int[k];
        for(int i=0; i<k; i++)
            vectorFinal[i] = vector[i];

        return vectorFinal;
    }

    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */

    public static double calculateGeometricMean(int[] primeNumbers) {
        double medie=1;
        
        for(int i=0; i<primeNumbers.length; i++)
            medie *= primeNumbers[i];
       
        medie = Math.pow(medie, 1.0/primeNumbers.length);
    
        return medie;
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        for(int i=0; i<primeNumbers.length; i++)
            System.out.printf("%d ", primeNumbers[i]);
        System.out.println("\nLungimea acestuia este: " + primeNumbers.length);
        
        int ct = 0;
        for(int i=0; i<primeNumbers.length; i++)
            if(calculateSumOfDigits(primeNumbers[i])%2==0)
                ct++;
        
        return ct;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti a = ");
        a = scan.nextInt();
        System.out.println("\nIntroduceti b = ");
        b = scan.nextInt();
        System.out.println("\nThe geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("\nVectorul de numere prime este: ");
        
        System.out.println("\nThe number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
```

4) Given an vector of N integer elements. Display the first prime/odd/even number from the vector and their respective position

```java
package isp.lab2;

public class Exercise4 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        if (number <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(number); i++) {  
           if (number % i == 0) {  
               return false;  
           }  
       }  
       return true; 
    }

    /**
     * This method should get the first(by position) odd number from the given array
     *
     * @param someNumbers the given int array
     * @return first odd number from the array
     */
    public static int firstOdd(int[] someNumbers) {
        for(int i=0; i<someNumbers.length; i++)
            if(someNumbers[i]%2!=0)
                    return someNumbers[i];
        return 0;
    }

    /**
     * This method should get the first(by position) even number from the given array
     *
     * @param someNumbers the given int array
     * @return first even number from the array
     */
    public static int firstEven(int[] someNumbers) {
        for(int i=0; i<someNumbers.length; i++)
            if(someNumbers[i]%2==0)
                    return someNumbers[i];
        return 0;
    }

    /**
     * This method should get the first(by position) prime number from the given array
     *
     * @param someNumbers the given int array
     * @return first prime number from the array
     */
    public static int firstPrime(int[] someNumbers) {
        // TODO: Use isPrimeNumber(final int number)
        for(int i=0; i<someNumbers.length; i++)
            if(isPrimeNumber(someNumbers[i]))
                return someNumbers[i];
        return 0;
    }

    /**
     * Don't forget to also display the position of ech number
     */
    public static void main(String[] args) {
        int[] someNumbers = new int[]{15, 18, 13, 22, 21, 11, 57, 141, 563, 16};

        System.out.println("First odd number: " + firstOdd(someNumbers));
        System.out.println("First even number: " + firstEven(someNumbers));
        System.out.println("First prime number: " + firstPrime(someNumbers));
    }
}
```


5) Generate a vector of size 20 with random elements from [-1000,1000].
	<br>-display the vector.
	<br>-sort the vector using bubbleSort or quickSort or mergeSort or any sort method
	<br>-display the sorted vector

```java
package isp.lab2;

import java.util.Scanner;

public class Exercise5 {

    /**
     * This method should generate an array that have 20 random nubers between -1000 and 1000
     *
     * @return the random numbers
     */
    public static int[] generateRandomNumbers() {
        int[] intArray = new int[20]; //declarare vect de nr intregi, de marime n;
       
        for(int i=0; i<20; i++) //citim de la tastatura si punem in Array
            intArray[i]= (int)(Math.random()*(1000 - (-1000) + 1) + (-1000));
           
        return intArray;
    }

    /**
     * This method should sort the given random numbers
     *
     * @param randomNumbers numbers generated random
     * @return sorted int array
     */
    public static int[] getSortedNumbers(int[] randomNumbers) {
        boolean semn;
        int i;
        do
        {
            semn = true;
            for(i=0; i<randomNumbers.length-1; i++)
                if(randomNumbers[i]>randomNumbers[i+1])
                {
                    int aux = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[i+1];
                    randomNumbers[i+1] = aux;
                    semn = false;
                }
        }while(!semn);
        return randomNumbers;
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        // display the sorted numbers
        System.out.println("\n\nThe sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + ", ");
        }
    }
}
```

6) Generate a vector which multiply the precedent 2 values from the vector. First 2 elements of the vector are always 1 and 2. Generate first n elements(n >= 8)
<br> EX: 1, 2, 2, 4, 8, 32, 256, 8192, ...
	<br>a) non-recursively 
	<br>b) recursively

```java
package isp.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int[] intArray = new int[n]; //declarare vect de nr intregi, de marime n;
        
        intArray[0] = 1;
        intArray[1] = 2;
        
        for(int i=2; i<n; i++) //citim de la tastatura si punem in Array
            intArray[i] = intArray[i-1]*intArray[i-2];
           
        return intArray;
    }
    
    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateRandomVectorRecursively(int n) {

        if (n == 1) {
            return new int[1]; 
        }
        else if(n == 2) {
            return new int[] { 1, 2 };
        }
        else {
            int[] v = generateRandomVectorRecursively(n-1);
            int[] v2 = Arrays.copyOf(v, v.length+1);
                v2[n-1] = v2[n-2]*v2[n-3];
                return v2;
                
        }
        

    }

    public static void main(String[] args) {
        // TODO: print the vectors
        int[] intArray;
        
        System.out.println("Please input the value of n: ");
        Scanner scanner = new Scanner(System.in);      
        int n = scanner.nextInt();
        if(n <= 9)
        {
            intArray = generateVector(n);
            System.out.println("The non-recursively generated Array is: ");
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + ", ");
            }
            System.out.println("\n\nThe non-recursively generated Array is: ");      
            intArray = generateRandomVectorRecursively(n);
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + ", ");
            }
 
        }
        else
            System.out.println("Please input n<=9!");
        
        
    }
}
```

7) Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small. At the end the number of tries needed should be printed. It counts only as one try if they input the same number multiple times consecutively. 

```java
package isp.lab2;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        return (int)(Math.random()*(7 - 0 + 1) + 0);
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};      // ############ Nu am inteles cerinta.... cine ii ucl si cine ii answers? ############
                                                             // ############ Si ce fac cu nr. random?                                  ############
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times, k=0;
        boolean semn = true;
        int count = 0;
        
        do
        {
            times = generateARandom();
            ucl[k++] = times;
            
            if(times != answers[k-1])
            {
                if(k<=1 || ucl[k-1] != ucl[k])
                    count++;
                if(ucl[k-1] < answers[k-1])
                {
                    System.out.println("Raspunsul utilizatorului: " + ucl[k-1]);
                    System.out.println("Raspunsul corect: " + answers[k-1]);
                    System.out.println("The nr. was too small");
                }
                else
                {
                    System.out.println("Raspunsul utilizatorului: " + ucl[k-1]);
                    System.out.println("Raspunsul corect: " + answers[k-1]);
                    System.out.println("The nr. was too large");
                }
                    
            }
            else
            {
                System.out.println("Raspunsul utilizatorului: " + ucl[k-1]);
                System.out.println("Raspunsul corect: " + answers[k-1]);
                break;
            }   
            if(count == answers.length)
                semn = false;
        }while(semn);
        
        if(semn)
            System.out.print("Nr. incercari: " + count);
        else
            System.out.print("Utilizatorul nu a reusit sa ghiceasca!");
        
    }
}
```