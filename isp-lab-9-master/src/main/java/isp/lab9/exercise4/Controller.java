/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise4;

/**
 *
 * @author Razvan
 */
public class Controller { 
    
    private Model model;
    private View view;
    
    public Controller(Model m, View v) {
        model = m;
        view = v;
        initView();
    }
    
    public void initView() {
        
        view.getTextSensor1().setText(String.valueOf(model.getTEMPERATURE()));
        view.getTextSensor2().setText(String.valueOf(model.getHUMIDITY()));
        view.getTextSensor3().setText(String.valueOf(model.getPRESSURE()));
        
        
    }
    public void initController() {
        
        view.getButtonSensor1().addActionListener(e -> sensor1());
        view.getButtonSensor2().addActionListener(e -> sensor2());
        view.getButtonSensor3().addActionListener(e -> sensor3());
    }
    
    private void sensor1() {
        model.setTEMPERATURE(view.returnRandomValue());
        //view.getTextSensor1().setText(String.valueOf(model.getTEMPERATURE()));
        initView();
    }
    
    private void sensor2() {
        model.setHUMIDITY(view.returnRandomValue());
        //view.getTextSensor2().setText(String.valueOf(model.getHUMIDITY()));
        initView();
    }
    
    private void sensor3() {
        model.setPRESSURE(view.returnRandomValue());
        //view.getTextSensor3().setText(String.valueOf(model.getPRESSURE()));
        initView();
    }
}
