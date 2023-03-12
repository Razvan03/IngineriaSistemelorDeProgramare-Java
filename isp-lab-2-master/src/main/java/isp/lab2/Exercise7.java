package isp.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        boolean visited[] = new boolean[8];
        Arrays.fill(visited, false);
        int num = (int)(Math.random() * (7 + 1));
        Scanner sc = new Scanner(System.in);
        int guess,times=0;
        System.out.println(
            "A number is chosen"
            + " between 0 to 7.");
        do{
        System.out.println(
             "Guess the number:");
        guess = sc.nextInt();
        if(visited[guess]==true)
        {
          System.out.println("The number " 
                  + guess +
                  " was already typed");
        }
        else
            if(guess<num){
            times++;
            System.out.println(
                    "The number is "
                    + "greater than " + guess);
        }
        else
            if(guess>num){
                times++;
                System.out.println(
                    "The number is "
                           + "less than " + guess);
            }
                else
                if(guess==num){
                    times++;
                    System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                        }
        visited[guess]=true;
        }while(guess!=num);
    return times;
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();
        System.out.println(
                    "You have tried "
                    + "times " + times);
    }
}
