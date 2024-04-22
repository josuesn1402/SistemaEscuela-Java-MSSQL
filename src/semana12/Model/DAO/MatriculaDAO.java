package semana12.Model.DAO;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import semana12.Config.Conexion;
import java.sql.*;
import java.sql.CallableStatement;


public class MatriculaDAO {

    Conexion conexion = new Conexion();

    public DefaultTableModel obtenerDatosDeTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        try {
            Connection connection = (Connection) conexion.obtenerConexion();

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
}
