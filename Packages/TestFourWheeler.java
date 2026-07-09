package Packages;

public class TestFourWheeler {

    public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println(l.getModelName());
        System.out.println(l.getRegistrationNumber());
        System.out.println(l.getOwnerName());
        System.out.println("Speed : " + l.speed());
        System.out.println("GPS : " + l.gps());

        System.out.println();

        Ford f = new Ford();

        System.out.println(f.getModelName());
        System.out.println(f.getRegistrationNumber());
        System.out.println(f.getOwnerName());
        System.out.println("Speed : " + f.speed());
        System.out.println("Temperature Control : " + f.tempControl());
    }
}