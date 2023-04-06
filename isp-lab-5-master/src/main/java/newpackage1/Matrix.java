/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

/**
 *
 * @author Razvan
 */

import java.util.*;

public class Matrix {
    public static void main(String args[]) {
        
        // Initializing the 3X3 matrix
        int matrix[][] = {{6,9,8},{2,5,1},{7,4,3}};
        
        System.out.print("The matrix elements are: ");
        printMatrix(matrix);
        
        System.out.print("\nThe sorted matrix is: ");
        printMatrix(sortMatrix(matrix));
    }

    static int[][] sortMatrix(int matrix[][])
    {
        int temp[] = new int [3*3];
        int k = 0, row, col;
        
        // Copying the array elements into a 1D array
        for(row=0; row<3; row++) {
            for(col=0; col<3; col++) {
                temp[k++]=matrix[row][col];
            }
        }
        
        // Sorting the 1D array
        Arrays.sort(temp);
        k=0;
        
        // Copying the elements from the sorted array into the 2D array
        for(row=0;row<3;row++) {
            for(col=0;col<3;col++) {
                matrix[row][col] = temp[k++];
            }
        }
        return matrix;
    }
    
    // Method to print the matrix
    static void printMatrix(int matrix[][]) {
        int row, col;

        for(row=0;row<3;row++) {

            System.out.print("\n");
            for(col=0; col<3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
        System.out.print("\n");
    }
}




