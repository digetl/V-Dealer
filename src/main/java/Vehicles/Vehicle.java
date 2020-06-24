package Vehicles;

public abstract class Vehicle {
    private double price;
    private String make; // make = manufacturer

    public Vehicle(double price, String make) {
        this.price = price;
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public String getMake() {
        return this.make;
    }
}
