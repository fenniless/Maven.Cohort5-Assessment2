package rocks.zipcode.assessment2.objectorientation;

import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
//    public Address address;
    public String addressLine1 = "";
    public String addressLine2 = "";
    public String city = "";
    public String state = "";
    public String zipcode = "";
    public Address address;

    public Address() {
        address = new Address(addressLine1,addressLine2, city,state,zipcode);
//        this.address = address
//        this.addressLine1 = "";
//        this.addressLine2 = "";
//        this.city = "";
//        this.state = "";
//        this.zipcode= "";
    }
    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.address = address;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return address.addressLine1.toString();
    }

    public void setAddressLine1(String addressLine1) {

        address.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return address.addressLine2.toString();
    }

    public void setAddressLine2(String addressLine2) {
        address.addressLine2 = addressLine2;
    }

    public String getCity() {
        return address.city.toString();
    }

    public void setCity(String city) {
        address.city = city;
    }

    public String getState() {
        return address.state.toString();
    }

    public void setState(String state) {
        address.state = state;
    }

    public String getZipcode() {
        return address.zipcode.toString();
    }

    public void setZipcode(String zipcode) {
        address.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        return address.equals(o);
    }
}
