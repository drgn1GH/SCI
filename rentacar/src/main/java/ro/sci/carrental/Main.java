package ro.sci.carrental;

import ro.sci.carrental.model.Car;
import ro.sci.carrental.model.Customer;
import ro.sci.carrental.model.CustomerAddress;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CarRepositoryInterface;
import ro.sci.carrental.repository.CustomerRepository;
import ro.sci.carrental.repository.CustomerRepositoryInterface;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CustomerService;
import ro.sci.carrental.service.CustomerServiceInterface;

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


//        Customer customer = new Customer(true,"mihai","0755555555","mihai@gmail.");

        CustomerAddress ca1 = new CustomerAddress("cluj","Str.Lala",33,"0343242");
        CustomerAddress ca2 = new CustomerAddress("brasov","Str.Hehe",22,"99942");
        Customer customer1 = new Customer(true,"George","0758766599","george@gmail.com",ca1);
        Customer customer2 = new Customer(true,"John","0754766599","john@gmail.com",ca2);
        Customer customer3 = new Customer(false,"John","0754766599","hamham@yahoo.com",ca2);

        System.out.println(ca1.getStreet());
        System.out.println(customer1.getEmail());

        CustomerRepository cri = new CustomerRepository();
        cri.add(customer1);
        cri.add(customer2);
        cri.add(customer3);
        System.out.println(cri.getAll());

        CustomerService lala = new CustomerService(cri);
        lala.findCustomerByDrivingLicence(true);

        lala.findCustomerByName("george");
        lala.findCustomerByName("john");
    }
}