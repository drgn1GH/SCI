package ro.sci.carrental.service;

import ro.sci.carrental.model.customer.Customer;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 */
public interface CustomerServiceInterface {
    /**
     * Find the customers with driving licence
     *
     * @return retrieve Customer Repository List<Customer>
     */
    List<Customer> findCustomerByDrivingLicence();

    /**
     * Find the customer by name
     *
     * @param name Customer's name
     * @return retrieve Customer Repository List<Customer>
     */
    List<Customer> findCustomerByName(String name);
}
