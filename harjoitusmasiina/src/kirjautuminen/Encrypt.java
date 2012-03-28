
package kirjautuminen;

/**
 * Sanalanan yksisuuntainen kryptaus
 * ei vielä toteutettu. Poimittu vain jotain ideoita
 * @author lmjaland
 */
public class Encrypt {

    
    String encrypt (String passwd) {
    
        return passwd;
    }

//   private String password = null;

//   public String getPassword() {
//      return password;
//   }

//   public String new2Password( String passwd ) {
//      try {
//        MessageDigest md = MessageDigest.getInstance("SHA-1");
//        String clearPassword = passwd;
//        md.update(clearPassword.getBytes());
//        byte[] digestedPassword = md.digest();
//        return new String(digestedPassword);
//      }
//      catch (java.security.NoSuchAlgorithmException e) {
//         System.out.println("Rats, MD5 doesn't exist");
//         System.out.println(e.toString());
//         return null;
//      }}

//   public void setPassword(String passwd) {
//      try {
//         MessageDigest sha = MessageDigest.getInstance("MD5");
//         byte[] tmp = passwd.getBytes();
//         sha.update(tmp);
//         password = new String(sha.digest());
//      }
//      catch (java.security.NoSuchAlgorithmException e) {
//         System.out.println("Rats, MD5 doesn't exist");
//         System.out.println(e.toString());
//      }
//   }

//      Encrypt1 e = new Encrypt1();
//      String pwd = "kaana";
//      e.setPassword( pwd) ;
//      System.out.println("Password: " + pwd + " ==> " + e.getPassword()   + "\new2Password:" + e.new2Password( pwd ) );
//      e.new2Password( pwd );
//    public static void main(String[] args) {
//        String password = "secret";
//        String algorithm = "SHA";
//        byte[] plainText = password.getBytes();
//        MessageDigest md = null;
//        try {
//            md = MessageDigest.getInstance(algorithm);
//        } catch (Exception e) {
////            e.printStackTrace();
//        }
//        md.reset();
//        md.update(plainText);
//        byte[] encodedPassword = md.digest();

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < encodedPassword.length; i++) {
//            if ((encodedPassword[i] & 0xff) < 0x10) {
//                sb.append("0");
//            }
//            sb.append(Long.toString(encodedPassword[i] & 0xff, 16));
//        }
//        System.out.println("Plain    : " + password);
//        System.out.println("Encrypted: " + sb.toString());
//    }


}
