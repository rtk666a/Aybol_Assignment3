public class CheckPassword {
    FileReader fileReader = new FileReader();

    User passwordCheck(String userName , String password){
        for (User u : fileReader.users) {
            if (u.getUsername().equalsIgnoreCase(userName) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }


}
