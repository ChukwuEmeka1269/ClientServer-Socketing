package oop;

public class AnimalMain {
    public static void main(String[] args) {
        Reptile snake = new Reptile(150,200,"Reptile","O+",true,false,"Soft shelled eggs");
        System.out.println(snake.showInfo());

        Birds bird = new Eagle(2,5,"Bird","O-",true,true);
        System.out.println(bird.showInfo());

        Reptile crocodile = new Crocodile(5,250,"Reptile","R+",true,false,"Hard",true);
        System.out.println(crocodile.showInfo());
    }
}
