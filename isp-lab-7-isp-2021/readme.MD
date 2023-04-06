# Lab 7 - Safe Home Access


## Exercise 1 - Java implementation
![Exercise 1 image](docs/ex1.jpg)

Implement a safe home access Java application based on the diagram above. Consider following functional requirements in implementing your program:
1. If pin is wrong _enterPin_ method shall throw an _InvalidPinException_.
2. If 3 consecutive attempts are made to enter pin then door is locked(until master key pin is used) and _enterPin_ method shall throw TooManyAttemptsException. Any further invocations of _enterPin_ method will throw TooManyAttemptsException.
3. If master key pin is used, door will be unlocked and retries count will be reset to 0. 
4. If pin is correct, door shall be opened or closed depending on current state (if open will be closed, if closed will be opened)
5. When tenant already exists by name, _addTenant_ method will throw TenantAlreadyExistsException.
6. When tenant not found, _removeTenant_ method will throw TenantNotFoundException. 
7. All attempts (successful or not) will be logged in access log list.

**NOTE - Java project come with prefiled unit tests. You should make sure all tests pass. DO NOT change unit tests (except initialisation of Controller object in the _instantiateDoorController()_ method**).

Test all operations in _main_ method from _SafeHome_ class.
Make sure all tests pass.

```Java
package isp.lab7.safehome;

import java.util.List;

public interface ControllerInterface {
    /**
     * Master key used by
     */
    String MASTER_KEY = "MasterKeyValue";

    /**
     *
     */
    String MASTER_TENANT_NAME = "MasterTenant";

    /**
     * Lock / unlock door based on <param>pin</param> input
     * If pin is wrong, {@link InvalidPinException} exception will be thrown
     * If 3 consecutive entered pins are wrong, {@link TooManyAttemptsException} exception will be thrown
     * If {@link ControllerInterface#MASTER_KEY} is used as input value, number of retries will be reset to 0 and door will be locked / unlocked based on its current state
     *
     * @param pin - pin value
     * @return current {@link DoorStatus} status
     * @throws Exception
     */
    public DoorStatus enterPin(String pin) throws Exception;

    /**
     * Add new tenant in the system
     * When tenant with this name already exists, {@link TenantAlreadyExistsException} will be thrown
     *
     * @param pin  - pin to be added in the system
     * @param name - tenant name to be added in the system
     * @throws Exception
     */
    void addTenant(String pin, String name) throws Exception;

    /**
     * Remove existing tenant from the system
     * When tenant with this name not found, {@link TenantNotFoundException} will be thrown
     *
     * @param name - tenant name to be removed
     * @throws Exception
     */
    void removeTenant(String name) throws Exception;
    
    List<AccessLog> getAccessLogs() throws Exception;
}

```

```java
package isp.lab7.safehome;

/**
 *
 * @author Razvan
 */
public class AccessKey {
    private String pin;

    public AccessKey(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }
    
}
```

```java
package isp.lab7.safehome;

import java.time.LocalDateTime;

/**
 *
 * @author Razvan
 */
public class AccessLog {
    private String tenantName;
    private LocalDateTime dateTime;
    private String operation;
    private DoorStatus doorStatus;
    private String errorMessage;

    public AccessLog(String tenantName, LocalDateTime dateTime, String operation, DoorStatus doorStatus, String errorMessage) {
        this.tenantName = tenantName;
        this.dateTime = dateTime;
        this.operation = operation;
        this.doorStatus = doorStatus;
        this.errorMessage = errorMessage;
    }
}
```

```java
public class Door {
    private DoorStatus status;
    void lockDoor(){
        status=DoorStatus.CLOSED;
    }
    void unlockDoor(){
        status=DoorStatus.OPEN;
    }
    public Door(DoorStatus status){
    this.status=status;
    }

    public DoorStatus getStatus() {
        return status;
    }
    
}

```

```java
public enum DoorStatus {
    OPEN, CLOSED;
}
```

```java
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
```

```java
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
```

```java
public class Tenant {
    private String name;
    public Tenant(String name){
        this.name=name;
    }
}
```

```java
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

```

```java
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

```

```java
import java.util.logging.Level;
import java.util.logging.Logger;

public class SafeHome {

    public static void main(String[] args) {
    try {
            DoorLockController DLC = new DoorLockController();
            DLC.addTenant("123", "name1");
        } catch (Exception ex) {
            Logger.getLogger(SafeHome.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
```

