package oop.interfaces.person;

public class NonVegan extends Person{

    @Override
    public void speak() {
        System.out.println("I love meat.");
    }

    @Override
    public void eat() {
        System.out.println("I eat both vegetables and meat.");
    }
}
