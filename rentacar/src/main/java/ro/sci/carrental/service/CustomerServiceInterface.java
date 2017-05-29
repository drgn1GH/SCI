package ro.sci.carrental.service;

import ro.sci.carrental.model.Customer;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 */
public interface CustomerServiceInterface {
    /**
     * Find the customers with driving licence
     * @param drivingLicence Customer driving licence
     * @return List<Customer>
     */
    List<Customer> findCustomerByDrivingLicence(boolean drivingLicence);

    /**
     * Find the customer by name
     * @param name Customer's name
     * @return List<Customer>
     */
    List<Customer> findCustomerByName(String name);
}
