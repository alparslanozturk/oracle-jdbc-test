import java.sql.*;    
public class baglan {
  private final static String DB_URL = "jdbc:oracle:thin:@//172.16.54.192:1521/MHRSTESTDB";
  private final static String USER = "aozturk";
  private final static String PASS = "parola123";

  public static void main(String[] args) {
    Connection conn = null;  
    try {    
      Class.forName("oracle.jdbc.driver.OracleDriver");    
      System.out.println("Baglaniyor...");    
      conn = DriverManager.getConnection(DB_URL,USER,PASS);    
      System.out.println("Baglandi...");
    } catch (Exception e) {    
      e.printStackTrace();    
    } finally {    
      if (conn != null) {    
        try {    
          conn.close();    
        } catch (SQLException e) {    
        }    
      }    
    }            
  }    
}
