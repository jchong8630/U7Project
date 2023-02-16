import java.util.ArrayList;
import java.util.Arrays;

public class Address {
    private String street;
    private String streetName;
    private String aptNumber;
    private String city;
    private String state;
    private int zip;

    public Address(String s, String sn, String apt, String c, String st, int z){
        street = s;
        streetName = sn;
        aptNumber = apt;
        city = c;
        state = st;
        zip = z;
    }

    public Address(String address){
        address = address.replace(",", "");
        String[] addressSplit = address.split(" ");
        street = addressSplit[0];
        streetName = addressSplit[1] + " " + addressSplit[2];
        if (addressSplit.length >= 6){
            aptNumber = addressSplit[3] + " " + addressSplit[4];
            city = addressSplit[5];
            state = addressSplit[6];
            zip = Integer.parseInt(addressSplit[7]);
        }
        else{
            city = addressSplit[3];
            state = addressSplit[4];
            zip = Integer.parseInt(addressSplit[5]);
        }
    }

    public Address(Address a){
        street = a.street;
        streetName = a.streetName;
        aptNumber = a.aptNumber;
        city = a.city;
        state = a.state;
        zip = a.zip;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public String toString() {
        return street + " " + streetName + " " + aptNumber + ", " + city + ", " + state + " " + zip;
    }
}
