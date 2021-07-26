package oop;

public class Birds extends Animal{
    private boolean hasFeathers;
    private boolean canFly;

    public Birds() {
    }

    public Birds(boolean hasFeathers, boolean canFly) {
        this.hasFeathers = hasFeathers;
        this.canFly = canFly;
    }

    public Birds(int height, int weight,
                 String animal_type, String blood_type,
                 boolean hasFeathers, boolean canFly) {
        super(height, weight, animal_type, blood_type);
        this.hasFeathers = hasFeathers;
        this.canFly = canFly;
    }

    public boolean isHasFeathers() {
        return hasFeathers;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public String showInfo(){
        return "Bird info: " +
                "Height = " + getHeight()
                + " Weight = " + getWeight()
                + " Animal Type = " + getType()
                + ", Blood Type = " + getBlood_type()
                + ", Has Feathers = " + isHasFeathers()
                + ", Can Fly = " + isCanFly();

    }
}
