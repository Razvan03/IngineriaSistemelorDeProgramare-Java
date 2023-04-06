/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise4;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Razvan
 */
public class View{     
    private JFrame frame;
    private JTextField textSensor1;
    private JTextField textSensor2;
    private JTextField textSensor3;
    private JButton buttonSensor1;
    private JButton buttonSensor2;
    private JButton buttonSensor3;
            
    View() {
        frame = new JFrame("Sensors");
        
        
        frame.setSize(300, 150); //set frames size in pixels
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        buttonSensor1 = new JButton("TEMPERATURE");
        buttonSensor1.setBounds(10, 10, 150, 20);
        
        textSensor1 = new JTextField();
        textSensor1.setBounds(170, 10, 100, 20);
        
        buttonSensor2 = new JButton("HUMIDITY");
        buttonSensor2.setBounds(10, 40, 150, 20);
        
        textSensor2 = new JTextField();
        textSensor2.setBounds(170, 40, 100, 20);
        
        buttonSensor3 = new JButton("PRESSURE");
        buttonSensor3.setBounds(10, 70, 150, 20);
        
        textSensor3 = new JTextField();
        textSensor3.setBounds(170, 70, 100, 20);
        
        Container pane = frame.getContentPane(); // Not mandatory since Java 5.0
        //pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        pane.setLayout(null);
        
        pane.add(buttonSensor1);
        pane.add(buttonSensor2);
        pane.add(buttonSensor3);
        pane.add(textSensor1);
        pane.add(textSensor2);
        pane.add(textSensor3);

        frame.setVisible(true);
    }

    public JTextField getTextSensor1() {
        return textSensor1;
    }

    public void setTextSensor1(JTextField textSensor1) {
        this.textSensor1 = textSensor1;
    }

    public JTextField getTextSensor2() {
        return textSensor2;
    }

    public void setTextSensor2(JTextField textSensor2) {
        this.textSensor2 = textSensor2;
    }

    public JTextField getTextSensor3() {
        return textSensor3;
    }

    public void setTextSensor3(JTextField textSensor3) {
        this.textSensor3 = textSensor3;
    }

    public JButton getButtonSensor1() {
        return buttonSensor1;
    }

    public void setButtonSensor1(JButton buttonSensor1) {
        this.buttonSensor1 = buttonSensor1;
    }

    public JButton getButtonSensor2() {
        return buttonSensor2;
    }

    public void setButtonSensor2(JButton buttonSensor2) {
        this.buttonSensor2 = buttonSensor2;
    }

    public JButton getButtonSensor3() {
        return buttonSensor3;
    }

    public void setButtonSensor3(JButton buttonSensor3) {
        this.buttonSensor3 = buttonSensor3;
    }
    
    public double returnRandomValue() {
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return Double.parseDouble(df.format(rand.nextDouble()*100));
    }

}

