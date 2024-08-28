package Polymorphism;

public class Mitsubishi extends Car{
    // write code here

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Mitsubishi is running";
    }

    @Override
    public String accelerate() {
        return "The Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        return "The Mitsubishi is braking";
    }
}