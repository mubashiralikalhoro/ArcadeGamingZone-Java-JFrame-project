package BackEnd;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Mubashir Ali
 */
public class LoginSystemFilling {

    private File dataFile = null;
    private String pathName;

    public LoginSystemFilling() {
        this.pathName = "C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\BackEnd\\LoginInfo.txt";

        try {
            dataFile = new File(pathName);
            if (dataFile.createNewFile()) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeData(String username, String password) {
        String data = CryptoGraphy.encrypt(username) + "\n" + CryptoGraphy.encrypt(password);
        FileWriter fileWriter = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathName));
            fileWriter = new FileWriter(pathName, false);
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void clear() {
        FileWriter fileWriter = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathName));
            fileWriter = new FileWriter(pathName, false);
            fileWriter.write("");
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<String> readAllData() {
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathName));
            String s = null;
            while ((s = reader.readLine()) != null) {
                list.add(CryptoGraphy.decrypt(s));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public boolean isEmpty() {
        boolean ep = true;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathName));
            String s = null;
            while ((s = reader.readLine()) != null) {
                ep = false;
            }
        } catch (Exception e) {
        }
        return ep;
    }

}
