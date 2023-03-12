/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author Razvan
 */
public class TenantAlreadyExistsException extends Exception {
    String str;
    TenantAlreadyExistsException(String tenantAlreadyExistsException){
        str = tenantAlreadyExistsException;
    }
    @Override
    public String toString(){
        return ("TenantAlreadyExistsException occured: " + str);
    }
}
