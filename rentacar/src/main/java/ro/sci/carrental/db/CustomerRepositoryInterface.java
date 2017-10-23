package ro.sci.carrental.db;

import ro.sci.carrental.model.customer.Customer;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 */
public interface CustomerRepositoryInterface<T extends Customer> extends RepositoryI {
    /**
     * Find the customers with driving licence
     *
     * @return List<Customer>
     */
    List<T> findCustomerByDrivingLicence();

    /**
     * Find the customer by name
     *
     * @param name Customer's name
     * @return List<Customer>
     */
    List<T> findCustomerByName(String name);

    /**
     * Adds a customer in the system
     *
     * @param customer
     */
    void add(T t);

    /**
     * Removes a customer in the system
     *
     * @param customer
     */
    void remove(T t);

    /**
     * Updates a customer in the system
     *
     * @param customer
     */
    void update(T t);

    /**
     * Gets all the customers in the system
     *
     * @return
     */
    List<Customer> getAll();
}
