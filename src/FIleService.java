import java.io.BufferedReader;
import java.io.File;

public class FIleService {
    User[] users = new User[4];
    FIleService(){
        fileReader();
    }
    private void fileReader() {
        //TODO //User[] users = new User[4]; // if constructor not looking good we can remove it and use this
        try {
            File file = new File("./src/DB.txt");
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file));
            String fileString;
            int i = 0;
            while ((fileString = bufferedReader.readLine()) != null) {
                String[] fileUserInfo = fileString.split(",");
                users[i] = new User(fileUserInfo[0], fileUserInfo[1], fileUserInfo[2]);
                i++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
