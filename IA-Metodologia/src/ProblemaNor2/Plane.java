package ProblemaNor2;

import java.util.ArrayList;
import java.util.Date;

public class Plane {
    private String registrationNumber;
    private PlaneType type;
    private Hangar hangar;
    private ArrayList<Person> owners;
    private Date acquisitionDate;
    private ArrayList<Service> servicesPerformed;

    // Constructor
    public Plane(String registrationNumber, PlaneType type, Hangar hangar, ArrayList<Person> owners, Date acquisitionDate) {
        this.registrationNumber = registrationNumber;
        this.type = type;
        this.hangar = hangar;
        this.owners = owners;
        this.acquisitionDate = acquisitionDate;
        this.servicesPerformed = new ArrayList<>();
    }

    // Getters and Setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public PlaneType getType() {
        return type;
    }

    public void setType(PlaneType type) {
        this.type = type;
    }

    public Hangar getHangar() {
        return hangar;
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    public ArrayList<Person> getOwners() {
        return owners;
    }

    public void setOwners(ArrayList<Person> owners) {
        this.owners = owners;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public ArrayList<Service> getServicesPerformed() {
        return servicesPerformed;
    }

    // Other Methods
    public void addOwner(Person owner) {
        owners.add(owner);
    }

    public void addService(Service service) {
        servicesPerformed.add(service);
    }
}
