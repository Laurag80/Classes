package ReplitPractice;

import java.util.TreeSet;

public class R198 {
    /*
    Create Set to store String Objects and you want them to be stored in ascending order
    Please add the below values and see the result
    `"India"`
    `"Australia"`
    `"South Africa"`
    `"India"`
    `"America"`
    `"America"`
    Print the Set.
    `Expected Output:`
    [America, Australia, India, South Africa]
     */

    public static void main(String[] args) {

        TreeSet<String> mySet = new TreeSet<>();
        mySet.add("India");
        mySet.add("Australia");
        mySet.add("South Africa");
        mySet.add("India");
        mySet.add("America");
        mySet.add("America");

        System.out.println(mySet);
    }
}