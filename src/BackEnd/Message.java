
package BackEnd;

/**
 *
 * @author Mubashir Ali
 */
public class Message {

    public static void setText(String out_Of_tokens_please_buy_some) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String userName;
    private String message;

    public Message(String userName, String message) {
        this.userName = userName;
        this.message = message;
    }

    public String printReport(int lines) {
        String re = getUserName() + ":\n";
        re+="===========================================\n";
        int temp = 0;
        for (String i : getMessage().split(" ")) {
            
            re += i + " ";
            
            temp++;
            if (temp > lines) {
                temp = 0;
                re += "\n";
            }
        }
        return re;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
