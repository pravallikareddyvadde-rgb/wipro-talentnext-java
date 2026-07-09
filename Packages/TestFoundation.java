package Packages;

public class TestFoundation {

    public static void main(String[] args) {

        Foundation f = new Foundation();

        // Same package, so default, protected and public are accessible
        System.out.println("var2 = " + f.var2);
        System.out.println("var3 = " + f.var3);
        System.out.println("var4 = " + f.var4);

        // Private is not accessible
        // System.out.println(f.var1);
    }
}