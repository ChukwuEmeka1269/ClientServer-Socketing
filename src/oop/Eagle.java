package oop;

public class Eagle extends Birds{

    public Eagle() {
    }

    public Eagle(boolean hasFeathers, boolean canFly) {
        super(hasFeathers, canFly);
    }

    public Eagle(int height, int weight,
                 String animal_type, String blood_type,
                 boolean hasFeathers, boolean canFly) {
        super(height, weight, animal_type, blood_type, hasFeathers, canFly);
    }



    public String showInfo(){
        return "Eagle Info: \n" +
                "Height = " + getHeight()
                + " Weight = " + getWeight()
                + " Animal Type = " + getType()
                + ", Blood Type = " + getBlood_type()
                + ", Has Feathers = " + isHasFeathers()
                + ", Can Fly = " + isCanFly();
    }
}
