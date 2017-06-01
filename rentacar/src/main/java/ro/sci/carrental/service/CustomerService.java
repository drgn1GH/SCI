package ro.sci.carrental.service;

import ro.sci.carrental.model.Customer;
import ro.sci.carrental.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 */
public class CustomerService implements CustomerServiceInterface {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }
public List<Customer> findCustomerByDrivingLicence(boolean drivingLicence) {
        List<Customer> foundCustomer = new ArrayList<Customer>();

        for (Customer customer : customerRepository.getAll()) {
            if (customer.isDrivingLicence()) {
                foundCustomer.add(customer);
                System.out.println(customer.getName() + " " + customer.getEmail());
            }
        }
        return foundCustomer;
    }

    public List<Customer> findCustomerByName(String name) {
        List<Customer> foundCustomer = new ArrayList<Customer>();

        for (Customer customer : customerRepository.getAll()) {
            if (customer.getName().equalsIgnoreCase(name)) {
                foundCustomer.add(customer);
                System.out.println(customer.getName() +" " +customer.getEmail());
            }
        }
        return foundCustomer;
    }
}