package oop.shaand;

public class Bike extends Vehicle{
    public String handle;

    public Bike() {
        super();
        this.handle = "short";
    }

    public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    private String getHandle() {
        return this.handle;
    }


    public void run(){
        System.out.println("Bike is running.....");
    }



    public String showInfo(){
        return ("Handle =  " + getHandle()
                + ", Engine = " + getEngine()
                + ", Wheels = " + getWheels()
                + ", Seats = " + getSeats()
                + ", Fuel Tank = " + getFuelTank()
                + ", Lights = " + getLights());
    }
}
