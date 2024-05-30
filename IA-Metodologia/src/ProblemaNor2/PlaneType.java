package ProblemaNor2;

public class PlaneType {
    private int modelNumber;
    private int capacity;
    private double weight;

    // Constructor
    public PlaneType(int modelNumber, int capacity, double weight) {
        this.modelNumber = modelNumber;
        this.capacity = capacity;
        this.weight = weight;
    }

    // Getters
    public int getModelNumber() {
        return modelNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    // Setters
    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

