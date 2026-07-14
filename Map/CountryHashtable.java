package Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class CountryHashtable {

    Hashtable<String, String> M1 = new Hashtable<>();

    // Add Country and Capital
    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Get Capital from Country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Get Country from Capital
    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }

        return null;
    }

    // Swap Key and Value
    public Hashtable<String, String> swapKeyValue() {

        Hashtable<String, String> M2 = new Hashtable<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // Convert Country names to ArrayList
    public ArrayList<String> toArrayList() {

        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }

    public static void main(String[] args) {

        CountryHashtable obj = new CountryHashtable();

        obj.saveCountryCapital("India", "New Delhi");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("Capital of India : " + obj.getCapital("India"));

        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("\nSwapped Hashtable:");
        System.out.println(obj.swapKeyValue());

        System.out.println("\nCountries List:");
        System.out.println(obj.toArrayList());
    }
}
