package rakesh.app.bustimingapp.Models;

public class BusStopsModel {
    String stopsIndex;
    String busName,busType,busStopName,busNextStopName,busReachTime,busExitTime,busWaitingTime,busFinalDestination;

    public BusStopsModel(){

    }

    public String getStopsIndex() {
        return stopsIndex;
    }

    public void setStopsIndex(String stopsIndex) {
        this.stopsIndex = stopsIndex;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusStopName() {
        return busStopName;
    }

    public void setBusStopName(String busStopName) {
        this.busStopName = busStopName;
    }

    public String getBusNextStopName() {
        return busNextStopName;
    }

    public void setBusNextStopName(String busNextStopName) {
        this.busNextStopName = busNextStopName;
    }

    public String getBusReachTime() {
        return busReachTime;
    }

    public void setBusReachTime(String busReachTime) {
        this.busReachTime = busReachTime;
    }

    public String getBusExitTime() {
        return busExitTime;
    }

    public void setBusExitTime(String busExitTime) {
        this.busExitTime = busExitTime;
    }

    public String getBusWaitingTime() {
        return busWaitingTime;
    }

    public void setBusWaitingTime(String busWaitingTime) {
        this.busWaitingTime = busWaitingTime;
    }

    public String getBusFinalDestination() {
        return busFinalDestination;
    }

    public void setBusFinalDestination(String busFinalDestination) {
        this.busFinalDestination = busFinalDestination;
    }

    public BusStopsModel(String stopsIndex, String busName, String busType, String busStopName, String busNextStopName, String busReachTime, String busExitTime, String busWaitingTime, String busFinalDestination) {
        this.stopsIndex = stopsIndex;
        this.busName = busName;
        this.busType = busType;
        this.busStopName = busStopName;
        this.busNextStopName = busNextStopName;
        this.busReachTime = busReachTime;
        this.busExitTime = busExitTime;
        this.busWaitingTime = busWaitingTime;
        this.busFinalDestination = busFinalDestination;
    }
}
