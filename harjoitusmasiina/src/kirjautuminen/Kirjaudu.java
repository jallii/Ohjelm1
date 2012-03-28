package kirjautuminen;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * Tämä luokka hoitaa käyttäjien kirjautumisen logiikan Ohjelma kysyy
 * käyttäjätunnuksen ja salasanan. Jos tunnus +salasana yhdistelmä on oikein
 * päästään eteenpäin
 *
 * Tiedot luetaan yhtenä users oliona users.bin tiedostosta
 *
 * Uusien käyttäjien luonti toistaiseksi toteuttamatta. Sen voi tehdä vain
 * opettajan roolissa oleva käyttäjä. Ohjelma tallettaa käyttäjän tietoihin
 * tulevat talletettavat muutokset (parhaat pisteet yms) hoidetaan
 * harjoituskertojen jälkeen ja kun koe on tehty
 *
 * @author lmjaland
 */
public class Kirjaudu {

    String klogin = "Anna käyttäjätunnuksesi";
    String kpasswd = "Anna salasanasi";
    String ktunnus, passwd;
    boolean admin = false;
    Userdb users = new Userdb();
    String filenimi = "users.bin";

    /**
     * Kirjoita käyttäjätiedot fileen
     */
    public boolean talletaKayttajat(File filenimi, Userdb kayttajat)
            throws FileNotFoundException, IOException {
        try {
            FileOutputStream fos = new FileOutputStream(filenimi);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(kayttajat);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    /**
     * Hae käyttäjätiedot filestä
     */
    public boolean haeKayttajat(File filenimi, Userdb kayttajat)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            FileInputStream fis = new FileInputStream(filenimi);
            ObjectInputStream ois = new ObjectInputStream(fis);
            kayttajat = (Userdb) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public String kysy(String kysymys) {
        return JOptionPane.showInputDialog(kysymys);
    }

//    public boolean OKlogin(String ktunnus, String passwd) {
//
//        boolean onUser = users(ktunnus).
//                getUsers().containsKey(ktunnus);
//
//        if (onUser) {
//            kayttaja = kayttajat(ktunnus);
//        }
//
//        kayttaja = kayttajat.getUsers(ktunnus);
//
//        if (kayttajat.getUsers().containsKey(ktunnus)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void kirjaudu(String ktunnus, String salasana) {
//        ktunnus = kysy(klogin);
//        
//        if (users.getUsername().equalsIgnoreCase(klogin)) {
//            kpasswd = kysy(kpasswd);
//        }
//    }
//
//    private Userdata kayttajat(String ktunnus) {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
}
