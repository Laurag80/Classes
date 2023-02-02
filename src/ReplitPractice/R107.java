package ReplitPractice;

public class R107 {

    public static void main(String[] args) {
        /* # How would you reverse a String using StringBuffer Class
        Given String = "Hello Friends" */

        String givenString = "Hello Friends";
        String reversedString = new StringBuffer(givenString).reverse().toString();
        System.out.println("Given String: " + givenString);
        System.out.println("Reversed String: " + reversedString);
    }
}
        /*In this code, the original string "Hello Friends"
        is passed as an argument to the constructor of the StringBuffer class.
        The reverse method of the StringBuffer class is then called to reverse the string.
        The toString method is called to convert the reversed StringBuffer object back to a String object.
        The reversed string is then printed to the console.*/