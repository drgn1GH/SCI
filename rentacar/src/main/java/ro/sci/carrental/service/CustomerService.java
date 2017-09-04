package ro.sci.carrental.service;

import ro.sci.carrental.model.customer.Customer;
import ro.sci.carrental.repository.CustomerRepository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Create a customer service object blueprint
 * Created by tudor on 29.05.2017.
 */
public class CustomerService implements CustomerServiceInterface {
    private static final Logger logger = Logger.getLogger(CustomerService.class.getName());

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    public List<Customer> findCustomerByDrivingLicence() {
        return customerRepository.findCustomerByDrivingLicence();
    }

    public List<Customer> findCustomerByName(String name) {
        if (null == name || name.isEmpty()) {
            logger.log(Level.INFO,"find result is null");
            return null;
        }
        return customerRepository.findCustomerByName(name);
    }

}