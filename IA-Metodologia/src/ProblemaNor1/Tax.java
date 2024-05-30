package ProblemaNor1;

public class Tax {
    private String type;
    private double collectedAmount;

    // Constructor
    public Tax(String type, double collectedAmount) {
        this.type = type;
        this.collectedAmount = collectedAmount;
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getCollectedAmount() {
        return collectedAmount;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setCollectedAmount(double collectedAmount) {
        this.collectedAmount = collectedAmount;
    }
}
