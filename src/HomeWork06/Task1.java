package HomeWork06;

public class Task1 {
    public static void main(String[] args) {
        /*
        1) Create a 2D array(shorter way) in which first array will consist of 4 names
        and second array will contain grades. Then your program should print name of
        the students that has A and B grade */

        String[] names = {"Nina", "John", "Mary", "Mark"};
        String[] grades = {"A", "B", "C", "D"};

        for (int name = 0; name < grades.length; name++) {
            for (int i = 0; i < names.length; i++) {

                if (names[1].equals("A") || names[2].equals("B")) {
                }
            }
            System.out.println(names[1]+" "+grades[1]);
        }
    }
}