package semana12.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

  public Connection obtenerConexion() throws SQLException {
    Connection connection = null;

    String connectionUrl
      = "jdbc:sqlserver://localhost:1433;"
      + "database=bdescuela;"
      + "user=Conectar;"
      + "password=sql2024;"
      + "encrypt=true;"
      + "trustServerCertificate=true;"
      + "loginTimeout=30;";

    try {
      connection = DriverManager.getConnection(connectionUrl);
    } catch (SQLException e) {
      System.err.println("Error al conectar a la base de datos: " + e.getMessage());
      throw e;
    }

    return connection;
  }

}