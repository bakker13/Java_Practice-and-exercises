public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    public void drive() {
        System.out.println("Car -> runEngine");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car -> drivingm type is " + getClass().getSimpleName());

    }
}
