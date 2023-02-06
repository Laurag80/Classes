package HomeWork13;

public class Test {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 30, 50000, 9);
        System.out.println("Full Time Employee Details");
        fullTimeEmployee.displayDetails();
        System.out.println();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Doe", 25, 25000, 6, 15);
        System.out.println("Part Time Employee Details");
        partTimeEmployee.displayDetails();
        System.out.println();

        Tester tester = new Tester("John Smith", 35, 60000, 9, 5, "Java");
        System.out.println("Tester Details");
        tester.displayDetails();
    }
}
