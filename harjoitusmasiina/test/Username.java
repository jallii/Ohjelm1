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
public class Username {
    
    public Username() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
//        Username nimi=new Username();
//        String A1="123";
//        String B1="123";
//        String A2="456";
//        String B2="456";
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
   
   @Test 
   public void emptyKonstruktoriOnNull(){
   Username nimi=new Username();
   assertNotNull(nimi);
   }
   @Test 
   public void notemptyKonstruktoriOnNull(){
   
   Username nimi=new Username();
        Class<? extends Username> aClass = nimi.getClass();
  aClass.isInstance(nimi);
//   assertNotNull(nimi);
   
   }
//    
//    @Test
//    public void lisaaNimi() {
//        Username A=new Username();
//       
//        assertSame("Lisätty nimi vastaa",  "123", A.lisaaNimi("123"));
//    
//        
//    }
//    
//    assertEquals(Object obj1, Object obj2)
//
//            assertEquals(Object obj1, Object obj2)
//      assertTrue(4+2 == 5);   
}
