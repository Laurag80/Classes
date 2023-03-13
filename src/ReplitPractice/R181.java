package ReplitPractice;

public class R181 {
    /*
    Create Class Account
    Create the below variables:
    - acc_no;
    - name;
    - email;
    - double amount;
    Create the getter/setter methods for each variable.
    In Main Class and the main method.
    Using setter methods assign the values as:
    acc_no = 7560504000
    name = Sumair
    email = sumair@syntax.com
    amount = 50000.0
    Using getter methods print the values as below output.
    **Expected Output:**
    7560504000 Sumair sumair@syntax.com 50000.0
     */
    class Main {
        public static void main(String[] args){

        /* Account account=new
                  Account("7560504000","Sumair","sumair@syntax.com",50000.0);
          System.out.print(account.getAcc()+" "+account.getName()+" "+account.getEmail()+" "+account.getAmount());*/
        }
    }
    class Account {
        String acc_no;
        String name;
        String email;
        double amount;

        Account(String acc_no, String name, String email, double amount) {
            setAcc(acc_no);
            setName(name);
            setEmail(email);
            setAmount(amount);
        }

        public void setAcc(String acc_no) {
            this.acc_no = acc_no;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }

        public String getAcc() {
            return this.acc_no;
        }

        public String getName() {
            return this.name;
        }

        public String getEmail() {
            return this.email;
        }

        public double getAmount() {
            return this.amount;
        }
    }
}
