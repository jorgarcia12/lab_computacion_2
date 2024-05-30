package ProblemaNor2;

public class Person {
    private String DNI;
    private String name;
    private String address;
    private String phoneNumber;

    // Constructor
    public Person(String DNI, String name, String address, String phoneNumber) {
        this.DNI = DNI;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getDNI() {
        return DNI;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

