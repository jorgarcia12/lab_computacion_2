package ProblemaNor2;

import java.util.Date;

public class Service {
    private Date date;
    private double hoursWorked;
    private String jobType;

    // Constructor
    public Service(Date date, double hoursWorked, String jobType) {
        this.date = date;
        this.hoursWorked = hoursWorked;
        this.jobType = jobType;
    }

    // Getters
    public Date getDate() {
        return date;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getJobType() {
        return jobType;
    }

    // Setters
    public void setDate(Date date) {
        this.date = date;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
}

