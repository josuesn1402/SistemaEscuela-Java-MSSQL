package semana12.Model.DAO;

import semana12.Config.Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EstudianteDAO {

  Conexion conexion = new Conexion();

  public ResultSet listarEstudiantes() {
    ResultSet resultSet = null;
    try (Connection connection = conexion.obtenerConexion()) {
      CallableStatement statement = connection.prepareCall("{call sp_ListarEstudiantes}");
      resultSet = statement.executeQuery();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return resultSet;
  }

  public void agregarEstudiante(String codigo, String apellidoPaterno, String apellidoMaterno, String nombre, int edad, char sexo) {
    try (Connection connection = conexion.obtenerConexion()) {
      CallableStatement statement = connection.prepareCall("{call sp_AgregarEstudiante(?, ?, ?, ?, ?, ?)}");
      statement.setString(1, codigo);
      statement.setString(2, apellidoPaterno);
      statement.setString(3, apellidoMaterno);
      statement.setString(4, nombre);
      statement.setInt(5, edad);
      statement.setString(6, String.valueOf(sexo));
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void modificarEstudiante(String codigo, String apellidoPaterno, String apellidoMaterno, String nombre, int edad, char sexo) {
    try (Connection connection = conexion.obtenerConexion()) {
      CallableStatement statement = connection.prepareCall("{call sp_ModificarEstudiante(?, ?, ?, ?, ?, ?)}");
      statement.setString(1, codigo);
      statement.setString(2, apellidoPaterno);
      statement.setString(3, apellidoMaterno);
      statement.setString(4, nombre);
      statement.setInt(5, edad);
      statement.setString(6, String.valueOf(sexo));
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
