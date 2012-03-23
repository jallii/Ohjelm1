/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author lmjaland
 */
public class Tekstinlukija {

    public Tekstinlukija() {
    }

    @BeforeClass
    //Ajetaan ennen kaikkia testejä.  
    //Tänne voi laittaa alustukset, jotka ovat kaikille testeille yhteiset
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    //Ajetaan kaikkien testien jälkeen
    public static void tearDownClass() throws Exception {
    }

    @Before
    // Ajetaan ennen jokaista testiä
    public void setUp() {
    }

    @After
    // Ajetaan jokaisen testin jälkeen
    public void tearDown() {
    }
    // TODO add test methods here.
//    luo kaksi oliota ja tee niiden vertailu käyttäen assertTrue(boolean) -metodia
//    vertaa oliota käyttäen assertEquals(Object obj1, Object obj2)
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void hello() {
//        assertTrue(4 + 1 == 5);
    }
}
