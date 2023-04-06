package isp.lab7.safehome;

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
