package oop;

public class Reptile extends Animal{
    private boolean dry_skin;
    private boolean backbone;
    private String shellType;

    public Reptile() {
        super();
    }

    public Reptile(boolean dry_skin, boolean backbone, String shellType) {
        this.dry_skin = dry_skin;
        this.backbone = backbone;
        this.shellType = shellType;
    }

    public Reptile(int height, int weight, String animal_type,
                   String blood_type, boolean dry_skin,
                   boolean backbone, String shellType) {
        super(height, weight, animal_type, blood_type);
        this.dry_skin = dry_skin;
        this.backbone = backbone;
        this.shellType = shellType;
    }

    protected boolean isDry_skin() {
        return dry_skin;
    }

    protected boolean isBackbone() {
        return backbone;
    }

    protected String getShellType() {
        return shellType;
    }

    public String showInfo(){
        return "Reptile info: \n " +
                "Height = " + getHeight()
                + ", Weight = " + getWeight()
                + ", Type of Animal = " + getType()
                + ", Blood Type = " + getBlood_type()
                + ", isDry Skin = " +  isDry_skin()
                + ", Has Backbone ? = " + isBackbone()
                + ", Shell Type = " + getShellType();

    }
}
