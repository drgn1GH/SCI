package ro.sci.carrental.model;

/**
 * Created by tudor on 29.05.2017.
 * Create a Customer object blueprint
 */
public class Customer {
    private boolean drivingLicence;
    private String name;
    private String mobile;
    private String email;
    private CustomerAddress customerAddress;

    /**
     * default constructor
     */
    public Customer(){
    }

    /**
     * all fields contructor
     * @param drivingLicence
     * @param name
     * @param mobile
     * @param email
     * @param customerAddress
     */
    public Customer(boolean drivingLicence, String name, String mobile, String email, CustomerAddress customerAddress) {
        this.drivingLicence = drivingLicence;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.customerAddress = customerAddress;
    }

    //setters

    public void setDrivingLicence(boolean drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerAddress(CustomerAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    //getters

    public boolean isDrivingLicence() {
        return drivingLicence;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

}
