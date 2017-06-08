package ro.sci.carrental;

import ro.sci.carrental.model.Car;
import ro.sci.carrental.model.Customer;

/**
 * Created by tudor on 24.05.2017.
 */
public class RentalCalendar {

    public void pickupTime(Car car, Customer customer, String date) {
        System.out.printf("Car : %s %s will be picked up by customer : %s, on %s.%n", car.getMake(), car.getModel(),customer.getName(), date);
    }

    public void returnTime(Car car, Customer customer, String date) {
        System.out.printf("Car : %s %s will be returned by customer : %s, until %s.%n", car.getMake(), car.getModel(),  customer.getName(), date);

    }

}