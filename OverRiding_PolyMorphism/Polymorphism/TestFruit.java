package OverRiding_PolyMorphism.Polymorphism;

public class TestFruit {
    public static void main(String[] args) {

        Fruit f = new Fruit("Mango", "Sweet", "Large");
        f.eat();

        Apple a = new Apple();
        a.eat();

        Orange o = new Orange();
        o.eat();
    }
}
