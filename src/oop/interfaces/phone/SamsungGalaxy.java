package oop.interfaces.phone;

public class SamsungGalaxy implements Phone{
    @Override
    public String processor() {
        System.out.println("SamsungGalaxy processor: ");
        return "X-500";
    }

    @Override
    public String OperatingSystem() {
        System.out.println("SamsungGalaxy OS: ");
        return "Android-09";
    }

    @Override
    public int memorySizeInGB() {
        System.out.println("SamsungGalaxy memory size in GB: ");
        return 32;
    }

    @Override
    public String color() {
        System.out.println("SamsungGalaxy color: ");
        return "Black";
    }
}
