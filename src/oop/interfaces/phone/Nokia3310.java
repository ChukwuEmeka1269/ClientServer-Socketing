package oop.interfaces.phone;

public class Nokia3310 implements Phone{
    @Override
    public String processor() {
        System.out.println("Nokia3310 processor: ");
        return "N54-89";
    }

    @Override
    public String OperatingSystem() {
        System.out.println("Nokia3310 OS: ");
        return "Android-08";
    }

    @Override
    public int memorySizeInGB() {
        System.out.println("Nokia3310 memory space in GB: ");
        return 16;
    }

    @Override
    public String color() {
        System.out.println("Nokia3310 color: ");
        return "Blue";
    }
}
