package HomeWork07;

public class Task2 {
    public static void main(String[] args) {

        // 2) Create a String and print it in reverse order (Sunday → yadnuS).

        String str = "Sunday";
        String reversedOrder = "";

        for(int i = str.length()-1; i>=0; i--){
            reversedOrder= reversedOrder + str.charAt(i);
        }
        System.out.print("The reversed string of the is-- "+reversedOrder);
    }
}