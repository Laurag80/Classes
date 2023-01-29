package HomeWork09;

public class Task3 {
    // 3) Create a method that will print whether given String is palindrome or not.
    public static void checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        checkPalindrome("madam");
        checkPalindrome("civic");
        checkPalindrome("level");
    }
}
