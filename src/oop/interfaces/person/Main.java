package oop.interfaces.person;

public class Main {
    public static void main(String[] args) {
        Person avry = new Vegan();
        Person matt = new NonVegan();
        avry.message();
    }
}
