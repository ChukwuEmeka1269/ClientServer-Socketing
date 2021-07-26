package oop.interfaces.phone;

public class OnePlus5 implements Phone{

    public String processor(){
        return "835";
    }

    @Override
    public String OperatingSystem() {
        return "Android 10";
    }

    @Override
    public int memorySizeInGB() {
        return 32;
    }

    @Override
    public String color() {
        return "gold";
    }
}
