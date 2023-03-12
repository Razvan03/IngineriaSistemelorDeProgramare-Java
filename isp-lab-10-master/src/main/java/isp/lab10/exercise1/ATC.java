package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class ATC {

    ArrayList<Aircraft> aircrafts= new ArrayList<>();

    public ATC(){

    }

    public void addAircraft(String id){
    Aircraft a1= new Aircraft(id);
    aircrafts.add(a1);


    }
    public void showAircrafts(){
        for (int i=0;i<aircrafts.size();i++) {
            System.out.println(aircrafts.get(i).getIid());
        }
    }

    public void sendCommand(String aircraftID,AtcCommand cmd){
        Scanner scanner= new Scanner(System.in);

    }


}
