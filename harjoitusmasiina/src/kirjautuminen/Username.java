
package kirjautuminen;

/**
 *
 * @author lmjaland
 */
public class Username {

    private String username;

    public Username() {
        this.username="";
    }

    public Username(String ktunnus) {
        this.username = ktunnus;
    }

    public void setUsername(String ktunnus) {
        this.username = ktunnus;
    }
    public Username getUser(String ktunnus) {
        Username apu = new Username();
        return apu;
    }
    public String getUserString(Username ktunnusolio) {
        return username;
    }

    @Override
    public String toString() {
        return "Käyttäjänimi: " + username + ": ";
    }
}
