package HomeWork08;

public class Task2 {
    public static void main(String[] args) {
       /* 2) Create a String that should be combination of letters,
        numbers and special characters. Find out how many Alphanumeric(abd AZ 284)
        characters are there in the String.*/

        String str = "hd$BO#3d84@$lsPQ!GEeDkqp";

            System.out.println(str.replaceAll("[^a-zA-z)-9]", ""));
            String alpha=str.replaceAll("[^A-Za-z0-9]","");
            
            int count=0;
            for (int i = 0; i < alpha.length(); i++) {
                count++;
            }
        System.out.println("Alpha count is "+ count+" ");
        }
    }
