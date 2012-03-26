package kirjautuminen;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Käyttäjätietokanta
 * @author lmjaland
 */
public class Users implements Serializable {

    private String username;
    private User userdata;
    private HashMap<String, User> users = new HashMap<String, User>();

    public Users(String username, User userdata) {
        this.username = username;
        this.userdata = userdata;
    }

    public String getUsername() {
        return username;
    }

    public User getUserdata() {
        return userdata;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserdata(User userdata) {
        this.userdata = userdata;
    }

    public HashMap<String, User> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, User> users) {
        this.users = users;
    }

    
}
