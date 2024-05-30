package ProblemaNor1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some cities
        City city1 = new City("New York", 8623000, 1000000.0, 1200000.0);
        City city2 = new City("Los Angeles", 3971000, 800000.0, 900000.0);
        City city3 = new City("Chicago", 2693000, 700000.0, 600000.0);
        City city4 = new City("Houston", 2320000, 500000.0, 550000.0);

        // Create some taxes
        Tax incomeTax = new Tax("Income Tax", 500000.0);
        Tax salesTax = new Tax("Sales Tax", 300000.0);

        // Create a country and add cities
        Country country = new Country();
        country.addCity(city1);
        country.addCity(city2);
        country.addCity(city3);
        country.addCity(city4);

        // Calculate cities with deficit
        List<City> citiesWithDeficit = country.calculateDeficit();
        System.out.println("Cities with Deficit:");
        for (City city : citiesWithDeficit) {
            System.out.println(city.getName());
        }

        // Calculate provinces with deficit
        List<String> provincesWithDeficit = country.calculateProvincesWithDeficit();
        System.out.println("\nProvinces with Deficit:");
        for (String province : provincesWithDeficit) {
            System.out.println(province);
        }

        // Print tax information
        System.out.println("\nTax Information:");
        System.out.println("Income Tax Collected: $" + incomeTax.getCollectedAmount());
        System.out.println("Sales Tax Collected: $" + salesTax.getCollectedAmount());
    }
}
