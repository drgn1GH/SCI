package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by alex on 5/11/17.
 */
public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car(10, FuelType.DIESEL, 60, 6, 4.5);
        System.out.println("Simulating a car drive:");
        simulateDriving(car);

//
//        Vehicle horse = new Horse();
//        System.out.println("\n###############  Simulating a horse ride:");
//        //simulateDriving(horse);

    }

    private static void simulateDriving(Vehicle vehicle) {
        vehicle.start();
        vehicle.shiftGear(1);
        vehicle.drive(10);
        vehicle.shiftGear(2);
        vehicle.drive(10);
        vehicle.shiftGear(3);
        vehicle.drive(10);
        vehicle.shiftGear(4);
        vehicle.drive(10);
        vehicle.shiftGear(5);
        vehicle.drive(5);
        vehicle.drive(6);
        vehicle.shiftGear(3);
        vehicle.drive(3);
        vehicle.shiftGear(7);
        vehicle.stop();

    }
}
