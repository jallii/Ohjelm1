package harjoitusmasiina;


import harjoitusmasiina.Keskustelija;
import javax.swing.JOptionPane;

public class UIOlio implements Keskustelija {

//-----------------------------------------------------------------
//  ilmoita(String viesti)
//-----------------------------------------------------------------
   @Override
   public void ilmoita(String viesti) {
      JOptionPane.showMessageDialog(null,
              viesti, "", JOptionPane.PLAIN_MESSAGE);
   }
   
   @Override
   public void ilmoita(int viesti) {
      ilmoita("" + viesti);
   }
   
   @Override
   public void ilmoita(double viesti) {
      ilmoita("" + viesti);
   }
   
   @Override
   public void ilmoita(boolean viesti) {
      ilmoita("" + viesti);
   }
   
   @Override
   public void tell(String message) {
      ilmoita(message);
   }
   
   @Override
   public void tell(int message) {
      ilmoita("" + message);
   }
   
   @Override
   public void tell(double message) {
      ilmoita("" + message);
   }
   
   @Override
   public void tell(boolean message) {
      ilmoita("" + message);
   }
//------------------------------------------------------------------
//  kysyString(String kysymys)
//-----------------------------------------------------------------

   @Override
   public String kysyString(String kysymys) {
      // MYÖS NULL JA TYHJÄ KELPAAVAT! NIITÄ ON HYVÄ ITSE TESTATA.
      return JOptionPane.showInputDialog(kysymys);
   }
   
   @Override
   public String askString(String question) {
      return kysyString(question);
   }

//------------------------------------------------------------------
//  kysyInt(String kysymys)
//-----------------------------------------------------------------
   @Override
   public int kysyInt(String kysymys) {
      String tarjokas = "";
      int arvo = 0;
      boolean kunnossa = false;
      do {
         try {
            tarjokas = JOptionPane.showInputDialog(kysymys);
            arvo = Integer.parseInt(tarjokas);
            kunnossa = true;
         } catch (Exception e) {
            if (tarjokas == null) {
               ilmoita("Cancel is not an integer!");
            } else {
               ilmoita(tarjokas + " is not an integer!");
            }
         }
      } while (!kunnossa);
      
      return arvo;
   }
   
   @Override
   public int askInt(String question) {
      return kysyInt(question);
   }

//-----------------------------------------------------------------
//  kysyDouble(String kysymys)
//------------------------------------------------------------------
   @Override
   public double kysyDouble(String kysymys) {
      String tarjokas = "";
      double arvo = 0;
      boolean kunnossa = false;
      do {
         try {
            tarjokas = JOptionPane.showInputDialog(kysymys);
            arvo = Double.parseDouble(tarjokas);
            kunnossa = true;
         } catch (Exception e) {
            if (tarjokas == null) {
               ilmoita("Cancel is not a double!");
            } else {
               ilmoita(tarjokas + " is not a double!");
            }
         }
      } while (!kunnossa);
      
      return arvo;
   }
   
   @Override
   public double askDouble(String question) {
      return kysyDouble(question);
   }
}
