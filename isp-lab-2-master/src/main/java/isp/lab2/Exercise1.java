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
