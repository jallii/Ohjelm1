/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitusmasiina;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Kurssidata olion joutuu luomaan ulkopuolella
 *
 * @author lmjaland
 */
public class Kurssidata implements Externalizable {

    private Kurssiheader header;
    private Kurssibody body;

    public Kurssidata(Kurssiheader header, Kurssibody body) {
        this.header = header;
        this.body = body;
    }

    public void setHeader(Kurssiheader header) {
        this.header = header;
    }

    public Kurssiheader getHeader() {
        return header;
    }

    public void setBody(Kurssibody body) {
        this.body = body;
    }

    public Kurssibody getBody() {
        return body;
    }

    /**
     * Tallenna kurssidata tiedostoon
     *
     */
    @Override
    public void writeExternal(ObjectOutput oo) throws IOException {
        /*
         * periaatteessa mitä tahansa, kunhan käsket oo:ta tekemään ne asiat
         * loppujen lopuksi
         *
         * Muodon muokkausta, jälkikäsittelyä jne.
         */
        oo.writeObject(this);
    }

    /**
     * Lue kurssidata tiedostosta
     *
     */
    @Override
    public void readExternal(ObjectInput oi) throws IOException {
        try {
            Kurssidata apumuuttuja = (Kurssidata) oi.readObject();
            this.setHeader(apumuuttuja.getHeader());
            this.setBody(apumuuttuja.getBody());
        } catch (ClassNotFoundException e) {
        }
    }
}
