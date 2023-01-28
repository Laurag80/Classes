package HomeWork08;

public class Task5 {
    public static void main(String[] args) {
       /* 5) How would you check if String is
        palindrome or not? aba=> true Abbc =>false*/

        String input="level";
        StringBuilder stb=new StringBuilder(input);
        String output=stb.reverse().toString();
        System.out.println("output = "+output);
        if (input.equals(output)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is Not Palindrome");
        }
    }
}
