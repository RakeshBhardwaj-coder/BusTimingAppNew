package rakesh.app.bustimingapp.Models;

public class BusModelForSD {

    private String busDestination,busNumber,busSource;

    public int getBusStopId() {
        return busStopId;
    }

    public void setBusStopId(int busStopId) {
        this.busStopId = busStopId;
    }

    private int busStopId;

    public BusModelForSD(){

    }

    public String getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(String busDestination) {
        this.busDestination = busDestination;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusSource() {
        return busSource;
    }

    public void setBusSource(String busSource) {
        this.busSource = busSource;
    }



    public BusModelForSD(String busDestination, String busNumber, String busSource,int busStopId) {
        this.busDestination = busDestination;
        this.busNumber = busNumber;
        this.busSource = busSource;
        this.busStopId = busStopId;
    }
}
