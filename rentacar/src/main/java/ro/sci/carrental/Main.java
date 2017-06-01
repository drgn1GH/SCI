package ro.sci.carrental;

import ro.sci.carrental.model.Car;
import ro.sci.carrental.model.Customer;
import ro.sci.carrental.model.CustomerAddress;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CustomerRepository;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CustomerService;

/**
 * Created by tudor on 18.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "TT");
        Car car2 = new Car("Audi", "x6");
        Car car3 = new Car("BMW","x3");
        car1.setColor("red");
        car2.setColor("blue");
        car3.setColor("gold");

        CarRepository cr = new CarRepository();
        cr.addCar(car1);
        cr.addCar(car2);
        cr.addCar(car3);

        CarService carService = new CarService(cr);
        carService.findCarByMake("bmw");
        System.out.printf("%n");
        carService.findCarByMake("audi");
        System.out.printf("%n");
        carService.findCarByMakeAndModel("bmw","x3");
        System.out.printf("%n");
        carService.findCarByMakeAndModelAndColor("audi","tt","red");
        System.out.printf("%n");

        CustomerAddress customerAddress1 = new CustomerAddress("Cluj","Str.Lala",33,"0343242");
        CustomerAddress customerAddress2 = new CustomerAddress("Brasov","Str.Hehe",22,"99942");
        CustomerAddress customerAddress3 = new CustomerAddress("Arad","Str.Ciresului",11,"66625");

        Customer customer1 = new Customer(true,"George","0758766599","george@gmail.com",customerAddress1);
        Customer customer2 = new Customer(true,"John","0754766599","john@gmail.com",customerAddress2);
        Customer customer3 = new Customer(false,"John","0754766599","hamham@yahoo.com",customerAddress3);

        CustomerRepository customerRepository1 = new CustomerRepository();
        customerRepository1.add(customer1);
        customerRepository1.add(customer2);
        customerRepository1.add(customer3);

        CustomerService customerService1 = new CustomerService(customerRepository1);
        customerService1.findCustomerByDrivingLicence(true);
        System.out.printf("%n");
        customerService1.findCustomerByName("george");
        System.out.printf("%n");
        customerService1.findCustomerByName("john");
    }
}