package Polymorphism;

public class Ford extends Car{
    // write code here

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Ford is running";
    }

    @Override
    public String accelerate() {
        return "The Ford is accelerating";
    }

    @Override
    public String brake() {
        return "The Ford is braking";
    }
}