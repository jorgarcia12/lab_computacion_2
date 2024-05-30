package ProblemaNor1;

public class City {
    private String name;
    private int population;
    private double collectedAmount;
    private double maintenanceExpense;

    // Constructor
    public City(String name, int population, double collectedAmount, double maintenanceExpense) {
        this.name = name;
        this.population = population;
        this.collectedAmount = collectedAmount;
        this.maintenanceExpense = maintenanceExpense;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getCollectedAmount() {
        return collectedAmount;
    }

    public double getMaintenanceExpense() {
        return maintenanceExpense;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCollectedAmount(double collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    public void setMaintenanceExpense(double maintenanceExpense) {
        this.maintenanceExpense = maintenanceExpense;
    }
}


