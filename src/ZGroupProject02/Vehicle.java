package ZGroupProject02;

public class Vehicle {
    /*
    3. Class Vehicle that would have the following fields: vehiclePrice and method
    calculateSalePrice() which should be returning a price of the Vehicle.
    C reate 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own
    implementation of  calculateSalePrice() method in which returned price calculated as following:
    if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it is own implementation of
    calculateSalePrice(): if length of sedan is >20
    feet then returned car price should include 5% discount, otherwise 10% discount
     */
    protected double vehiclePrice;

    public Vehicle(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public double calculateSalePrice() {
        return vehiclePrice;
    }
}

class Sedan extends Vehicle {
    private double length;

    public Sedan(double vehiclePrice, double length) {
        super(vehiclePrice);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return vehiclePrice * 0.95;
        } else {
            return vehiclePrice * 0.9;
        }
    }
}

class Truck extends Vehicle {
    private double weight;

    public Truck(double vehiclePrice, double weight) {
        super(vehiclePrice);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return vehiclePrice * 0.9;
        } else {
            return vehiclePrice * 0.8;
        }
    }
}
