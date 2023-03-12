/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author Razvan
 */
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
