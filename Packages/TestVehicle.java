package Packages;

public class TestVehicle {

    public static void main(String[] args) {

        Hero h = new Hero();

        System.out.println(h.getModelName());
        System.out.println(h.getRegistrationNumber());
        System.out.println(h.getOwnerName());
        System.out.println(h.getSpeed());
        h.radio();

        System.out.println();

        Honda ho = new Honda();

        System.out.println(ho.getModelName());
        System.out.println(ho.getRegistrationNumber());
        System.out.println(ho.getOwnerName());
        System.out.println(ho.getSpeed());
        ho.cdplayer();
    }
}