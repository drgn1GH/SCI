package ro.sci.carrental;

import ro.sci.carrental.model.Car;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CarRepositoryInterface;
import ro.sci.carrental.service.CarService;

/**
 * Created by tudor on 18.05.2017.
 */
public class Main {
    public static void main(String[] args) {
    Car car1 = new Car("Audi", "TT");
//        car1.setGps(true);
//        System.out.println(car1.isGps());
//        Car car2 = new Car(FuelType.DIESEL, VehicleCategory.SPORT,"BMW","x6","red", 5.2f,4,4,true,true,true);
//        System.out.println(car2.getNumberOfDoors());
//   //     System.out.println(car2.getColor() + " " + car2.isGps());
//        RentalCalendar rc1 = new RentalCalendar(true, 20000, 23);
//        System.out.println(rc1.getPickupTime());
//        rc1.setReturnTime(24.0);
//        System.out.println(rc1.getReturnTime());
        car1.setColor("red");
        CarRepositoryInterface cr = new CarRepository();
        cr.addCar(car1);

        Car car2 = new Car("Audi", "x6");
        car2.setColor("blue");

        Car car3 = new Car("bmw","x3");
        cr.addCar(car2);
        cr.addCar(car3);
        CarService ss = new CarService(cr);
        ss.findCarByMake("bmw");
        ss.findCarByMake("audi");
        ss.findCarByMakeAndModel("bmw","3x");
        ss.findCarByMakeAndModel("bmw","x3");
        ss.findCarByMakeAndModelAndColor("audi","tt","brown");
        ss.findCarByMakeAndModelAndColor("audi","tt","red");


    }
}