package modules;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
  private final static String url = "jdbc:mysql://localhost:3306/";
  private final static String user = "root";
  private final static String passwd = "";

  public static Connection getConexion(String bbdd){
    Connection conexion = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conexion = DriverManager.getConnection(url + bbdd, user, passwd);
    } catch (Exception e) {
      System.out.println("No se ha podido conectar a la base de datos");
    }
    return conexion;
  }
}
