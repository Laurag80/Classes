package HomeWork10;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("John Doe", 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
