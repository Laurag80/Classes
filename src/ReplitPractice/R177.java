package ReplitPractice;

public class R177 {
    /*
    - First Methods: return type void, method name display, parameters -> result (choose the datatype as required)
    Step 3: Create Interface as Functions
    Step 4: Inherit to Outputs
    Step 5: Create 4 methods as below.
    - return type double, method label adding, parameters -> firstNumber , SecondNumber (choose the datatype as required)
    - return type double, method label subtracting, parameters -> firstNumber , SecondNumber (choose the datatype as required)
    - return type double, method label multiply, parameters -> firstNumber , SecondNumber (choose the datatype as required)
    - return type double, method label dividing, parameters -> firstNumber , SecondNumber (choose the datatype as required)
    Step 6: In Main Class inherit to Functions Interface.
    Step 7: Provide implementation logic to  unimplemented methods.
    Step 8: complete the body of all the methods as below
    - Display method to print the result parameter as shown below in Outputs.
    - Adding, Subtracting, Multiply, dividing each will have the logics to do simple mathematic operation and return the result.
    Step 9: Create the main method inside the main method declare below variables.
    - double firstNumber = 100.00;
    - double secondNumber = 20.00;
    Step 10: Instantiate the object of Main class and call the methods one by one to print the result and sequence of shown below in output.
    **Expected Output:**
    Result is ::: 120.0
    Result is ::: 80.0
    Result is ::: 2000.0
    Result is ::: 5.0
     */

   /* interface Outputs {
        void display(double result);
    }

    interface Functions {
        double adding(double firstNumber, double secondNumber);
        double subtracting(double firstNumber, double secondNumber);
        double multiply(double firstNumber, double secondNumber);
        double dividing(double firstNumber, double secondNumber);
    }

    class Main implements Functions {
        public void display(double result) {
            System.out.println("Result is ::: " + result);
        }

        public double adding(double firstNumber, double secondNumber) {
            return firstNumber + secondNumber;
        }

        public double subtracting(double firstNumber, double secondNumber) {
            return firstNumber - secondNumber;
        }

        public double multiply(double firstNumber, double secondNumber) {
            return firstNumber * secondNumber;
        }

        public double dividing(double firstNumber, double secondNumber) {
            return firstNumber / secondNumber;
        }

        public static void main(String[] args) {
            double firstNumber = 100.00;
            double secondNumber = 20.00;

            Main obj = new Main();

            double result = obj.adding(firstNumber, secondNumber);
            obj.display(result);

            result = obj.subtracting(firstNumber, secondNumber);
            obj.display(result);

            result = obj.multiply(firstNumber, secondNumber);
            obj.display(result);

            result = obj.dividing(firstNumber, secondNumber);
            obj.display(result);
        }
    }*/
}
