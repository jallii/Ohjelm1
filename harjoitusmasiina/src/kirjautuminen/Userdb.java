package kirjautuminen;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Käyttäjätietokanta avaimena username joka datan sisällä datana sen voisi
 * sieltä ottaa tähä tasolle, mutta tulisiko yksinkertaisempi?
 *
 * @author lmjaland
 */
public class Userdb implements Serializable {
//    private String username = "";

    private HashMap<Username, Userdata> users;

    public Userdb() {
        users = new HashMap<Username, Userdata>();
    }

    public Userdb(HashMap<Username, Userdata> users) {
        this.users = users;
    }

    public HashMap<Username, Userdata> getUsers() {
        return users;
    }

    public void setUsers(HashMap<Username, Userdata> users) {
        this.users = users;
    }

    public void addUser(Username name, Userdata user) {
        users.put(name, user);
    }

    public void deleteUser(Username name) {
        users.remove(name);
    }

    public int kayttajienLukumaara() {
        return users.size();
    }

    /**
     *
     * @param user
     * @return palauttaa arvon tosi jos käyttäjä on opettaja
     */
    public boolean onkoOpe(Username name) {
        
        Userdata apu;
         apu=users.get(name);
        return users.isRole(users.get(name));
    }

    @Override
    public String toString() {
        return users.values().toArray().toString();
    }

    public boolean tarkistaSalasana(String ktunnus, String pwehdotus) {
        Userdata user = users.get(ktunnus);
        String pwlistassa;
        pwlistassa = user.getPasswd();
        if (pwehdotus.equals(pwlistassa)) {
            return true;
        } else {
            return false;
        }
    }
}
