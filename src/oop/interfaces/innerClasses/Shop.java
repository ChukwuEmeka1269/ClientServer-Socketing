package oop.interfaces.innerClasses;

public class Shop {
    public static void main(String[] args) {
        Door door =  new Door();

        door.getLock().setLock(false);
        door.shopStatus();
    }
}
