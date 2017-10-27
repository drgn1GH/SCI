package ro.sci.carrental.reader;

import ro.sci.carrental.model.customer.Customer;

public class CustomerConverter implements Converter<Customer> {
    @Override
    public Customer convert(String convertedString) throws InvalidEntityException {
        String[] tokens = convertedString.split (",");
        if (tokens.length != 3) {
            throw new InvalidEntityException ("Invalid Customer Description");
        }

        Customer customer = new Customer ();
        customer.setDrivingLicence(Boolean.parseBoolean(tokens[0]));
        customer.setName(tokens[1]);
        customer.setEmail(tokens[2]);
        return customer;
    }
}
