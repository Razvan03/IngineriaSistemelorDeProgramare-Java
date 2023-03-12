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
        int n = (int) ((Math.random() * (10 - 2)) + 1);
        int[] intArray = new int[n];
        System.out.println("Numarul generat: "+n);
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<n;i++){
        int num = scan.nextInt();
        intArray[i] = num;}
        return intArray;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param intArray the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] intArray) {
        double total = 0;
        for(int i=0; i<intArray.length; i++){
        	total = total + intArray[i];}
        double average = total / intArray.length;
        return average;

    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
