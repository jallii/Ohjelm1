package harjoitusmasiina;

/**
 * Työn aihe: Automaattinen kokeenkorjaaja /harjoituskone
 *
 * Kuvaus: Toteutetaan ohjelmisto jonka avulla jonkun kurssinvetäjä voi
 * toteuttaa automaattisen kokeen tai harjoituttaa oppilaitaan itsenäisesti. *
 *
 * Kirjautuminen luokka: Opettaja luo opiskelijoiden tunnukset, antaa
 * vastaussähköpostiosoitteen ja toimittaa kurssin aineiston ohjelmalle.
 * Opettaja antaa ohjelman käyttöön määrämuotoisen tekstitiedoston, jonka
 * perusteella opiskelija voi harjoitella itsenäisesti vastaamalla
 * monivalintatyyppisiin kysymyksiin tai suorittaa kokeen.
 *
 * Opiskelija kirjautuu ohjelmiston käyttäjäksi harjoittelee aineiston avulla ja
 * suorittaa kokeen. Harjoittelumoodissa ohjelma esittää monivalintakysymyksiä
 * valinnaisella vaikeustasolla. Opiskelijan vastatessa kysymyksiin ohjelma
 * kertoo oikean vastauksen ja pisteet. Koemoodissa ohjelma kysyy opiskelijalta
 * koekysymykset ja toimittaa vastaukset sähköpostilla opettajalle. Koemoodissa
 * osaan kysymyksiä voi vastata myös vapaamuotoisella tekstillä. Koemoodissa
 * ohjelma lähettää kokeen opettajalle sähköpostilla. Monivalintakysymykset
 * tulevat perille valmiiksi pisteytettyinä, joten opettaja joutuu manuaalisesti
 * vain pisteyttämään vapaamuotoiset kysymyksensä ja antamaan kokonaispisteet. *
 * Järjestelmään kirjautuminen onnistuu jos salasana ja käyttäjätunnus oikein.
 * Kurssin tavoitteet ja info on nähtävissä ohjelman sisällä, jolloin opettaja
 * voi käyttää näitä myös tärkeäksi katsomansa informaation välittämiseen. *
 * Ohjelmiston ensimmäinen versio on suunniteltu toimimaan palvelimella web
 * käyttöliittymän avulla kurssikohtaisesti itsenäisenä, jolloin sitä voi
 * käyttää pelkän nettiselaimen avulla. Jos siis ohjelmistoa haluaa käyttää
 * monen kurssin kohdalla on jokaiselle kurssille käynnistettävä erillinen
 * versio ohjelmasta. Myöhemmillä versioilla voi rakentaa toiminnallisuutta
 * monien kurssien hallinnointiin saman ohjelman sisällä.
 *
 * @author lmjaland
 */
public class Harjoitusmasiina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Kirjaudu kirjaudu = new Kirjaudu (new UIOlio());

        onnetar.run();

    } // TODO code application logic here
    }
}
