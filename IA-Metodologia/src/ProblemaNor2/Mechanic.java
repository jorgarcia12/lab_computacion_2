package ProblemaNor2;

import java.util.ArrayList;

public class Mechanic {
    private double salary;
    private String shift;
    private ArrayList<PlaneType> authorizedPlaneTypes;

    // Constructor
    public Mechanic(double salary, String shift, ArrayList<PlaneType> authorizedPlaneTypes) {
        this.salary = salary;
        this.shift = shift;
        this.authorizedPlaneTypes = authorizedPlaneTypes;
    }

    // Getters
    public double getSalary() {
        return salary;
    }

    public String getShift() {
        return shift;
    }

    public ArrayList<PlaneType> getAuthorizedPlaneTypes() {
        return authorizedPlaneTypes;
    }

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setAuthorizedPlaneTypes(ArrayList<PlaneType> authorizedPlaneTypes) {
        this.authorizedPlaneTypes = authorizedPlaneTypes;
    }
}

