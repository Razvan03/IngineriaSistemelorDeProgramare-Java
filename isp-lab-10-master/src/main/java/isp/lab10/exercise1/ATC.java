/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab10.exercise1;

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
