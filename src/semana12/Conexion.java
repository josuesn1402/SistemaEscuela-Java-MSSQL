package semana12;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public String conexion(){
        String result="conexion fallida";
        
        String connectionUrl =
                "jdbc:sqlserver://192.168.30.30:1433;"
                        + "database=bdescuela;"
                        + "user=conectar;"
                        + "password=sql2024;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
                        

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
         result="conexion exitosa";
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
}