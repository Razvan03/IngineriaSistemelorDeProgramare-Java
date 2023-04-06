/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab10.exercise1;

/**
 *
 * @author Razvan
 */
public class TakeoffCommand extends AtcCommand {
    private final int altitude;
    
    public TakeoffCommand(int crusingAltitude) {
        altitude = crusingAltitude;
    }
    
    public int getAltitude() {
        return altitude;
    }
}
