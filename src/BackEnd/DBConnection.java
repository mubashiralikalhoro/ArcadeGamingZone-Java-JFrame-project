package BackEnd;

import BackEnd.ManagementClasses.CEO;
import BackEnd.ManagementClasses.Developer;
import BackEnd.ManagementClasses.Manager;
import BackEnd.ManagementClasses.Player;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mubashir Ali
 */
public class DBConnection {

    private CEO ceoData = new CEO();
    private Developer devData = new Developer();
    private Player playerData = new Player();
    private Manager manData = new Manager();
    private Connection connection = null;
    private Statement stmt = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public DBConnection() {
        getConnection("H:\\jdbc.accdb");
    }

    private Connection getConnection(String location) {

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + location);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    // ==================== Ceo database
    public boolean ceoLogIn(String username, String password) {

        String sql = "select * from ceo where username='" + username + "'and password='" + CryptoGraphy.encrypt(password) + "'";
        boolean b = false;
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                ceoData.setCeoName(rs.getString("name"));
                ceoData.setAssignedWork(rs.getString("assignedwork"));
                ceoData.setContact(rs.getString("contact"));
                ceoData.setEmail(rs.getString("contact"));
                ceoData.setEmpID(Integer.parseInt(rs.getString("empid")));
                ceoData.setSalary(Integer.parseInt(rs.getString("salary")));
                ceoData.setUsername(rs.getString("username"));
                ceoData.setWorkingHours(Integer.parseInt(rs.getString("WorkingHours")));
                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Cannot Log In");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;
    }

    public CEO getCeoData() {
        return ceoData;
    }

    // ===================== manager database
    public boolean manLogIn(String username, String password) {
        String sql = "select * from manager where username='" + username + "'and password='" + CryptoGraphy.encrypt(password)+ "'";
        boolean b = false;
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                manData.setManName(rs.getString("name"));
                manData.setAssignedWork(rs.getString("assignedwork"));
                manData.setContact(rs.getString("contact"));
                manData.setEmail(rs.getString("contact"));
                manData.setEmpID(Integer.parseInt(rs.getString("empid")));
                manData.setSalary(Integer.parseInt(rs.getString("salary")));
                manData.setUsername(rs.getString("username"));
                manData.setWorkingHours(Integer.parseInt(rs.getString("WorkingHours")));
                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Cannot Log In");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;
    }

    public Manager getManData() {
        return manData;
    }

    // ====================== developer database
    public boolean devLogIn(String username, String password) {
        String sql = "select * from developer where username='" + username + "'and password='" + CryptoGraphy.encrypt(password) + "'";
        boolean b = false;
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                devData.setDevName(rs.getString("name"));
                devData.setAssignedWork(rs.getString("assignedwork"));
                devData.setContact(rs.getString("contact"));
                devData.setEmail(rs.getString("contact"));
                devData.setEmpID(Integer.parseInt(rs.getString("empid")));
                devData.setSalary(Integer.parseInt(rs.getString("salary")));
                devData.setUsername(rs.getString("username"));
                devData.setWorkingHours(Integer.parseInt(rs.getString("WorkingHours")));
                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Cannot Log In");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;
    }

    public Developer getDevData() {
        return devData;
    }

    // ====================== player database
    public boolean playerLogin(String email, String password) {
        String sql = "select * from PlayerDetails where email='" + email + "'and password='" + CryptoGraphy.encrypt(password) + "'";
        boolean b;
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                playerData.setUsername(rs.getString("username"));
                playerData.setInGameName(rs.getString("ingamename"));
                playerData.setLevel(Integer.parseInt(rs.getString("level")));
                playerData.setTotalPurchase(Integer.parseInt(rs.getString("totalpurchase")));
                playerData.setNoOfTokens(Integer.parseInt(rs.getString("nooftokens")));
                playerData.setEmail(rs.getString("email"));
                playerData.setWins(Integer.parseInt(rs.getString("wins")));
                playerData.setPlayerID(rs.getString("playerid"));
                playerData.setScore(Integer.parseInt(rs.getString("score")));
                playerData.setLosses(Integer.parseInt(rs.getString("losses")));
                playerData.setPassword(CryptoGraphy.decrypt(rs.getString("Password")));
                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Cannot Log In");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;

    }

    public void addUser(String userName, String password, String email, String inGameName) {
        String playerId = "" + genratePlayerID();

        String sql = "insert into PlayerDetails(username,password,email,nooftokens,totalpurchase,wins,playerid,ingamename,score,level,losses) values('" + userName + "','" + CryptoGraphy.encrypt(password) + "','" + email + "','0','0','0','" + playerId + "','" + inGameName + "','0','1','0')";
        try {
            stmt = connection.createStatement();

            int res = stmt.executeUpdate(sql);
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Signed Up Successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Error!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error is here so we i have to fix it");
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public ArrayList<Player> getAllPlayers() {
        ArrayList<Player> rps = new ArrayList<>();

        String sql = "select * from playerDetails";

        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Player player = new Player();
                player.setUsername(rs.getString("username"));
                player.setInGameName(rs.getString("ingamename"));
                player.setLevel(Integer.parseInt(rs.getString("level")));
                player.setTotalPurchase(Integer.parseInt(rs.getString("totalpurchase")));
                player.setNoOfTokens(Integer.parseInt(rs.getString("nooftokens")));
                player.setEmail(rs.getString("email"));
                player.setWins(Integer.parseInt(rs.getString("wins")));
                player.setPlayerID(rs.getString("playerid"));
                player.setScore(Integer.parseInt(rs.getString("score")));
                player.setLosses(Integer.parseInt(rs.getString("losses")));
                player.setPassword("**************");
                rps.add(player);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return rps;
    }

    public void UpdateplayerData(Player player) {
        String sql = "update PlayerDetails set username='" + player.getUsername() + "',password='" + CryptoGraphy.encrypt(player.getPassword()) + "',ingamename='" + player.getInGameName() + "',level='" + player.getLevel() + "',totalpurchase='" + player.getTotalPurchase()
                + "',nooftokens='" + player.getNoOfTokens() + "',email='" + player.getEmail() + "',wins='" + player.getWins() + "',score='" + player.getScore() + "',losses='" + player.getLosses() + "' where playerid='" + player.getPlayerID() + "'";

        try {
            pst = connection.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public boolean checkEmail(String email) {
        String sql = "select * from PlayerDetails where email='" + email + "'";
        boolean b;
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                b = false;
            } else {
                b = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = true;
        }
        return b;
    }

    private boolean checkIfRare(int id) {
        String sql = "select * from PlayerDetails where playerID='" + id + "'";

        boolean b;
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                b = false;
            } else {
                b = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = true;
        }
        return b;
    }

    private int genratePlayerID() {
        Random random = new Random();
        int randomID = 5210000;
        randomID += random.nextInt(10000);
        if (!checkIfRare(randomID)) {
            return genratePlayerID();
        }
        return randomID;
    }

    public boolean checkInGameName(String name) {
        String sql = "select * from PlayerDetails where username='" + name + "'";
        boolean b;
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Please use another InGame Name. InGame name should be unique");
                b = false;
            } else {
                b = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            b = false;
        }
        return b;
    }

    public Player getPlayerData() {
        return playerData;
    }

    // =============== reports database
    public ArrayList<Report> getAllReports() {
        ArrayList<Report> rps = new ArrayList<>();

        String sql = "select * from Reports";

        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                rps.add(new Report(rs.getString("username"), rs.getString("report")));
            }
        } catch (Exception ex) {

        }

        return rps;
    }

    public void addReport(String userName, String report) {

        String sql = "insert into Reports(username,report) values('" + userName + "','" + report + "')";
        try {
            stmt = connection.createStatement();

            int res = stmt.executeUpdate(sql);
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Report Added successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Error!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    // =================== messages database
    public ArrayList<Message> getAllMessage() {
        ArrayList<Message> rps = new ArrayList<>();

        String sql = "select * from messages";

        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                rps.add(new Message(rs.getString("username"), rs.getString("message")));
            }
        } catch (Exception ex) {

        }

        return rps;
    }

    public void addMessage(String userName, String message) {

        String sql = "insert into messages(username,message) values('" + userName + "','" + message + "')";
        try {
            stmt = connection.createStatement();

            int res = stmt.executeUpdate(sql);
            if (res > 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Error!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    // ========================= amounts database
    public long getAmount() {
        String sql = "select * from AmountGenrated where Currency='Dollars'";
        long amount = 0;
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String temp = rs.getString("Amount");
                amount = Long.parseLong(temp);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return amount;
    }

    public void addAmount(int amount) {

        long totalAmount = getAmount() + amount;
        String sql = "update AmountGenrated set amount='" + totalAmount + "' where Currency='Dollars'";

        try {
            pst = connection.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    
      public void takeAmount(int amount) {

        long totalAmount = getAmount() - amount;
        String sql = "update AmountGenrated set amount='" + totalAmount + "' where Currency='Dollars'";

        try {
            pst = connection.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

}
