package ProblemaNor2;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a PlaneType
        PlaneType planeType = new PlaneType(123, 200, 50000.0);

        // Create a Hangar
        Hangar hangar = new Hangar(1, 5,"Colorado");
        // Create some Persons (Owners)
        Person owner1 = new Person("44662355","Jorge","Lemos 59","2615904264");
        Person owner2 = new Person("987654321", "Jane Smith", "456 Oak Ave", "555-5678");
        ArrayList<Person> owners = new ArrayList<>();
        owners.add(owner1);
        owners.add(owner2);

        // Create a Plane
        Plane plane = new Plane("N123AB", planeType, hangar, owners, new Date());

        // Create a Mechanic
        ArrayList<PlaneType> authorizedPlaneTypes = new ArrayList<>();
        authorizedPlaneTypes.add(planeType);
        Mechanic mechanic = new Mechanic(50000.0, "Day Shift", authorizedPlaneTypes);

        // Create a Pilot
        ArrayList<PlaneType> pilotAuthorizedPlaneTypes = new ArrayList<>();
        pilotAuthorizedPlaneTypes.add(planeType);
        Pilot pilot = new Pilot("ABC123", "None", pilotAuthorizedPlaneTypes);

        // Create a Service
        Service service = new Service(new Date(), 4.5, "Engine Maintenance");
        plane.addService(service);

        // Print some information
        System.out.println("Plane Registration Number: " + plane.getRegistrationNumber());
        System.out.println("Plane Type Model Number: " + plane.getType().getModelNumber());
        System.out.println("Hangar Number: " + plane.getHangar().getNumber());
        System.out.println("Number of Owners: " + plane.getOwners().size());
        System.out.println("Mechanic Salary: " + mechanic.getSalary());
        System.out.println("Pilot License Number: " + pilot.getLicenseNumber());
        System.out.println("Last Service Date: " + plane.getServicesPerformed().get(0).getDate());
    }
}
