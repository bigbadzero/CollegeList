public class Person {
    protected String firstName;
    protected String lastName;
    protected String streetAddress;
    protected String zipCode;
    protected String phoneNumber;

    public Person(String firstName, String lastName, String streetAddress, String zipCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }
     

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayName() {
        System.out.printf("Name: %s %s Address; %s, %s Phone Number: %s", firstName, lastName, streetAddress, zipCode, phoneNumber);
    }

    
}
