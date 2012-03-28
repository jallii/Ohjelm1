package kirjautuminen;

import java.security.MessageDigest;

/**
 * Yksittäisen käyttäjän talletetut tiedot
 *
 * @author lmjaland
 */
public class Userdata {

    private String salt;
    private String passwd;
    private boolean role;
    private int points;

    /**
     * Luo tyhjän käyttäjäolion suola luodaan aina suoraan käyttäjäolion luonnin
     * yhteydessä, niin ei tarvita siihen erillistä logiikkaa.
     */
    public Userdata() {
        this.salt = generoiSuola();
        this.passwd = kryptaa("salainen");
        this.role = false;
        this.points = 0;
    }

    /**
     * Luo userdataolion
     *
     * @param passwd String muotoinen salasana annetaan parametrina
     */
    public Userdata(String passwd) {
        this.salt = generoiSuola();
        this.passwd = kryptaa(passwd);
        this.role = false;
        this.points = 0;
    }

    public Userdata(String passwd, boolean role) {

        this.salt = generoiSuola();
        this.passwd = kryptaa(passwd);
        this.role = role;
        this.points = 0;
    }

    /**
     * Palauttaa käyttäjän salauksessa käytetyn suolan
     *
     * @return käyttäjäkohtainen talletettu suola
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Palauta suola Luo käyttäjäkohtaisen satunnaisesti generoidun suolan
     * random funktiolla joka kerrotaan alkuluvulla 239 jotta saadaan tarpeeksi
     * pituutta. Double arvo muunnetaan Stringiksi
     *
     * @return palauttaa suolan
     */
    public static String generoiSuola() {
        double apu = ((double) 239 * Math.random());
        String apu2 = String.valueOf(apu);
        return apu2;
    }

    /**
     * Kryptaa annetun salasanan palauttaa kryptatun stringin //
     *
     * @param passwd annetaan kryptaamaton salasana string
     * @param salt annetaan kyseisen käyttäjän suola string
     * @return palauttaa kryptatun salasana stringin
     */
    public String encrypt(String passwd, String salt) {
        String plainPw, hashPw;
        plainPw = passwd + salt;
        byte[] clearBytet, hashBytet;
        try {
            MessageDigest MD = MessageDigest.getInstance("MD5");
            clearBytet = plainPw.getBytes();
            MD.update(clearBytet);
            hashBytet = MD.digest(clearBytet);
            hashPw = new String(hashBytet);
            return hashPw;
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Kryptaa annetun salasanan palauttaa kryptatun stringin //
     *
     * @param passwd annetaan kryptaamaton salasana string
     *
     * @return palauttaa kryptatun salasana stringin
     */
    public static String kryptaa(String passwd) {
        String hashPw;
        byte[] clearBytet, hashBytet;
        try {
            MessageDigest MD = MessageDigest.getInstance("MD5");
            clearBytet = passwd.getBytes();
            MD.update(clearBytet);
            hashBytet = MD.digest(clearBytet);
            hashPw = new String(hashBytet);
            return hashPw;
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * Palauttaa käyttäjän kryptatun salasanahashin
     *
     * @return palauttaa käyttäjän talletetun salasanan hash representaation
     * stringinä
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Vertaa salasanoja: jos parametrina annettu ehdokas on sama kuin listassa
     * oleva niin palauttaa arvon true
     *
     * @param ehdokas
     * @return true jos salasanat matchää. muuten false;
     */
    public boolean matchPW(String ehdokas) {
        String listassa = getPasswd();
        ehdokas = ehdokas + salt;
        String kryptattu = kryptaa(ehdokas);
        if (kryptattu.equals(listassa)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Asettaa käyttäjän salasanan. Metodi kutsuu ensin Enkrypt luokkaa joka
     * hoitaa salasanan muuttamisen salatuksei. Encrypt luokka luo ja tallettaa
     * suolan ja palauttaasalasanan kryptattuna. setPasswd metodi tallettaa
     * salasanan kryptattuna
     *
     * @param salasana on käyttäjän antama salaamaton salasana joka kryptataan
     * ja talletetaan kryptattuna
     */
    public void setPasswd(String plain) {
        String kryptattu = kryptaa(plain);
        this.passwd = kryptattu;
    }

    /**
     * Onko kyse opettajasta
     *
     * @return arvon tosi, jos rooli on ope/admin
     */
    public boolean onkoRoolinaOpe() {
        return role;
    }

    /**
     * Asettaa käyttäjän roolin. Rooli annetaan boolean arvona
     *
     * @param role Opiskelija on false ja opettaja/admin on true
     */
    public void setRole(boolean role) {
        this.role = role;
    }

    /**
     * Käyttäjän harjoituspisteitten haku
     *
     * @return suoritetus pisteet
     */
    public int getPisteet() {
        return points;
    }

    /**
     * Käyttäjän saamien pisteiden arvon asettaminen
     *
     * @param pisteet suoritukset tallessa
     */
    public void setPisteet(int pisteet) {
        this.points = pisteet;
    }

    /**
     * Tulostaa käyttäjäntiedot riveittäin
     *
     * @return käyttäjäntiedot riveittäin otsikoituna lisää rivinvaihdon loppuun
     */
    @Override
    public String toString() {
        String apu;
        apu = "Salasana: " + passwd + "Suola: " + salt
                + "Onko opettaja: " + role
                + "Pisteet: " + points + "\n";
        return apu;
    }
}
