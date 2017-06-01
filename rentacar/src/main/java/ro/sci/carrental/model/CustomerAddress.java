package ro.sci.carrental.model;

/**
 * Created by tudor on 29.05.2017.
 */
public class CustomerAddress {
    private String town;
    private String street;
    private int number;
    private String postalCode;

    /**
     * default constructor
     */
    public CustomerAddress(){

    }

    /**
     * all fields constructor
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

    //setters


    public void setTown(String town) {
        this.town = town;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //getters


    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
