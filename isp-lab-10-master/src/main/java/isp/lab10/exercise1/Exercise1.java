package isp.lab10.exercise1;

import java.io.Console;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) throws InterruptedException {
        ATC atc= new ATC();
        atc.addAircraft("4");
        atc.addAircraft("5");
        atc.addAircraft("6");


        for (Aircraft aircraft : atc.aircrafts) {
           aircraft.start();

        }







    }
}

