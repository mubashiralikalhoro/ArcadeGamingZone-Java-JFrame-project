
package BackEnd;

/**
 *
 * @author Mubashir Ali
 */
public class CryptoGraphy {
    
    public static String encrypt(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            int temp=s.charAt(i);
            temp+=i+(i*2)+1;
            char temp2= (char)temp;
            r+=temp2;
        }
        return r;
    }
    
      public static String decrypt(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            int temp=s.charAt(i);
            temp-=i+(i*2)+1;
            char temp2= (char)temp;
            r+=temp2;
        }
        return r;
    }
      
}
