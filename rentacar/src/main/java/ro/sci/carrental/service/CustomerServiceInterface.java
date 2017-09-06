package ro.sci.carrental.service;

import ro.sci.carrental.repository.CustomerRepositoryInterface;

import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 */
public interface CustomerServiceInterface<T extends CustomerRepositoryInterface> {
    /**
     * Find the customers with driving licence
     *
     * @return retrieve Customer Repository List<Customer>
     */
    List<T> findCustomerByDrivingLicence();

    /**
     * Find the customer by name
     *
     * @param name Customer's name
     * @return retrieve Customer Repository List<Customer>
     */
    List<T> findCustomerByName(String name);
}
