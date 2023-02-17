package ZGroupProject02;

public class Registration {
    String email;
    String userName;
    String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address. Please use a Yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. Username should be at least 7 characters long.");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password should be at least 7 characters long and should not contain username.");
        }
    }
}
