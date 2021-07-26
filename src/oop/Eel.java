package oop;

public class Eel extends Fish{
    private boolean release_electric_charge;

    public Eel() {
    }

    public Eel(boolean release_electric_charge) {
        this.release_electric_charge = release_electric_charge;
    }

    public Eel(boolean live_in_water, boolean hasGills, boolean release_electric_charge) {
        super(live_in_water, hasGills);
        this.release_electric_charge = release_electric_charge;
    }

    public Eel(int height, int weight,
               String animal_type, String blood_type,
               boolean live_in_water, boolean hasGills,
               boolean release_electric_charge) {
        super(height, weight, animal_type, blood_type, live_in_water, hasGills);
        this.release_electric_charge = release_electric_charge;
    }

    public boolean isRelease_electric_charge() {
        return release_electric_charge;
    }

    public String showInfo(){
        return "Eel info: " +
                "Height = " + getHeight()
                + " Weight = " + getWeight()
                + " Animal Type = " + getType()
                + ", Blood Type = " + getBlood_type()
                + ", Live in Water = " + isLive_in_water()
                + ", Has Gills = " + isHasGills()
                + ", Release Electric Charge = " + isRelease_electric_charge();
    }

}
