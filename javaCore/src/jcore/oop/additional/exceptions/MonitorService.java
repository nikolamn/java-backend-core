package jcore.oop.additional.exceptions;

public class MonitorService {

    public MonitorService() {};

    public void validateMonitor(int inches) throws MonitorException {
        if (inches <= 0 ) throw new MonitorException("Invalid monitor size!");
    }
}