package HomeWork08;

public class Task1 {
    public static void main(String[] args) {
       /* 1) Create a String that will hold a sentence.
        Write a program to get a new String without any spaces.*/

        String str="I love Batch15 and group16";
        String newStr=str.replaceAll(" ", "");
        System.out.println(newStr);
    }
}
