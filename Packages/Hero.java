package Packages;

public class Hero extends Vehicle {

    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    public String getOwnerName() {
        return "Pravallika";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio Facility Available");
    }
}