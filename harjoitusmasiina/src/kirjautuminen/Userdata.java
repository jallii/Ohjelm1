package kirjautuminen;

/**
 * Yksittäisen käyttäjän talletetut tiedot
 *
 * @author lmjaland
 */
public class Userdata {

    private String passwd;
    private String salt;
    private boolean role;
    private int pisteet;

    /**
     *
     * Luo tyhjän käyttäjäolion
     */
    public Userdata() {
        this.passwd = "";
        this.salt = "";
        this.role = false;
        this.pisteet = 0;
    }

    public Userdata(String passwd, String salt, boolean role, int pisteet) {
        this.passwd = passwd;
        this.salt = salt;
        this.role = role;
        this.pisteet = pisteet;
    }

    /**
     * Palauttaa käyttäjän salasanan
     *
     * @return palauttaa käyttäjän talletetun salasanan hash representaation
     * stringinä
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Asettaa käyttäjän salasanan. Metodi kutsuu ensin Enkrypt luokkaa joka
     * hoitaa salasanan muuttamisen salatuksei. Encrypt luokka luo ja tallettaa
     * suolan ja palauttaasalasanan kryptattuna. setPasswd metodi tallettaa
     * salasanan kryptattuna
     *
     * @param passwdehdotus on käyttäjän antama salaamaton salasana
     */
    public void setPasswd(String passwdehdotus) {
        Encrypt e = new Encrypt();
        this.passwd = e.encrypt(passwdehdotus);
    }

    /**
     * Palauttaa käyttäjän salauksessa käytetyn suolan
     *
     * @return
     */
    public String getSalt() {
        return salt;
    }

    /**
     * Salauksessa käytetty käyttäjäkohtainen suola
     *
     *@param suola on string hash joka on satunnaisesti generoitu
     */
    public void setSalt(String suola) {
        
        this.salt = suola;
    }
    public String generoiSuola(){
        double apu= ((double)5371 * Math.random());
        String apu2= String.valueOf(apu);
        
        return apu2;
                
    }
    /**
     * Palauttaa arvon tosi jos käyttäjä on ope
     *
     * @return
     */
    public boolean isRole() {
        return role;
    }

    /**
     * Käyttäjän rooli. Asettaminen tai muuttaminen Tavallinen opiskelija on
     * false Opettaja on true
     *
     * @param role
     */
    public void setRole(boolean role) {
        this.role = role;
    }

    /**
     * Käyttäjän saamien pisteiden tallennus
     *
     * @param pisteet
     */
    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    /**
     * Käyttäjän harjoituspisteitten haku
     *
     * @return
     */
    public int getPisteet() {
        return pisteet;
    }

    /**
     * Tulostaa käyttäjäntiedot riveittäin
     *
     * @return Tulostaa käyttäjäntiedot riveittäin
     */
    @Override
    public String toString() {
        String apu;
        apu = "Salasana: " + passwd + "Suola: " + salt 
                + "Onko opettaja: " + role
                + "Pisteet: " + pisteet + "\n";
        return apu;
    }
}
