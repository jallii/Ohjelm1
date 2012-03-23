package harjoitusmasiina;

/**
 *
 * @author lmjaland
 */
public class Vastaus <T> 
{

    private T tieto;
    private boolean oikein;
    private int tietotyyppi;

    public Vastaus(T tieto, boolean oikein, int tietotyyppi) {
        this.tieto = tieto;
        this.oikein = oikein;
        this.tietotyyppi=tietotyyppi;
    }

    public T getVastaus() {
        return tieto;
    }

    public void setVastaus(T tieto) {
        this.tieto = tieto;
    }

    public boolean onkoOikein() {
        return oikein;
    }

    public int getTietotyyppi() {
        return tietotyyppi;
    }

    public void setTietotyyppi(int tietotyyppi) {
        this.tietotyyppi = tietotyyppi;
    }

    public String toString() {
        return tieto.toString();
    }
    
}
