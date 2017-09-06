package ro.sci.carrental.reader;

import ro.sci.carrental.model.customer.CustomerAddress;

public class AddressConverter implements Converter<CustomerAddress> {

    @Override
    public CustomerAddress convert(String convertedString) throws InvalidEntityException {
        String[] tokens = convertedString.split (",");
        if (tokens.length != 4) {
            throw new InvalidEntityException ("Invalid Address Description");
        }
        CustomerAddress ca = new CustomerAddress();
        ca.setTown(tokens[0]);
        ca.setStreet(tokens[1]);
        ca.setNumber(Integer.valueOf(tokens[2]));
        ca.setPostalCode(tokens[3]);
        return ca;
    }
}