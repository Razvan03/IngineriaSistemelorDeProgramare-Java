package isp.lab9.exercise1;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        Alarm fireAlarm = new Alarm();
        AlarmController alarmController= new AlarmController();
        AlarmMonitor monitor = new AlarmMonitor();
        fireAlarm.register(monitor);
        fireAlarm.register(alarmController);

        fireAlarm.startAlarm();
        Thread.sleep(500);
        fireAlarm.stopAlarm();

    }
}
