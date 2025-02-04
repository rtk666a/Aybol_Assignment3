import java.util.Scanner;

public class LoginSystem {
    CheckPassword check = new CheckPassword();// I lave this hera because easier access for new method
    private static final int MAX_ATTEMPTS = 4 ;


    String layout() {

        String userName;
        String password;
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < MAX_ATTEMPTS) {
            System.out.println("Enter your userName:");
            userName = scanner.next();

            System.out.println("Enter your password:");
            password = scanner.next();

            User u = check.passwordCheck(userName, password);


            if (u == null) {

                System.out.println("Invalid login, please try again");
                i++;
            }else return "Welcome : " + u.getName();

        }


        return "Too many failed login attempts, you are now locked out.";
    }
}

