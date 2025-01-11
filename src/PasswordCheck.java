public class PasswordCheck {
    FileReader fileReader = new FileReader();

    User passwordCheck(String userName , String password){
        for (User u : fileReader.users) {
            if (u.getUserName().equals(userName) && u.getPassword().equals(password)){

                return u;
            }
        }
        return null;
    }


}
