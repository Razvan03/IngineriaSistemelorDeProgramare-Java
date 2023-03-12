package isp.lab2;

import java.util.Scanner;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int Vector[]=new int[n]; 
        Vector[0]=1;
        Vector[1]=2;
        for(int i=2;i<n;i++){
        Vector[i]=Vector[i-1]*Vector[i-2];
        }
        return Vector;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    /*
    public static int[] generateRandomVectorRecursively(int n) {
        int VectorRecursiv[]=new int[n];
        if(n==1)return VectorRecursiv;
        if(n==2)return VectorRecursiv[1];
        else{
            VectorRecursiv[n-1]=generateRandomVectorRecursively(n-1)+generateRandomVectorRecursively(n-2);
            return VectorRecursiv[n-1];
        }
    }
*/
    public static void main(String[] args) {
        // TODO: print the vectors
        Scanner scan = new Scanner(System.in);
        System.out.println("Numarul de elemente: ");
        int n = scan.nextInt();
        int[] Vector = generateVector(n);
        System.out.println("Vectorul generat este:");
        for (int i = 0; i < Vector.length; i++) {
            System.out.print(Vector[i] + ", ");
        }
        /*
        int[] VectorRecursiv = generateRandomVectorRecursively(n);
        System.out.println("Vectorul generat recursiv este:");
        for (int i = 0; i < VectorRecursiv.length; i++) {
            System.out.print(VectorRecursiv[i] + ", ");
        }
        */
    }
}
