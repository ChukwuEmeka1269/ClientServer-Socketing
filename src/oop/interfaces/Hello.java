package oop.interfaces;


import oop.interfaces.phone.Nokia3310;
import oop.interfaces.phone.OnePlus5;
import oop.interfaces.phone.Phone;
import oop.interfaces.phone.SamsungGalaxy;

public class Hello {
    public static void main(String[] args) {
        Phone nokia = new Nokia3310();
        Phone samsung = new SamsungGalaxy();
        Phone onePlus = new OnePlus5();
        System.out.println(nokia.OperatingSystem());
        System.out.println(samsung.OperatingSystem());
        System.out.println(onePlus.OperatingSystem());

    }
}
