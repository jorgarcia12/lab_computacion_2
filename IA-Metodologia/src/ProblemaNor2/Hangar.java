package ProblemaNor2;

public class Hangar {
    private int number;
    private int capacity;
    private String location;

    // Constructor
    public Hangar(int number, int capacity, String location) {
        this.number = number;
        this.capacity = capacity;
        this.location = location;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

