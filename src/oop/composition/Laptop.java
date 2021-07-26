package oop.composition;

public class Laptop {
    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String opticalDrive;
    private String keyboard;

    public Laptop() {
        this.screen = 16.5f;
        this.processor = new Processor();
        this.ram = "2.5Ghz";
        this.hardDrive = "HDDR";
        this.graphicsCard = new GraphicsCard();
        this.opticalDrive = "Blu-ray";
        this.keyboard = "Backlit";
    }

    public Laptop(float screen, Processor processor,
                  String ram, String hardDrive,
                  GraphicsCard graphicsCard, String opticalDrive,
                  String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
