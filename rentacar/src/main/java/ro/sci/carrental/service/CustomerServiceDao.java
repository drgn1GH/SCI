package ro.sci.carrental.service;

import ro.sci.carrental.db.CustomerDaoI;
import ro.sci.carrental.model.customer.Customer;

import java.util.List;

public class CustomerServiceDao implements CustomerServiceDaoI<Customer> {
    private CustomerDaoI<Customer> customerRepository;

    @Override
    public void add(Customer customer) {
        this.customerRepository.add(customer);
    }

    @Override
    public void remove(Customer customer) {
        this.customerRepository.remove(customer);
    }

    @Override
    public void update(Customer customer) {
        this.customerRepository.update(customer);
    }

    @Override
    public List getAll() {
       return this.customerRepository.getAll();
    }

    @Override
    public List findCustomerByDrivingLicence() {
        return this.customerRepository.findCustomerByDrivingLicence();
    }

    @Override
    public List findCustomerByName(String name) {
        return this.customerRepository.findCustomerByName(name);
    }

    @Override
    public void setCustomerRepository(CustomerDaoI<Customer> customerDaoI) {
        this.customerRepository = customerDaoI;
    }
}
