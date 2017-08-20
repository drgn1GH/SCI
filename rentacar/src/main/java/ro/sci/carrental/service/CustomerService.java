package ro.sci.carrental.service;

import ro.sci.carrental.model.customer.Customer;
import ro.sci.carrental.repository.CustomerRepository;

import java.util.List;

/**
 * Create a customer service object blueprint
 * Created by tudor on 29.05.2017.
 */
public class CustomerService implements CustomerServiceInterface {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    public List<Customer> findCustomerByDrivingLicence() {
        return customerRepository.findCustomerByDrivingLicence();
    }

    public List<Customer> findCustomerByName(String name) {
        if (null == name || name.isEmpty()) {
            System.out.println("find result is null");
            return null;
        }
        return customerRepository.findCustomerByName(name);
    }

}