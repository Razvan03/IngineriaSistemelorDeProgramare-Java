/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author Razvan
 */
public class TooManyAttemptsException extends Exception{
    String str;
    static boolean tooMany = false;
    TooManyAttemptsException(String tooManyAttemptsException){
        str = tooManyAttemptsException;
        tooMany=true;
    }
    @Override
    public String toString(){
        return ("TooManyAttemptsException occured: " + str);
    }
}
