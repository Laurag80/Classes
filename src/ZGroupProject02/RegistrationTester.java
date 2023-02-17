package ZGroupProject02;

public class RegistrationTester {
    public static void main(String[] args) {

        Registration registration = new Registration();

        registration.setEmail("example@yahoo.com");
        registration.setUserName("username123");
        registration.setPassword("password123");

        System.out.println("Email: " + registration.email);
        System.out.println("Username: " + registration.userName);
        System.out.println("Password: " + registration.password);
    }
}
