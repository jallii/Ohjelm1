package harjoitusmasiina;

import java.util.*;

/**
 * Tämä luokka hoitaa käyttäjien kirjautumisen logiikan
 *
 * @author lmjaland
 */
public class Kirjaudu {

    public String kysySalasana(String kysymys) {

        return (kysymys);
    }

    String kysymys;
    String vastaus;

    HashMap<String,String> kysymystaulu = new HashMap<String,String>();
    
    if (kysymystaulu.containsKey(kysymys)) {
            if kysymystaulu.containsValue(vastaus) {
                System.out.println("Antamasi kysymys " + kysymystaulu.get(kysymys) + " on jo olemassa");
            } else {
                kysymystaulu.put(kysymys, vastaus);
            }
        }
    }
}
}
