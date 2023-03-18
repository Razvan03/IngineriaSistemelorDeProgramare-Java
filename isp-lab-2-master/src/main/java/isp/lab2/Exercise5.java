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
