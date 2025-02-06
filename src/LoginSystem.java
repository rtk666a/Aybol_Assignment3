import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class LoginSystem {
    private static final int MAX_ATTEMPTS = 4;

    private User checkPassword(String userName, String password) {
        FIleService userData = new FIleService();
        for (User u : userData.users) {
            if (u.getUsername().equalsIgnoreCase(userName) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }


    public String layout() {

        String userName;
        String password;
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < MAX_ATTEMPTS) {
            System.out.println("Enter your userName:");
            userName = scanner.next();

            System.out.println("Enter your password:");
            password = scanner.next();

            User u = checkPassword(userName, password);


            if (u == null) {

                System.out.println("Invalid login, please try again");
                i++;
            } else return "Welcome : " + u.getName();

        }


        return "Too many failed login attempts, you are now locked out.";
    }
}

