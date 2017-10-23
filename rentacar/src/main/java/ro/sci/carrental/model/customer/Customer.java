package ro.sci.carrental.model.customer;

/**
 * Created by tudor on 29.05.2017.
 * Create a customer object blueprint
 */
public class Customer {
    private int id;
    private boolean drivingLicence;
    private String name;
    private String mobile;
    private String email;
    private CustomerAddress customerAddress;

    public Customer() {
    }

    public Customer(boolean drivingLicence, String name) {
        this.drivingLicence = drivingLicence;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(boolean drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public boolean hasDrivingLicence() {
        return drivingLicence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(CustomerAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "drivingLicence=" + drivingLicence +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", customerAddress=" + customerAddress +
                '}';
    }
}
