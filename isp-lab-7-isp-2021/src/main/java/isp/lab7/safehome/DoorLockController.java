/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Razvan
 */
public class DoorLockController implements ControllerInterface{
    private Map<Tenant,AccessKey> validAccess;
    private Door door;
    private List<AccessLog> list;
    @Override
    public DoorStatus enterPin(String pin) throws Exception{
        AccessKey ePin = new AccessKey(pin);
        if(!(validAccess.containsValue(ePin) || pin.equals(MASTER_KEY)))
        {
           if(InvalidPinException.getCount() < 3 && TooManyAttemptsException.tooMany==false)
           {
               throw new InvalidPinException("The pin in invalid\n");           
           }
           else
           {
               throw new TooManyAttemptsException("You have reached the maximum attempts\n");
           }
        }

            System.out.println("The pin is correct!\n");
            if(door.getStatus().equals(DoorStatus.OPEN))
            {
                door.lockDoor();
                System.out.println("The door is now locked\n");
            }
                
            else
            {
                door.unlockDoor();
                System.out.println("The door is now unlocked\n");
            }
            if(pin.equals(MASTER_KEY)){
                InvalidPinException.resetCount();
            }
    
        return door.getStatus();
        }
    @Override
     public void addTenant(String pin, String name) throws Exception{
         Tenant person = new Tenant(name);
         AccessKey ak = new AccessKey(pin);
         if(validAccess.containsKey(person))
         {
             throw new TenantAlreadyExistsException("Tenant with this name already exists.\n");
         }
         validAccess.put(person,ak);
     }
    @Override
     public void removeTenant(String name) throws Exception{
         Tenant person = new Tenant(name);
         if(!validAccess.containsKey(person))
         {
             throw new TenantAlreadyExistsException("Tenant with this name doesn't exists.\n");
         }
         validAccess.remove(person);
     }
     
    @Override
    public List<AccessLog> getAccessLogs() throws Exception {
        List<AccessLog> gList = new ArrayList();
        return gList;
    }
}

