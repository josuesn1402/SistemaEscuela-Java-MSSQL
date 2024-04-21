package semana12.Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

  public String conexion() {
    String result = "conexion fallida";

    String connectionUrl
      = "jdbc:sqlserver://localhost:1433;"
      + "database=bdescuela;"
      + "user=Conectar;"
      + "password=sql2024;"
      + "encrypt=true;"
      + "trustServerCertificate=true;"
      + "loginTimeout=30;";

    try (Connection connection = DriverManager.getConnection(connectionUrl);) {
      result = "conexion exitosa";
    } catch (Exception e) {
      e.printStackTrace();
    }

    return result;
  }

}
