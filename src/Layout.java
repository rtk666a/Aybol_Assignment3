import java.util.Scanner;

public class Layout {
    PasswordCheck check = new PasswordCheck();
    String userName;
    String password;

    Scanner scanner = new Scanner(System.in);

    int i = 0;

    String layout(){

        System.out.println("Enter your userName:");
        userName = scanner.next();

        System.out.println("Enter your password:");
        password = scanner.next();

        User u = check.passwordCheck(userName,password);



        if (u == null){
            while (i < 4){
                System.out.println("Invalid login, please try again");
                ++i;
                return layout();
            }

        }else return "Welcome : " + u.getName();


        return "Too many failed login attempts, you are now locked out.";
    }
}
