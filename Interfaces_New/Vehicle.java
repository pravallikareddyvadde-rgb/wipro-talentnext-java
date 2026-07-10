package Interfaces_New;

public interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}
