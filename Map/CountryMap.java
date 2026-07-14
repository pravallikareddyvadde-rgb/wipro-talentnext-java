package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    // 1. Add Country and Capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get Capital from Country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get Country from Capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create another map with Capital as Key and Country as Value
    public HashMap<String, String> swapKyeValue() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // 5. Return ArrayList of Countries
    public ArrayList<String> toArrayList() {

        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of India : " + obj.getCapital("India"));

        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("\nSwapped Map:");
        System.out.println(obj.swapKyeValue());

        System.out.println("\nCountries List:");
        System.out.println(obj.toArrayList());
    }
}
