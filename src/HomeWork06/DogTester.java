package HomeWork06;

public class DogTester {
    public static void main(String[] args) {

     /*
    2) Create a Dog Class and create 3 different objects of it:
     Husky, Bulldog, Labrador  with specific  attributes
     and behaviors.
     */
        System.out.println("***** Dog 1 *****");
        Dog dog1=new Dog();
        dog1.name="Milord";
        dog1.breed="Husky";
        dog1.color="Gray&White";
        dog1.weight=60;
        System.out.println(dog1.breed);
        System.out.println(dog1.color);
        System.out.println(dog1.weight+" lb");
        dog1.eat();

        System.out.println("***** Dog 2 *****");
        Dog dog2=new Dog();
        dog2.name="Max";
        dog2.breed="Bulldog";
        dog2.color="Brown";
        dog2.weight=45;
        System.out.println(dog2.breed);
        System.out.println(dog2.color);
        System.out.println(dog2.weight+" lb");
        dog2.eat();
        dog2.bite();

        System.out.println("****** Dog 3 ******");
        Dog dog3=new Dog();
        dog3.name="Charlie";
        dog3.breed="Labrador";
        dog3.color="Black";
        dog3.weight=75;
        System.out.println(dog3.breed);
        System.out.println(dog3.name);
        System.out.println(dog3.weight);
        dog3.trained();
        dog3.smart();




    }
}