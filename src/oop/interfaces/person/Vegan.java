package oop.interfaces.person;

public class Vegan extends Person{
    @Override
    public void speak() {
        System.out.println("I am a vegan.");
    }

    @Override
    public void eat() {
        System.out.println("I eat Vegetables only.");
    }
}
