package oop.interfaces.localInnerClass;

public class Shop {
    public static void main(String[] args) {
//        Door door = new Door();
//        System.out.println(door.isLocked("false"));
        if(new Door().isLocked(args[0])){
            System.out.println("Shop is closed, please visit us some other time. Thanks.");
        }
        else{
            System.out.println("Welcome to Rexco inc.");
        }
    }

}
