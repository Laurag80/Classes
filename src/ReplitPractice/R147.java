package ReplitPractice;

public class R147 {
    /*
    Create instance variables as below.
    - model
    - price,
    - quantity
    Create a constructor that will initialize instance variables.
    Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.
    run the application in Main Class
    **Expected Output:**
    Toyota 2019 Stock Value 2500000.0
    BMW 2019 Stock Value 652980.0
```Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
 */

    class carObjects{
        String model;
        double price;
        int quantity;
        carObjects(String model, double price, int quantity){
            this.model=model;
            this.price=price;
            this.quantity=quantity;
        }
        void carStockCalue(){
            double stock_Value=price*quantity;
            System.out.println(model+" 2019 Stock Value "+stock_Value);
        }
    }
   /* class Main {
        public static void main(String[] args){
            carObjects toyota=new carObjects("Toyota",2500,1000);
            carObjects bmw=new carObjects("BMW",6529.8,100);
            toyota.carStockCalue();
            bmw.carStockCalue();
        }*/
}
