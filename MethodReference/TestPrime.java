package MethodReference;

public class TestPrime {

    public static void main(String[] args) {

        PrimeInterface p = Prime::new;

        p.check(17);
        p.check(20);
    }
}
