package com.coderscampus.assignment3;

public class LoginService {

    public User[] users = new User[4];
    private FIleService fIleService = new FIleService();

//    public LoginService() {
//        int i = 0;
//        for (String line : fIleService.loadData()) {
//            String[] userData = line.split(",");
//            users[i++] = new User(userData[0],userData[1],userData[2]);
//        }
//    }


    public void lodData(){
        int i = 0;
        for (String line : fIleService.loadData()) {
            String[] userData = line.split(",");
            users[i++] = new User(userData[0],userData[1],userData[2]);
        }
    }

    public User checkPassword(String userName, String password) {
        lodData();
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(userName) && user.getPassword().equals(password)) {
                return user;
//                return "Welcome : " + user.getName();
            }
            else {
                return null;
//                return "Invalid login, please try again";
            }
        }
        return null;
    }


}


