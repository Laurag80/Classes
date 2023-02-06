package HomeWork13;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {
    private int workingHours;

    public FullTimeEmployee(String name, int age, double salary, int workingHours) {
        super(name, age, salary);
        this.workingHours = workingHours;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Working Hours: " + workingHours);
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int age, double salary, int hoursWorked, double hourlyRate) {
        super(name, age, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}

class Tester extends FullTimeEmployee {
    private int noOfProjects;
    private String technology;

    public Tester(String name, int age, double salary, int workingHours, int noOfProjects, String technology) {
        super(name, age, salary, workingHours);
        this.noOfProjects = noOfProjects;
        this.technology = technology;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("No. of Projects: " + noOfProjects);
        System.out.println("Technology: " + technology);
    }
}

