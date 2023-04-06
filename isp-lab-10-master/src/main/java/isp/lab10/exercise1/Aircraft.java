/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab10.exercise1;


/**
 *
 * @author Razvan
 */
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
