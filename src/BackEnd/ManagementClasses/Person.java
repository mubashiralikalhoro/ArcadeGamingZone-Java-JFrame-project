
package BackEnd.ManagementClasses;
public abstract class Person {
    private String username;
    private String email;

    public Person(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "username=" + username + ", email=" + email + '}';
    }
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(){}
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
            
}
