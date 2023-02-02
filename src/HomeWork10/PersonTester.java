package HomeWork10;

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("Jane Doe", 30);
        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());

        Person person2 = new Person();
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge());
    }

}
