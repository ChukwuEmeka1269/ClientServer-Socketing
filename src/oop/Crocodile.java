package oop;

public class Crocodile extends Reptile{
    private boolean hard_shelled_eggs;

    public Crocodile() {
    }

    public Crocodile(boolean hard_shelled_eggs) {
        this.hard_shelled_eggs = hard_shelled_eggs;
    }

    public Crocodile(boolean dry_skin, boolean backbone, String shellType, boolean hard_shelled_eggs) {
        super(dry_skin, backbone, shellType);
        this.hard_shelled_eggs = hard_shelled_eggs;
    }

    public Crocodile(int height, int weight, String animal_type,
                     String blood_type, boolean dry_skin, boolean backbone,
                     String shellType, boolean hard_shelled_eggs) {
        super(height, weight, animal_type, blood_type, dry_skin, backbone, shellType);
        this.hard_shelled_eggs = hard_shelled_eggs;
    }

    public boolean isHard_shelled_eggs() {
        return hard_shelled_eggs;
    }

    public String showInfo(){
        return "Crocodile info: \n" +
                "Height = " + getHeight()
                + ", Weight = " + getWeight()
                + ", Animal Type = " + getType()
                + ", Blood Type = " + getBlood_type()
                + ", Has Dry Skin = " + isDry_skin()
                + ", Has Backbone = " + isBackbone()
                + ", Shell Type = " + getShellType()
                + ", Has Hard Shelled Eggs = " + isHard_shelled_eggs();
    }
}
