package ro.sci.carrental.repository;

import ro.sci.carrental.model.customer.Customer;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 */
public interface CustomerRepositoryInterface {
    /**
     * Find the customers with driving licence
     *
     * @return List<Customer>
     */
    List<Customer> findCustomerByDrivingLicence();

    /**
     * Find the customer by name
     *
     * @param name Customer's name
     * @return List<Customer>
     */
    List<Customer> findCustomerByName(String name);

    /**
     * Adds a customer in the system
     *
     * @param customer
     */
    void add(Customer customer);

    /**
     * Removes a customer in the system
     *
     * @param customer
     */
    void remove(Customer customer);

    /**
     * Updates a customer in the system
     *
     * @param customer
     */
    void update(Customer customer);

    /**
     * Gets all the customers in the system
     *
     * @return
     */
    List<Customer> getAll();
}
