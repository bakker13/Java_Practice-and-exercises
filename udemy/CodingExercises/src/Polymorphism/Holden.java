package Polymorphism;

public class Holden extends Car{
    // write code here

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Holden is running";
    }

    @Override
    public String accelerate() {
        return "The Holden is accelerating";
    }

    @Override
    public String brake() {
        return "The Holden is braking";
    }
}