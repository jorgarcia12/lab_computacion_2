package ProblemaNor1;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private List<City> cityList;

    public Country() {
        cityList = new ArrayList<>();
    }

    public void addCity(City city) {
        cityList.add(city);
    }

    public List<City> calculateDeficit() {
        List<City> citiesWithDeficit = new ArrayList<>();
        for (City city : cityList) {
            if (city.getMaintenanceExpense() > city.getCollectedAmount()) {
                citiesWithDeficit.add(city);
            }
        }
        return citiesWithDeficit;
    }

    public List<String> calculateProvincesWithDeficit() {
        List<String> provincesWithDeficit = new ArrayList<>();
        // Assuming provinces are identified by the first two characters of the city name
        for (int i = 0; i < cityList.size(); i += 2) {
            String province = cityList.get(i).getName().substring(0, 2);
            int citiesWithDeficit = 0;
            for (int j = i; j < cityList.size() && cityList.get(j).getName().startsWith(province); j++) {
                if (cityList.get(j).getMaintenanceExpense() > cityList.get(j).getCollectedAmount()) {
                    citiesWithDeficit++;
                }
            }
            if (citiesWithDeficit > cityList.size() / 4) {
                provincesWithDeficit.add(province);
            }
        }
        return provincesWithDeficit;
    }
}
