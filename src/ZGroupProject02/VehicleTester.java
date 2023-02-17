package ZGroupProject02;

public class VehicleTester {
    public static void main(String[] args) {

        Sedan sedan = new Sedan(20000.0, 15.0);
        System.out.println("Sedan sale price: " + sedan.calculateSalePrice());

        Truck truck = new Truck(30000.0, 2500.0);
        System.out.println("Truck sale price: " + truck.calculateSalePrice());
    }
}
