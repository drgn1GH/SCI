package ro.sci.carrental.repository;

import ro.sci.carrental.model.customer.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a customer repository object blueprint
 * Created by tudor on 29.05.2017.
 */
public class CustomerRepository implements CustomerRepositoryInterface {
    private List<Customer> customers;

    public CustomerRepository() {
        this.customers = new ArrayList<>();
    }

    public List<Customer> findCustomerByDrivingLicence() {
        List<Customer> foundCustomer = new ArrayList<>();

        for (Customer customer : customers) {
            if (customer.hasDrivingLicence()) {
                foundCustomer.add(customer);
                System.out.println(customer);
            }
        }
        return foundCustomer;
    }

    public List<Customer> findCustomerByName(String name) {
        List<Customer> foundCustomer = new ArrayList<>();

        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                foundCustomer.add(customer);
                System.out.println(customer);
            }
        }
        return foundCustomer;
    }


    public void add(Customer customer) {
        customers.add(customer);
    }

    public void remove(Customer customer) {
        customers.remove(customer);
    }

    public void update(Customer customer) {
        customers.set(customers.indexOf(customer), customer);
    }

    public List<Customer> getAll() {
        return customers;
    }
}
