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
