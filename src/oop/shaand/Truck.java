package oop.shaand;

public class Truck extends Vehicle{
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int container;

    public Truck() {
        super();
    }

    public Truck(String steering, String musicSystem, String airConditioner, int container) {
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public Truck(String engine, int wheels, int seats,
                 int fuelTank, String lights, String steering,
                 String musicSystem, String airConditioner,
                 int container) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
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

    private int getContainer() {
        return container;
    }

    public void run(){
        System.out.println("Truck is running....");
    }

    public String showInfo(){
        return "Truck info: \n " +
                "Steering = " + getSteering()
                + ", Music System = " + getMusicSystem()
                + ", AirConditioner = " + getAirConditioner()
                + ", Container = " + getContainer()
                + ", Engine = " + getEngine()
                + ", Wheels = " + getWheels()
                + ", Seats = " + getSeats()
                + ", Lights = " + getLights();
    }
}
