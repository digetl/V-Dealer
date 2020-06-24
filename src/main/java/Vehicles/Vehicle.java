package Vehicles;

public abstract class Vehicle {
    private double price;
    private String make; // make = manufacturer
    private String model;

    public Vehicle(double price, String make, String model) {
        this.price = price;
        this.make = make;
        this.model = model;
    }

    public double getPrice() {
        return this.price;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }
}
