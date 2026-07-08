package OverRiding_PolyMorphism.Polymorphism;

public class Apple extends Fruit {

    public Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Apple tastes Sweet.");
    }
}
