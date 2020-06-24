package Vehicles;

public abstract class Vehicle {
    private double price;

    public Vehicle(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

}
