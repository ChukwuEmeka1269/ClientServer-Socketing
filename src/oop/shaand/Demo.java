package oop.shaand;

public class Demo {
    public static void main(String[] args) {
        Bike bike = new Bike("long","water",2,2,150,"Halogen");


        System.out.println(bike.showInfo());

        bike.run();
        Car car = new Car("Gas",4,6,200,"LED","Power steering", "stereo","on","present","Boomplayer");
        car.run();
        System.out.println(car.showInfo());

        Truck truck = new Truck("Diesel", 16, 4, 10, "LED", "Power steering", "Stereo Bass", "Cool", 12);
        truck.run();
        System.out.println(truck.showInfo());

    }
}
