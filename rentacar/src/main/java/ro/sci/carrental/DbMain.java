package ro.sci.carrental;

import ro.sci.carrental.db.CarDao;
import ro.sci.carrental.db.CarDaoI;
import ro.sci.carrental.db.CustomerDao;
import ro.sci.carrental.db.CustomerDaoI;
import ro.sci.carrental.model.car.Car;
import ro.sci.carrental.model.customer.Customer;
import ro.sci.carrental.service.CarServiceDao;
import ro.sci.carrental.service.CarServiceDaoI;
import ro.sci.carrental.service.CustomerServiceDao;
import ro.sci.carrental.service.CustomerServiceDaoI;

public class DbMain {

    public static void main(String[] args) {
        CarServiceDaoI<Car> carServiceDaoI = new CarServiceDao();
        CarDaoI<Car> carDaoI = new CarDao();
        carServiceDaoI.setCarRepository(carDaoI);
        CustomerServiceDaoI<Customer> customerServiceDaoI = new CustomerServiceDao();
        CustomerDaoI<Customer> customerDaoI = new CustomerDao();
        customerServiceDaoI.setCustomerRepository(customerDaoI);


        carServiceDaoI.getAll();
        carServiceDaoI.findCarByMake("audi");
        carServiceDaoI.findCarByMakeAndModel("audi","tt");
        carServiceDaoI.findCarByMakeAndModelAndColor("audi","tt","RED");

        Car newCar = new Car();
        newCar.setMake("Dacia");
        newCar.setModel("Logan");
        newCar.setColor("red");
//        carServiceDaoI.add(newCar);
        newCar.setId(26);
        newCar.setModel("updatedModel");
//        carServiceDaoI.update(newCar);
//        carServiceDaoI.findCarByMakeAndModel("dacia","updatedmodel");
//        carServiceDaoI.remove(newCar);

        customerServiceDaoI.getAll();
        customerServiceDaoI.findCustomerByDrivingLicence();
        customerDaoI.findCustomerByName("Popey");

        Customer newCustomer = new Customer();
        newCustomer.setName("George");
        newCustomer.setDrivingLicence(true);
        //customerServiceDaoI.add(newCustomer);
        newCustomer.setId(5);
        newCustomer.setName("updatedName");
      //  customerServiceDaoI.update(newCustomer);
        customerServiceDaoI.findCustomerByName("ALIN");

       // customerServiceDaoI.remove(newCustomer);




    }
}
