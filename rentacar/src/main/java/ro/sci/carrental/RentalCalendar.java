package ro.sci.carrental.model;

/**
 * Created by tudor on 24.05.2017.
 */
public class RentalCalendar{
    private boolean drivingLicence;
    private double pickupTime;
    private double returnTime;
    private double price;

    //added some spaces




    public RentalCalendar(boolean drivingLicence, double price, double pickupTime) {
        this.drivingLicence = drivingLicence;
        this.price = price;
        this.pickupTime = pickupTime;
    }

    public double getReturnTime() {
        return returnTime;
    }

    public RentalCalendar() {
    }

    public void setReturnTime(double returnTime) {
        this.returnTime = returnTime;
    }

    public boolean isDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(boolean drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(double pickupTime) {
        this.pickupTime = pickupTime;
    }

}