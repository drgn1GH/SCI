package ro.sci.carrental;

import ro.sci.carrental.model.Car;
import ro.sci.carrental.model.RentalCalendar;

/**
 * Created by tudor on 18.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "TT", "red");
        car1.setGps(true);
        System.out.println(car1.isGps());
        Car car2 = new Car("BMW", "x6", "DIESEL", "red", "sport", 4, 4, "auto", true, true);
        System.out.println("car is : " + car2.getMake() + " " + car2.getModel() + " " + car2.getColor() + " " + car2.getCategory() + " " +car2.getNumberOfSeats() + " " + car2.getNumberOfDoors() + " " + car2.getGearboxType() + " " + car2.isAC() + " " + car2.isGps());
        Car car3 = new Car();

        RentalCalendar rc1 = new RentalCalendar(true, 20000, 23);
        System.out.println(rc1.getPickupTime());
        rc1.setReturnTime(24.0);
        System.out.println(rc1.getReturnTime());
    }
}