// Base class Vehicle
class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println(make + " " + model + " is driving");
    }

    public void printAttributes() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Max Speed: " + maximumSpeed + " km/h");
    }
}

// Subclass Car
class Car extends Vehicle {

    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving");
    }
}

// Subclass Bike
class Bike extends Vehicle {

    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}

// Main class to test everything
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 240);
        Bike bike = new Bike("Yamaha", "FZ", 2021, 180);

        System.out.println("Car Details:");
        car.printAttributes();
        car.drive();

        System.out.println("\nBike Details:");
        bike.printAttributes();
        bike.drive();
    }
}