package ro.sci.carrental.repository;

import ro.sci.carrental.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tudor on 29.05.2017.
 */
public class CustomerRepository implements CustomerRepositoryInterface {
    private List<Customer> customers;

    public CustomerRepository() {
        this.customers = new ArrayList<Customer>();
    }



    public void add(Customer customer) {
        customers.add(customer);
    }

    public void remove(Customer customer) {
        customers.remove(customer);
    }

    public void update(Customer customer){
        customers.set(customers.indexOf(customer),customer);
    }

    public List<Customer> getAll() {
        return customers;
    }
}
