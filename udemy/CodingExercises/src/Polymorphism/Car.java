package Polymorphism;

public class Car {
    // write code here

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "The Car is running";
    }

    public String accelerate() {
        return "The Car is accelerating";
    }

    public String brake() {
        return "The Car is braking";
    }
}