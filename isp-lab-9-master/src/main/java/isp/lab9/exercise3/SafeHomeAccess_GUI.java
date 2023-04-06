/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise3;


/**
 *
 * @author Razvan
 */


//import isp.lab7.safehome.DoorLockController;     // nu reusesc sa import package/ clasa din alt proiect..
                                                        // asa ca o sa fac ex. in proiectul IspLab7
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import isp.lab7.safehome.DoorLockController;
import java.util.logging.Level;
import java.util.logging.Logger;

class SafeHomeAccess_GUI implements ActionListener{
    
    static DoorLockController doorContrl;
            
    JFrame frame;
    JLabel label1;
    JLabel label2;
    JTextField text1;
    JTextField text2;
    JButton button;
            
    SafeHomeAccess_GUI() {
        doorContrl  = new DoorLockController();
        frame = new JFrame();
        
        frame.setSize(300, 150); //set frames size in pixels
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label1 = new JLabel("Type access code: ");
        label1.setBounds(10, 10, 150, 20);
        
        text1 = new JTextField();
        text1.setBounds(150, 10, 100, 20);
        
        button = new JButton("Enter code");
        button.setBounds(10, 40, 100, 20);
        
        label2 = new JLabel("Door status: ");
        label2.setBounds(10, 70, 100, 20);
        
        text2 = new JTextField();
        text2.setBounds(100, 70, 100, 20);
        
        Container pane = frame.getContentPane(); // Not mandatory since Java 5.0
        //pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        pane.setLayout(null);
        
        pane.add(label1);
        pane.add(label2);
        pane.add(text1);
        pane.add(text2);
        pane.add(button); // ... you can simply do: 'add(but1)'
        
        
        button.addActionListener(this);
        
        frame.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("I've been clicked!");

        if(e.getSource() == button) {
            String status = "CLOSE";
            String pin = text1.getText();
            
            
            try {
                 status = String.valueOf(doorContrl.enterPin(pin));
            } catch (Exception ex) {
                Logger.getLogger(SafeHomeAccess_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally {
                text2.setText(status);
            }
        }
            
    }
        
   
    public static void main(String[] args) {
        SafeHomeAccess_GUI gui = new SafeHomeAccess_GUI();
        
        try {
            doorContrl .addTenant("123", "name1");
        } catch (Exception ex) {
            Logger.getLogger(SafeHomeAccess_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        System.out.println("main thread coninues");
    }
}
