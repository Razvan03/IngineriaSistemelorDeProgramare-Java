# Air Traffic Control System

In this lab you will implement a simplified air traffic control (ATC) sistem which allow user to add airplains and controll them.

## Use Case Diagram
![Exercise 1 image](docs/UseCaseDiagram1.jpg)

## Aircraft State Machine Diagram
![Exercise 2 image](docs/StatechartDiagram1.jpg)

## ATC Class Diagram
![Exercise 1 image](docs/ClassDiagram1.jpg)

## Requirements

- R0 - When added aircraft is in On Stand state. In this state airplain is waiting for a comand from ATC;
- R1 - When aircraft receives takeoff command will go into Taxing state and will stay there for 10 seconds; 
- R2 - From Taxing aircraft will go into Taking off state and will stay there for 5 seconds;
- R3 - Take off command contains cruising altitude for the aircraft;
- R4 - Aircraft will stay in Ascending state till aircraft reach cruising altitude. Altitude is given by ATC in 1.000 meters increments and needs 10 seconds for each increment. Example: altitude 3 = means aircraft cruising altitude is 3.000 meters and will need 30 seconds to reach that altitude;
- R5 - Aircraft can receive land command only when is at cruising altitude;
- R6 - Descending will be done in 1.000 meters increments;
- R7 - When aircraft has reached altitude 0 is considered landed;
- R8 - Aircraft will keep track of number of seconds spent in "Cruising" state and will display it after it landed;
- [OPTIONAL] - Add a graphical user interface to let user interact wit ATC system;

## Implementation recommendations

- User interaction is done trough a console based user interface (Example: user will enter command TAKEOFF {aircraftid} {altitude} or LAND {aircrfatid}); 
- Aircraft objects are implemented as threads;
- After aircraft land the thread will be finished;
- Use wait()\notify() mechanism to implement mechanism for aircraft to wait for ATC command; 

```java
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Razvan
 */
public class ATC {
    
    List<Aircraft> aircrafts;
    
    public ATC() {
        aircrafts = new ArrayList<>();
    }
    
    public void addAircraft(String id) {
        boolean semn = true;
        for(Aircraft aircraft : aircrafts) {
            if(aircraft.getId().equals(id)) {
                semn = false;
                break;
            }    
        }
        if(semn) {
             Aircraft aircraft = new Aircraft(id);
            aircrafts.add(aircraft);
            new Thread(aircraft).start();
        }
        else
           System.out.println("Id already exists"); 
    }
    
    public void sendCommand(String aircraftId, AtcCommand cmd) {
        // take off
        // land
        Aircraft isAircraft = aircrafts.stream()
                .filter(aircraft -> aircraft.getId().equals(aircraftId))
                .findFirst()
                .orElse(null);
        if (isAircraft != null) {
            isAircraft.receiveAtcMessage(cmd);
        } else {
            System.out.println(" This aircraft does not exist! ");
        }
        
    }
    
    public void showAircrafts() {
        for(Aircraft aircraft : aircrafts) {
            System.out.println(aircraft.toString());
        }
    }
    
}
```

```java
public enum AircraftState {
    ON_STAND, TAXING, TAKING_OFF, ASCENDING, CRUISING, DESCENDING, LANDED
}

```

```java
public class Aircraft implements Runnable {

    private boolean isLanded = true;
    private Long startCruisingTime;
    public AircraftState aircraftState;
    
    private final String id;
    private int altitude;
    
    
    public Aircraft(String id) {
        this.id = id;
        this.altitude = 0;
        this.aircraftState = AircraftState.ON_STAND;
        System.out.println("Creating aircraft: " +  id );
    }

    public String getId() {
        return id;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    
    public void receiveAtcMessage(AtcCommand msg) {
        synchronized (this) {
            if (msg instanceof TakeoffCommand) {
                if (aircraftState.equals(AircraftState.ON_STAND)) {
                    System.out.println("Takeoff command");
                    this.isLanded = false;

                    this.altitude = ((TakeoffCommand) msg).getAltitude();
                    aircraftState = AircraftState.TAXING;
                    this.notify();

                } else {
                    System.out.println("Plane is not ON_STAND");
                }
            } else if (msg instanceof LandCommand) {
                if (aircraftState.equals(AircraftState.CRUISING)) {

                    aircraftState = AircraftState.DESCENDING;
                    this.notify();

                } else {
                    System.out.println("Plane is not on CRUISING state");
                }
            } else {
                System.out.println("Bad command");
            }
        }
    }
    
    @Override
    public void run() {
        while (!isLanded || (isLanded && aircraftState == AircraftState.ON_STAND) ) {
            switch (aircraftState) {
                case ON_STAND: {
                    System.out.println("ON_STAND -> " + this);
                    synchronized (this) {
                        try {
                            this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                }
                case TAXING: {
                    System.out.println("TAXING -> " + this);
                    try{
                        Thread.sleep(10_000L);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                    aircraftState = AircraftState.TAKING_OFF;
                    break;
                }
                case TAKING_OFF: {
                    System.out.println("TAKING_OFF -> " + this);
                    try{
                        Thread.sleep(5_000L);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                    aircraftState = AircraftState.ASCENDING;
                    break;
                }
                case ASCENDING: {
                    System.out.println("ASCENDING -> " + this);
                    System.out.println("Altitude: " + altitude * 1000);
                    for (int i = 0; i <= altitude; i++) {
                        try{
                        Thread.sleep(10_000L);
                        }catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            
                    aircraftState = AircraftState.CRUISING;
                    break;
                }
                case CRUISING: {
                    System.out.println("CRUISING -> " + this);
                    startCruisingTime = System.currentTimeMillis();
                    synchronized (this) {
                    try {
                        this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                }
                case DESCENDING: {
                    System.out.println("DESCENDING -> " + this);
                    System.out.println("Altitude before descending: " + altitude * 1000);
                    while (altitude > 0) {
                        try {
                        Thread.sleep(10_000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        altitude--;
                    }
                    System.out.println("Altitude after descending: " + altitude * 1000);
                    aircraftState = AircraftState.LANDED;
                    isLanded = true;

                    break;
                }
                case LANDED: {
                    System.out.println("LANDED -> " + this);
                    System.out.println("Aircraft " + this.getId() + " spent " + (System.currentTimeMillis() - startCruisingTime) + " milliseconds in cruising mode");
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + aircraftState);
            } 
        }
    }
    
    @Override
    public String toString() {
        return "Aircraft{" +
                "id='" + id + '\'' +
                ", altitude=" + altitude +
                ", state=" + aircraftState +
                ", isLanded=" + isLanded +
                '}';
    }
    
}
```

```java
public class TakeoffCommand extends AtcCommand {
    private final int altitude;
    
    public TakeoffCommand(int crusingAltitude) {
        altitude = crusingAltitude;
    }
    
    public int getAltitude() {
        return altitude;
    }
}
```