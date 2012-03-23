package harjoitusmasiina;


public interface Keskustelija {

   public void ilmoita(String viesti);

   public void ilmoita(int viesti);
//
   public void ilmoita(double viesti);
//
   public void ilmoita(boolean viesti);

   public void tell(String message);

   public void tell(int message);
//
   public void tell(double message);
//
   public void tell(boolean message);

   public String kysyString(String kysymys);

   public String askString(String question);

   public int kysyInt(String viesti);

   public int askInt(String question);

   public double kysyDouble(String viesti);

   public double askDouble(String question);
}
