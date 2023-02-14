package HomeWork15;

public class ComputerTester {

    public static void main(String[] args) {
        Computer[] computers = new Computer[4];
        computers[0] = new Apple(8, 512);
        computers[1] = new Lenovo(16, 1024);
        computers[2] = new HP(4, 256);
        computers[3] = new Dell(32, 2048);

        for (Computer computer : computers) {
            computer.turnOn();
            if (computer instanceof Apple) {
                ((Apple) computer).useRetinaDisplay();
            } else if (computer instanceof Lenovo) {
                ((Lenovo) computer).useTrackPoint();
            } else if (computer instanceof HP) {
                ((HP) computer).useTouchscreen();
            } else if (computer instanceof Dell) {
                ((Dell) computer).useAlienwareGraphics();
            }
            computer.shutDown();
        }
    }
}
