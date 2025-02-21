package com.coderscampus.assignment3;

public class LoginService {

    public User[] users = new User[4];
    private final FIleService fIleService = new FIleService();


    public void loadUsers() {
        int i = 0;
        String[] lines = fIleService.loadData();

        for (String line : lines) {
            String[] userData = line.split(",");
            users[i++] = new User(userData[0], userData[1], userData[2]);
        }

    }

    public User checkPassword(String userName, String password) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}


