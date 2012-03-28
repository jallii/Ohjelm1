/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kirjautuminen;

/**
 *
 * @author lmjaland
 */
public class Username {

    private String username = "";

    public Username(String name) {
        this.username = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Käyttäjänimi: " + username + ": ";
    }
}
