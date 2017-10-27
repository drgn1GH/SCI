package ro.sci.carrental.db;

import ro.sci.carrental.model.customer.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class CustomerDao extends DataBaseConnection implements CustomerDaoI<Customer> {
    //statements
    private static final String INSERT_STATEMENT = "INSERT INTO customers(name,driving_licence) VALUES (?,?)";
    private static final String UPDATE_STATEMENT = "UPDATE customers SET name=?,driving_licence=? where id=?";
    private static final String REMOVE_STATEMENT = "DELETE FROM customers WHERE id=?";
    private static final String SELECT_ALL_STATEMENT = "SELECT * FROM customers";
    private static final String SELECT_BY_DRIVING_LICENCE_STATEMENT = "SELECT * FROM customers where driving_licence=?";
    private static final String SELECT_BY_NAME_STATEMENT = "SELECT * FROM customers where LOWER(name)=LOWER(?)";

    //runtime exceptions
    private static final String DATABASE_ERROR = "Database error";
    private static final String EXCEPTION_THROWN = "Exception thrown";

    //succeed messages
    private static final String WRITING_IN_CUSTOMERS_HAS_SUCCEED = "Writing in customers has succeed";
    private static final String UPDATE_HAS_SUCCEED = "Update has succeed";
    private static final String DELETE_HAS_SUCCEED = "Delete has succeed";

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();

        try (Connection connection = newConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL_STATEMENT)) {
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getInt("id"));
                customer.setName(resultSet.getString("name"));
                customer.setDrivingLicence(resultSet.getBoolean("driving_licence"));
                customers.add(customer);
            }

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO,"All customers" +customers +"\n");
        return customers;
    }

    @Override
    public void add(Customer customer) {
        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STATEMENT)) {
            //preparedStatement.setInt(1, customer.getId());
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setBoolean(2, customer.hasDrivingLicence());
            preparedStatement.execute();

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO, WRITING_IN_CUSTOMERS_HAS_SUCCEED);

    }


    @Override
    public void update(Customer customer) {
        try (Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STATEMENT)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setBoolean(2, customer.hasDrivingLicence());
            preparedStatement.setInt(3, customer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO, UPDATE_HAS_SUCCEED);
    }

    @Override
    public void remove(Customer customer) {
        try(Connection connection = newConnection();PreparedStatement preparedStatement =connection.prepareStatement(REMOVE_STATEMENT)){
            preparedStatement.setInt(1,customer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO,DELETE_HAS_SUCCEED);
    }

    @Override
    public List<Customer> findCustomerByDrivingLicence() {
        List<Customer> foundCustomers = new ArrayList<>();
        try(Connection connection = newConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_DRIVING_LICENCE_STATEMENT) ) {
            preparedStatement.setBoolean(1,true);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setDrivingLicence(rs.getBoolean("driving_licence"));
                foundCustomers.add(customer);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO,"The customers with driving licence are: " +foundCustomers +"\n");
        return  foundCustomers;
    }

    @Override
    public List<Customer> findCustomerByName(String name) {
        List<Customer> foundCustomers = new ArrayList<>();
        try(Connection connection =newConnection();PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_NAME_STATEMENT)) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Customer customer = new Customer();
                customer.setId(resultSet.getInt("id"));
                customer.setName(resultSet.getString("name"));
                customer.setDrivingLicence(resultSet.getBoolean("driving_licence"));
                foundCustomers.add(customer);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, DATABASE_ERROR);
            throw new RuntimeException(EXCEPTION_THROWN);
        }
        LOGGER.log(Level.INFO,"Results for search by name are: " +foundCustomers +"\n");
        return foundCustomers;
    }
}
