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
