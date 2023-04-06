/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Razvan
 */
public class JoinTest extends Thread {
    String n;
    Thread t;
    JoinTest(String n, Thread t){this.n= n;this.t=t;}
    @Override
    public void run() {
        System.out.println("Firul"+n+" a intrat in metoda run()");
        try{if (t!=null) t.join();
            System.out.println("Firul"+n+" executa operatia.");
            Thread.sleep(3000);
            System.out.println("Firul"+n+" a terminat operatia.");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        JoinTest w1 = new JoinTest("Proces1",null);
        JoinTest w2 = new JoinTest("Proces2",w1);
        w1.start();w2.start();}
}