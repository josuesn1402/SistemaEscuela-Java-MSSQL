package semana12.Model.DAO;

import semana12.Config.Conexion;
import semana12.Model.Entity.Estudiante;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class EstudianteDAO {

  Conexion conexion = new Conexion();

  public DefaultTableModel listarEstudiantes(DefaultTableModel model) {
    try (Connection connection = conexion.obtenerConexion(); CallableStatement statement = connection.prepareCall("{call sp_ListarEstudiantes}"); ResultSet resultSet = statement.executeQuery()) {

      model.setRowCount(0);
      String[] columnNames = {"Código", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "Género"};
      model.setColumnIdentifiers(columnNames);

      while (resultSet.next()) {
        Object[] row = {
          resultSet.getString("codigo"),
          resultSet.getString("nombre"),
          resultSet.getString("apellido_paterno"),
          resultSet.getString("apellido_materno"),
          resultSet.getInt("edad"),
          resultSet.getString("genero")
        };
        model.addRow(row);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return model;
  }

  public void agregarEstudiante(Estudiante estudiante) {
    try (Connection connection = conexion.obtenerConexion(); CallableStatement statement = connection.prepareCall("{call sp_AgregarEstudiante(?, ?, ?, ?, ?, ?)}")) {
      statement.setString(1, estudiante.getCodigo());
      statement.setString(2, estudiante.getApellidoPaterno());
      statement.setString(3, estudiante.getApellidoMaterno());
      statement.setString(4, estudiante.getNombre());
      statement.setInt(5, estudiante.getEdad());
      statement.setString(6, estudiante.getGenero());
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void modificarEstudiante(Estudiante estudiante) {
    try (Connection connection = conexion.obtenerConexion(); CallableStatement statement = connection.prepareCall("{call sp_ModificarEstudiante(?, ?, ?, ?, ?, ?)}")) {
      statement.setString(1, estudiante.getCodigo());
      statement.setString(2, estudiante.getApellidoPaterno());
      statement.setString(3, estudiante.getApellidoMaterno());
      statement.setString(4, estudiante.getNombre());
      statement.setInt(5, estudiante.getEdad());
      statement.setString(6, estudiante.getGenero());
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
