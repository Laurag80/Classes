package ZGroupProject01;

public class Task {
    public static void main(String[] args) {


        String [] countries={"Armenia","Italy","France","Germany",};
        String [] capital={"Yerevan","Rome","Paris","Berlin"};

        for (int i = 0; i < capital.length; i++) {
            System.out.println("The capital of "+countries[i]+" is "+capital[i]);
        }
    }
}
