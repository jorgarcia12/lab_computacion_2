package ProblemaNor2;

import java.util.ArrayList;

public class Pilot {
    private String licenseNumber;
    private String restrictions;
    private ArrayList<PlaneType> authorizedPlaneTypes;

    // Constructor
    public Pilot(String licenseNumber, String restrictions, ArrayList<PlaneType> authorizedPlaneTypes) {
        this.licenseNumber = licenseNumber;
        this.restrictions = restrictions;
        this.authorizedPlaneTypes = authorizedPlaneTypes;
    }

    // Getters
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public ArrayList<PlaneType> getAuthorizedPlaneTypes() {
        return authorizedPlaneTypes;
    }

    // Setters
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public void setAuthorizedPlaneTypes(ArrayList<PlaneType> authorizedPlaneTypes) {
        this.authorizedPlaneTypes = authorizedPlaneTypes;
    }
}

