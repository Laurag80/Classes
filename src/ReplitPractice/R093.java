package ReplitPractice;

public class R093 {
    public static void main(String[] args) {
        /*
        Create a String given="I love Java classes at Syntax"
        - Retrieve 2 Strings using substring method from given String and print them
            **Expected Output:**
            classes at Syntax
                ```
            I love Java         */

        String given="I love Java classes at Syntax";
        String a=given.substring(11);
        System.out.println(a);
        String b=given.substring(0,11);
        System.out.println(b);
    }
}
