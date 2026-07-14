package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> countries = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        countries.add(countryName);
        return countries;
    }

    public String getCountry(String countryName) {

        Iterator<String> itr = countries.iterator();

        while (itr.hasNext()) {
            String country = itr.next();

            if (country.equals(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}
