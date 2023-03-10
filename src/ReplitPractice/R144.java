package ReplitPractice;

public class R144 {
    /*
     The main constructor( with all parameters)
* Second constructor with all parameters except category and hasExpiration (category defaults to "misc", hasExpiration defaults to false inside constructor)
* Third constructor all the parameters except category, expiration, and stock (stock default to 0 inside the constructor)
Step 3: Method for display out put.
in StoreProduct Class create a method to display the output of class variables. (Output sequence as as order of variable shown above. all in one line)
Step 4: in Main Class Create an object of StoreProduct Class with each constructors.
pass the values and then call the display method.
Step 5: Execute your application :)
Hint: each variable must be object specific
Output:```
Eggs 3.0 Produce true 10
Paper Towels 2.0 misc false 24
Paper Towels 2.0 null false 0
```*/
    class StoreProduct01 {

        String lable;

        double price;

        String category;

        boolean hasExpiration;

        int stock;

        StoreProduct01(String lable, double price, String category, boolean hasExpiration, int stock){

            this(lable,price);

            this.category=category;

            this.hasExpiration=hasExpiration;

            this.stock=stock;

        }

        StoreProduct01(String lable, double price, int stock){

            this(lable,price);

            this.stock=stock;

            this.category="misc";

            this.hasExpiration=false;

        }

        StoreProduct01(String lable, double price){

            this.lable=lable;

            this.price=price;

            this.stock=0;

        }

        public void display(){

            System.out.print(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+stock+"\n");

        }
    }

    /*class Main {

        public static void main(String[] args) {

            StoreProduct01 obj = new StoreProduct01("Eggs", 3.0, "Produce", true, 10);

            obj.display();

            StoreProduct01 obj1 = new StoreProduct01("Paper Towels", 2.0, 24);

            obj1.display();

            StoreProduct01 obj2 = new StoreProduct01("Paper Towels", 2.0);

            obj2.display();

        }*/
}
