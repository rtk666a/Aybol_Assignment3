import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;

public class FileReader {
//    public User user = new User();
    ArrayList<User> users  = new ArrayList<>();

    FileReader(){
        try{
            File file = new File("D:\\Assiggments\\Aybol_Assignment3\\src\\DB.txt");
            BufferedReader inSteam = new BufferedReader(new java.io.FileReader(file));
            String fileString;

            while ((fileString = inSteam.readLine()) != null){
                String[] fileUserInfo = fileString.split(",");
                users.add(new User(fileUserInfo[0],fileUserInfo[1],fileUserInfo[2]));
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

//    public void userPush(String userName, String password, String name) {
//        new User(userName , password , name);
//    }
}

