package isp.lab10.exercise1;


import java.util.Scanner;

public class Aircraft extends Thread {

    private String id;
    private int altitude;

    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLANE:" + this.id + " ON STAND");

        while (!Thread.currentThread().isInterrupted()) {

            if (scanner.next().equals("TAKEOFF")) {

                if (scanner.next().equals(id)) {

                    altitude = Integer.parseInt(scanner.next());

                    System.out.println("alt=" + altitude);
                    System.out.println("PLANE:" + this.id + " TAXING");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("PLANE:" + this.id + " TAKING OFF");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("PLANE:" + this.id + " ASCENDING");
                    try {
                        Thread.sleep(10 * altitude);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("PLANE:" + this.id + " CRUISING");
                    long start = System.currentTimeMillis();
                    //String[] aux = scanner.nextLine().split(" ");
                    //while (Objects.equals(scanner.next(),"LAND")){

                    //scanner.nextLine();
                    while (!Thread.currentThread().isInterrupted()) {

                        if (scanner.nextLine().equals("LAND " + id)) {
                            long end = System.currentTimeMillis();
                            float cruiseTime = (end - start) / 1000F;
                            System.out.println("CRUISED FOR " + cruiseTime + " seconds");
                            System.out.println("DESCENDING");
                            try {
                                Thread.sleep(10 * altitude);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("LANDED");
                            Thread.currentThread().interrupt();
                            //scanner.close();

                        }


                    }


                }
            }

        }


    }

    public Aircraft() {


    }

    public Aircraft(String id) {
        this.id = id;
    }


    public String getIid() {
        return id;
    }


}
