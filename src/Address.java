public class Address {
public String streetName;
public String streetNumber;
public String postCode;
public String cityName;
public String countryCode;
public String countryName;
public PhoneNumber phoneNumber;

    public Address(String streetName, String streetNumber, String postCode, String cityName, String countryCode, String countryName, PhoneNumber phoneNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postCode = postCode;
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.phoneNumber = phoneNumber;
    }
}
