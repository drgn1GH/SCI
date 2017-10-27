package ro.sci.carrental.service;

import ro.sci.carrental.db.CustomerDaoI;
import ro.sci.carrental.model.customer.Customer;

import java.util.List;

public interface CustomerServiceDaoI<T> {
    void add(T t);
    void remove(T t);
    void update(T t);
    List<T> getAll();
    List<T> findCustomerByDrivingLicence();
    List<T> findCustomerByName(String name);
    void setCustomerRepository(CustomerDaoI<Customer> customerDaoI);
}
