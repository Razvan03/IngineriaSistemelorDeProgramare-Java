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
