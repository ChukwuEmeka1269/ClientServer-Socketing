package oop.composition;

public class MainComposition {
    public static void main(String[] args) {
        Laptop myLappy = new Laptop();
        System.out.println(myLappy.getProcessor().getSeries());


    }
}
