package ro.sci.carrental.db;

import ro.sci.carrental.model.customer.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository extends DataBaseConnection implements CustomerRepositoryInterface<Customer> {
    private static final String SELECT_ALL_FROM_CUSTOMERS = "SELECT * FROM customers";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String DRIVING_LICENCE = "driving_licence";


    @Override
    public List<Customer> findCustomerByDrivingLicence() {
        return null;
    }

    @Override
    public List<Customer> findCustomerByName(String name) {
        return null;
    }

    @Override
    public void add(Customer customer) {

    }

    @Override
    public void remove(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public void update(Object o) {

    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();

        try (Connection connection = newConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL_FROM_CUSTOMERS)){
            while (resultSet.next()){
                Customer customer = new Customer();
                customer.setId(resultSet.getInt(ID));
                customer.setName(resultSet.getString(NAME));
                customer.setDrivingLicence(resultSet.getBoolean(DRIVING_LICENCE));
                customers.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
