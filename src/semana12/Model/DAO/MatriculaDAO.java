package semana12.Model.DAO;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import semana12.Config.Conexion;
import java.sql.*;
import java.sql.CallableStatement;
import semana12.Model.Entity.Matricula;

public class MatriculaDAO {

    Conexion conexion = new Conexion();

    public DefaultTableModel obtenerDatosDeTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();

        try (java.sql.Connection connection = conexion.obtenerConexion()) {
            CallableStatement cstmt = connection.prepareCall("{call VerMatriculas()}");

            ResultSet rs = cstmt.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                modeloTabla.addColumn(metaData.getColumnLabel(columnIndex));
            }

            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(rowData);
            }

            rs.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return modeloTabla;
    }

    public void insertarMatricula(Matricula matricula) {
        try (java.sql.Connection connection = conexion.obtenerConexion()) {
            String sql = "{call InsertarMatricula(?, ?, ?, ?)}";
            try (CallableStatement statement = connection.prepareCall(sql)) {
                statement.setString(1, matricula.getCodigoEstudiante());
                statement.setString(2, matricula.getCodigoLectivo());
                statement.setInt(3, matricula.getCodigoTurno());
                statement.setTimestamp(4, new java.sql.Timestamp(matricula.getFecha().getTime()));

                statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarMatricula(Matricula matricula) {
        try (java.sql.Connection connection = conexion.obtenerConexion()) {
            String sql = "{call ModificarMatricula(?, ?, ?, ?, ?)}";
            try (CallableStatement statement = connection.prepareCall(sql)) {

                statement.setString(1, matricula.getIdMatricula());
                statement.setString(2, matricula.getCodigoEstudiante());
                statement.setString(3, matricula.getCodigoLectivo());
                statement.setInt(4, matricula.getCodigoTurno());
                statement.setTimestamp(5, new java.sql.Timestamp(matricula.getFecha().getTime()));

                statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public DefaultTableModel obtenerDesCur() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        try (java.sql.Connection connection = conexion.obtenerConexion(); CallableStatement statement = connection.prepareCall("{call ObtenerDesCur()}")) {

            ResultSet rs = statement.executeQuery();

            modeloTabla.addColumn("descur");

            while (rs.next()) {
                modeloTabla.addRow(new Object[]{rs.getString("descur")});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return modeloTabla;
    }

    public DefaultTableModel obtenerDest() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        try (java.sql.Connection connection = conexion.obtenerConexion(); CallableStatement statement = connection.prepareCall("{call ObtenerDest()}")) {

            ResultSet rs = statement.executeQuery();

            modeloTabla.addColumn("dest");

            while (rs.next()) {
                modeloTabla.addRow(new Object[]{rs.getString("dest")});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return modeloTabla;
    }

    public DefaultTableModel obtenerDesl() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        try (java.sql.Connection connection = conexion.obtenerConexion(); CallableStatement statement = connection.prepareCall("{call ObtenerDesl()}")) {

            ResultSet rs = statement.executeQuery();

            modeloTabla.addColumn("desl");

            while (rs.next()) {
                modeloTabla.addRow(new Object[]{rs.getString("desl")});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return modeloTabla;
    }

    public DefaultTableModel obtenerNombresEstudiantes() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        try (java.sql.Connection connection = conexion.obtenerConexion(); CallableStatement statement = connection.prepareCall("{call ObtenerNombresEstudiantes()}")) {

            ResultSet rs = statement.executeQuery();

            modeloTabla.addColumn("NombreCompleto");

            while (rs.next()) {
                modeloTabla.addRow(new Object[]{rs.getString("NombreCompleto")});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return modeloTabla;
    }
}
