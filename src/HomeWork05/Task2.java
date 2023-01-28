package HomeWork05;

public class Task2 {
    public static void main(String[] args) {
        /*
        2) Create an array of names and store all names of
        your group. Then print your name from that array.
        (use 2 different ways of creating an array).*/

        String[]name={"Garry","Anna","Laura","Nelson","Kevin","Ben","Shah","Inessa", "Dimitry","Andrei","Elif",};
        System.out.println(name[2]);

        String[]names=new String[10];
        names[0]="Garry";
        names[1]="Anna";
        names[2]="Laura";
        names[3]="Nelson";
        names[4]="Kevin";
        names[5]="Ben";
        names[6]="Shah";
        names[7]="Inessa";
        names[8]="Demitry";
        names[9]="Elif";
        System.out.println(names[2]);

    }
}
