
import BackEnd.DBConnection;
import BackEnd.LoginSystemFilling;
import GUI.MainPages.HomeScreen;
import GUI.MainPages.HomeScreenCEO;
import GUI.MainPages.HomeScreenDeveloper;
import GUI.MainPages.HomeScreenManager;
import GUI.MainPages.LoginForm;

/**
 *
 * @author Mubashir Ali
 */
public class Main {

    public static void main(String[] args) {
        LoginSystemFilling lsf = new LoginSystemFilling();
        if (lsf.isEmpty()) {
            new LoginForm().setVisible(true);
        } else {
            String username=lsf.readAllData().get(0);
            String password=lsf.readAllData().get(1);
             DBConnection dBC = new DBConnection();
            // checking if its the ceo
             if(username.contains("@ceo")&&dBC.ceoLogIn(username, password)){
                new HomeScreenCEO(dBC.getCeoData()).setVisible(true);
            }
            // checking if its a developer.
             else if(username.contains("@dev")&&dBC.devLogIn(username, password)){
                new HomeScreenDeveloper(dBC.getDevData()).setVisible(true);
            }
            //checking if its a manager.
            else if(username.contains("@man")&&dBC.manLogIn(username, password)){
                new HomeScreenManager(dBC.getManData()).setVisible(true);
            }
            // checking if its player
            else if (dBC.playerLogin(username, password)) {
                new HomeScreen(dBC.getPlayerData()).setVisible(true);
            }
        }
    }

}
