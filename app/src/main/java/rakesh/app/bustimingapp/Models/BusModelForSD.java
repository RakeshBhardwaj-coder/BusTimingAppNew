package rakesh.app.bustimingapp.Models;

public class BusModelForSD {

    private String busDestination,busNumber,busSource;

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

    public BusModelForSD(String busDestination, String busNumber, String busSource) {
        this.busDestination = busDestination;
        this.busNumber = busNumber;
        this.busSource = busSource;
    }
}
