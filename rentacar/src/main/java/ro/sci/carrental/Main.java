package ro.sci.carrental;

import ro.sci.carrental.model.calendar.RentalCalendar;
import ro.sci.carrental.model.calendar.RentingPrice;
import ro.sci.carrental.model.calendar.Transaction;
import ro.sci.carrental.model.car.Car;
import ro.sci.carrental.model.car.FuelType;
import ro.sci.carrental.model.car.Price;
import ro.sci.carrental.model.customer.Customer;
import ro.sci.carrental.model.customer.CustomerAddress;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CustomerRepository;
import ro.sci.carrental.repository.TransactionRepository;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CustomerService;
import ro.sci.carrental.service.TransactionInterceptorService;

/**
 * Created by tudor on 18.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "TT");
        Car car2 = new Car("Audi", "x6");
        Car car3 = new Car("BMW", "x3");
        Car car4 = new Car("Dacia", "Logan");
        car1.setPrice(new Price(9,"\u00a3"));
        car2.setPrice(new Price(30,"\u20ac"));
        car3.setPrice(new Price(24,"$"));
        car4.setPrice(new Price(33,"RON"));
        car1.setColor("red");
        car2.setColor("blue");
        car3.setColor("gold");
        car1.setFuelType(FuelType.PETROL);
        System.out.println(car1.getPrice());
        RentingPrice rp1 = new RentingPrice(car1,3);
        RentingPrice rp2 = new RentingPrice(car2,3);
        RentingPrice rp3 = new RentingPrice(car1,3);



        CarRepository cr = new CarRepository();
        cr.addCar(car1);
        cr.addCar(car2);
        cr.addCar(car3);
        cr.addCar(car4);

        CarService carService = new CarService(cr);
        carService.findCarByMake("bmw");
        System.out.println("\n");
        carService.findCarByMake("audi");
        System.out.println("\n");
        carService.findCarByMakeAndModel("bmw", "x3");
        System.out.println("\n");
        carService.findCarByMakeAndModelAndColor("audi", "tt", "red");
        System.out.println("\n");
        carService.findCarByMake("dacia");
        System.out.println("\n");
        cr.getAll().forEach(car -> System.out.println(car));
        System.out.println("\n");


        CustomerAddress customerAddress1 = new CustomerAddress("Cluj", "Str.Lala", 33, "0343242");
        CustomerAddress customerAddress2 = new CustomerAddress("Brasov", "Str.Hehe", 22, "99942");
        CustomerAddress customerAddress3 = new CustomerAddress("Arad", "Str.Ciresului", 11, "66625");

        Customer customer1 = new Customer(true, "George");
        Customer customer2 = new Customer(true, "John");
        Customer customer3 = new Customer(false, "John");
        customer1.setEmail("george1@gmail.com");
        customer2.setEmail("john2@gmail.com");
        customer3.setEmail("john3@yahoo.com");
        customer1.setCustomerAddress(customerAddress1);
        customer2.setCustomerAddress(customerAddress2);
        customer3.setCustomerAddress(customerAddress3);

        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.add(customer1);
        customerRepository.add(customer2);
        customerRepository.add(customer3);
        customerRepository.findCustomerByDrivingLicence();
        System.out.println("\n");
        customerRepository.findCustomerByName("john");
        System.out.println("\n");


        CustomerService customerService1 = new CustomerService(customerRepository);
        customerService1.findCustomerByDrivingLicence();
        System.out.println("\n");
        customerService1.findCustomerByName("george");
        System.out.println("\n");
        customerService1.findCustomerByName("john");
        System.out.println("\n");
        customerService1.findCustomerByDrivingLicence();
        System.out.println("\n");

        RentalCalendar rentalCalendar = new RentalCalendar();
        rentalCalendar.pickupTime(car1, customer1, "24.03.2017 15:00:59");
        rentalCalendar.returnTime(car1, customer1, "27.03.2017 15:00:59");

        Transaction transaction1 = new Transaction();
        Transaction transaction2 = new Transaction();
        Transaction transaction3 = new Transaction();
        Transaction transaction4 = new Transaction();
        transaction1.setId(1);
        transaction1.setName("a");
        transaction2.setId(2);
        transaction2.setName("a");
        transaction3.setId(1);
        transaction3.setName("ab");
        transaction4.setId(1001);
        transaction4.setName("cabcde");
        System.out.println(transaction1.hashCode());
        System.out.println(transaction2.hashCode());
        System.out.println(transaction3.hashCode());
        System.out.println(transaction4.hashCode());

        TransactionRepository transactionRepository = new TransactionRepository();
        transactionRepository.addTransaction(transaction1);
        transactionRepository.addTransaction(transaction2);
        transactionRepository.addTransaction(transaction3);
        transactionRepository.addTransaction(transaction4);


        transactionRepository.findTransactionById(1);
        System.out.println("\n");
        transactionRepository.findTransactionByName("abc");
        System.out.println("\n");
        transactionRepository.getTransactions().forEach(transaction -> System.out.println(transaction));
        System.out.println("\n");
        transactionRepository.findTransactionById(0);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");


        TransactionInterceptorService transactionInterceptorService = new TransactionInterceptorService(transactionRepository);
        transactionInterceptorService.findTransactionById(1);
        transactionInterceptorService.findTransactionById(2);
        transactionInterceptorService.findTransactionByName("");
        transactionInterceptorService.findTransactionByName("a");
    }
}