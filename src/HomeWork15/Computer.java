package HomeWork15;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

    String brand;
    int ram;
    int storage;

    public Computer(String brand, int ram, int storage) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
    }

    public void turnOn() {
        System.out.println("Turning on the computer...");
    }

    public void shutDown() {
        System.out.println("Shutting down the computer...");
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }
}

class Apple extends Computer {
    public Apple(int ram, int storage) {
        super("Apple", ram, storage);
    }

    @Override
    public void turnOn() {
        System.out.println("Booting up the Apple computer...");
    }

    public void useRetinaDisplay() {
        System.out.println("Using Retina Display...");
    }
}

class Lenovo extends Computer {
    public Lenovo(int ram, int storage) {
        super("Lenovo", ram, storage);
    }

    @Override
    public void turnOn() {
        System.out.println("Starting up the Lenovo computer...");
    }

    public void useTrackPoint() {
        System.out.println("Using the TrackPoint...");
    }
}

class HP extends Computer {
    public HP(int ram, int storage) {
        super("HP", ram, storage);
    }

    @Override
    public void turnOn() {
        System.out.println("Powering up the HP computer...");
    }

    public void useTouchscreen() {
        System.out.println("Using the touchscreen...");
    }
}

class Dell extends Computer {
    public Dell(int ram, int storage) {
        super("Dell", ram, storage);
    }

    @Override
    public void turnOn() {
        System.out.println("Booting up the Dell computer...");
    }

    public void useAlienwareGraphics() {
        System.out.println("Using Alienware graphics...");
    }
}
