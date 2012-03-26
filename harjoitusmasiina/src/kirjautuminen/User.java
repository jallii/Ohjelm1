package kirjautuminen;

import java.io.Serializable;

/**
 * Käyttäjän tietorakenne
 *
 * @author lmjaland
 */
public class User implements Serializable {

    private String passwd = "";
    private String salt = "?q";
    private String role = "oppilas";

    public String getPasswd() {
        return passwd;
    }

    public String getSalt() {
        return salt;
    }

    public String getRole() {
        return role;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
