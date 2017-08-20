package ro.sci.carrental.model.customer;

/**
 * Create a customer adress object blueprint
 * Created by tudor on 29.05.2017
 */
public class CustomerAddress {
    private String town;
    private String street;
    private int number;
    private String postalCode;

    /**
     * default constructor
     */
    public CustomerAddress() {

    }

    /**
     * all fields constructor
     *
     * @param town
     * @param street
     * @param number
     * @param postalCode
     */
    public CustomerAddress(String town, String street, int number, String postalCode) {
        this.town = town;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "CustomerAddress{" +
                "town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
