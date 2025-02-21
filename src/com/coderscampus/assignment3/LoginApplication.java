package com.coderscampus.assignment3;

import java.util.Scanner;

public class LoginApplication {
    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        loginService.loadUsers();
        try (Scanner scanner = new Scanner(System.in)) {
            int loginAttemps = 0;

            while (loginAttemps < MAX_ATTEMPTS) {
                System.out.println("Enter your userName:");
                String userName = scanner.next();

                System.out.println("Enter your password:");
                String password = scanner.next();
                User validUser = loginService.checkPassword(userName, password);
                if (validUser != null) {
                    System.out.println("Welcome : " + validUser.getName());
                    return;
                }

                System.out.println("Invalid login, please try again");
                loginAttemps++;
            }

            System.out.println("Too many failed login attempts, you are now locked out.");
        }
    }
}
