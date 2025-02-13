package com.coderscampus.assignment3;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LoginApplication {
    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {

        LoginService loginService = new LoginService();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        User user = null;

        while (i < MAX_ATTEMPTS) {

            System.out.println("Enter your userName:");
            String userName = scanner.next();

            System.out.println("Enter your password:");
            String password = scanner.next();

            if ((user = loginService.checkPassword(userName, password)) != null) {
                System.out.println("Welcome : " + user.getName());
                break;
            } else System.out.println("Invalid login, please try again");
            i++;

            if (i == MAX_ATTEMPTS - 1) {
                System.out.println("Too many failed login attempts, you are now locked out.");
            }
        }

        scanner.close();

    }
}
