/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author Razvan
 */
public class InvalidPinException extends Exception{
    private static int count;
    String str;
    InvalidPinException(String invalidPinException)
    {
        str = invalidPinException;
        count++;
    }
    
    @Override
    public String toString(){
        return ("InvalidPinException occured: " + str);
    }
    public static int getCount()
    {
        return count;
    }
    public static void resetCount()
    {
        count = 0;
    }
}
