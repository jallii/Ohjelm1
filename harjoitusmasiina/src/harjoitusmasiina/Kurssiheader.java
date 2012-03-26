/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitusmasiina;

/**
 *
 * @author lmjaland
 */
public class Kurssiheader {

    private String kurssinimi;
    private String kurssintavoite;
    private String opettajanemail;
    private int maxpisteet;
    private int suoritusraja;
    private int virheenarvo;

    public Kurssiheader(String kurssinimi, String kurssintavoite,
            String opettajanemail, int maxpisteet,
            int suoritusraja, int virheenarvo) {
        this.kurssinimi = kurssinimi;
        this.kurssintavoite = kurssintavoite;
        this.opettajanemail = opettajanemail;
        this.maxpisteet = maxpisteet;
        this.suoritusraja = suoritusraja;
        this.virheenarvo = virheenarvo;
    }
}
