package oop.interfaces.person;

public abstract class Person implements Alive, Live {
    public void speak(){
        System.out.println("Say something....");
    }

    @Override
    public void isAlive(){
        System.out.println("I am alive!");
    }

    @Override
    public void message(){
        System.out.println("Keep on living.");
    }
    public abstract void eat();
}
