package bizPackage;

public class Address {

    private int addressID;
    private String street;
    private String houseNo;
    private String zipCode;
    private String city;
    private String country;

    //++++++++++++++++++++++Constructors++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    public Address(String street, String houseNo, String zipCode, String city, String country) {
        setStreet(street);
        setHouseNo(houseNo);
        setZipCode(zipCode);
        setCity(city);
        setCountry(country);
    }

    public Address(int addressID, String street, String houseNo, String zipCode, String city, String country) {
        setAddressID(addressID);
        setStreet(street);
        setHouseNo(houseNo);
        setZipCode(zipCode);
        setCity(city);
        setCountry(country);
    }


    //++++++++++++++++++++++Getter&Setter++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    //++++++++++++++++++++++Methods++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


}
