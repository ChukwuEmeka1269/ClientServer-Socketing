package oop;

public class Fish extends Animal{
    private boolean live_in_water;
    private boolean hasGills;

    public Fish() {
    }

    public Fish(boolean live_in_water, boolean hasGills) {
        this.live_in_water = live_in_water;
        this.hasGills = hasGills;
    }

    public Fish(int height, int weight,
                String animal_type, String blood_type,
                boolean live_in_water, boolean hasGills) {
        super(height, weight, animal_type, blood_type);
        this.live_in_water = live_in_water;
        this.hasGills = hasGills;
    }

    public boolean isLive_in_water() {
        return live_in_water;
    }

    public boolean isHasGills() {
        return hasGills;
    }

    public String showInfo(){
        return "Fish info: " +
                "Height = " + getHeight()
                + ", Weight = " + getWeight()
                + ", Animal Type = " + getType()
                + ", Blood Type = " + getBlood_type()
                + ", Lives in Water = " + isLive_in_water()
                + ", Has Gills = " + isHasGills();
    }

}
