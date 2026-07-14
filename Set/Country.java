package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Country {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {
        Iterator<String> itr = H1.iterator();

        while (itr.hasNext()) {
            String country = itr.next();
            if (country.equals(CountryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Country obj = new Country();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}
