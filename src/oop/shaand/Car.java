package oop.shaand;

public class Car extends Vehicle{
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String fridge;
    private String entertainmentSystem;

    public Car() {
        super();
        this.steering = "Power Steering";
        this.musicSystem = "SoundCity";
        this.airConditioner = "Present";
        this.fridge = "ThermoCool";
        this.entertainmentSystem = "Stereo";
    }

    public Car(String engine, int wheels, int seats, int fuelTank,
               String lights, String steering, String musicSystem,
               String airConditioner, String fridge, String entertainmentSystem) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.entertainmentSystem = entertainmentSystem;
    }




    private String getSteering() {
        return steering;
    }

    private String getMusicSystem() {
        return musicSystem;
    }

    private String getAirConditioner() {
        return airConditioner;
    }

    private String getFridge() {
        return fridge;
    }

    private String getEntertainmentSystem() {
        return entertainmentSystem;
    }


    public void run(){
        System.out.println("Car is running.......");
    }

    public String showInfo(){
        return ("Car info: \n"
                + "Steering =  " + getSteering()
                + ", Music System = " + getMusicSystem()
                + ", AirConditioner = " + getAirConditioner()
                + ", Fridge = " + getFridge()
                + ", Entertainment System = " + getEntertainmentSystem()
                + ", Engine = " + getEngine()
                + ", Wheels = " + getWheels()
                + ", Seats = " + getSeats()
                + ", Fuel Tank = " + getFuelTank()
                + ", Lights = " + getLights()
                );
    }


}
