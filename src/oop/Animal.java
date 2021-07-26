package oop;

public class Animal {
    private int height;
    private int weight;
    private String animal_type;
    private String blood_type;

    public Animal() {
        this.height = 50;
        this.weight = 200;
        this.animal_type = "";
        this.blood_type = "AB";

    }

    public Animal(int height, int weight, String animal_type, String blood_type) {
        this.height = height;
        this.weight = weight;
        this.animal_type = animal_type;
        this.blood_type = blood_type;
    }


    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return animal_type;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public String showInfo(){
        return "Animal info: \n"
                + ", Height = " + getHeight()
                + ", Weight = " + getWeight()
                + ", Animal Type = " + getType()
                + ", Blood Type = " + getBlood_type();

    }




}
