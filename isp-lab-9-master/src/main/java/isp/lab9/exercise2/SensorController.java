package isp.lab9.exercise2;

public class SensorController implements Observer{
    @Override
    public void update(Object event) {
        System.out.println("sensor type: "+ ((String)event).split(" ")[0]);
    }

}
