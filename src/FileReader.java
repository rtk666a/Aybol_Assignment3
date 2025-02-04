import java.io.BufferedReader;
import java.io.File;
import java.sql.Array;
import java.util.ArrayList;

public class FileReader {
//    public User user = new User();
    User[] users = new User[10];

    FileReader(){

        try{
            File file = new File("./src/DB.txt");
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file));
            String fileString;
            int i =0;
            while ((fileString = bufferedReader.readLine()) != null){
                String[] fileUserInfo = fileString.split(",");
                users[i] = new User(fileUserInfo[0],fileUserInfo[1],fileUserInfo[2]);
                i++;
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

//    public void userPush(String userName, String password, String name) {
//        new User(userName , password , name);
//    }
}

