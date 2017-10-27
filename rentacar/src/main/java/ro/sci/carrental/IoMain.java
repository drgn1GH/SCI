package ro.sci.carrental;

import ro.sci.carrental.model.car.Car;
import ro.sci.carrental.model.customer.Customer;
import ro.sci.carrental.model.customer.CustomerAddress;
import ro.sci.carrental.reader.*;
import ro.sci.carrental.repository.CarRepository;
import ro.sci.carrental.repository.CustomerRepository;
import ro.sci.carrental.service.CarService;
import ro.sci.carrental.service.CustomerService;
import ro.sci.carrental.writer.CarWriter;
import ro.sci.carrental.writer.CustomerWriter;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IoMain {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws InvalidEntityException {
        EntityReader ent = new EntityReader();
        File carsFile = new File("cars.txt");
        List<String> carLines = ent.readLines(carsFile);
        CarConverter carConverter = new CarConverter();
        int i = 0;
        for (String line : carLines) {
            i++;
            Car car;
            try {
                car = carConverter.convert(line);
                logger.log(Level.INFO,"" +car);
            } catch (InvalidEntityException e) {

                System.out.println("invalid car for: [" + line + "] at line: " + i);
            }
        }

        File customerFile = new File("customers.txt");
        List<String> customerLines = ent.readLines(customerFile);
        CustomerConverter customerConvertor = new CustomerConverter();
        int j = 0;
        for (String line : customerLines) {
            j++;
            Customer customer;
            try {
                customer = customerConvertor.convert(line);
                logger.log(Level.INFO,"" +customer);
            } catch (InvalidEntityException e) {
                System.out.println("invalid customer for: [" + line + "] at line: " + j);
            }
        }

        File addressFile = new File("addresses.txt");
        List<String> addressLines = ent.readLines(addressFile);
        AddressConverter addressConverter = new AddressConverter();
        int k = 0;
        for (String line : addressLines){
            k++;
            CustomerAddress customerAddress;
            try{
                customerAddress = addressConverter.convert(line);
                logger.log(Level.INFO,"" +customerAddress);
            } catch(InvalidEntityException e){
                System.out.println("invalid customer for: [" + line + "] at line: " + k);
            }
        }



        CarRepository carRepository = new CarRepository();
        CarService carService = new CarService(carRepository);

        CustomerRepository customerRepository = new CustomerRepository();
        CustomerService customerService1 = new CustomerService(customerRepository);

        for (String line : carLines){
            carRepository.add(carConverter.convert(line));
        }

        for (String line : customerLines) {
            customerRepository.add(customerConvertor.convert(line));
        }



        System.out.println("\n\n");

        carRepository.getAll().forEach(car -> logger.log(Level.INFO,"all cars :" +car +"\n"));

        System.out.println("\n\n");
        customerRepository.getAll().forEach(customer -> logger.log(Level.INFO,"all customers :" +customer +"\n"));

        File carz = new File("carz.txt");
        CarWriter cw = new CarWriter();
        cw.writeObjects(carRepository.getAll(),carz);
        File customerz = new File("customerz.txt");
        CustomerWriter customerWriter = new CustomerWriter();
        customerWriter.writeObjects(customerRepository.getAll(),customerz);


    }
}
