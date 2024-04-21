package semana12;

import semana12.Config.Conexion;
import semana12.View.FrmMatricula;

public class Semana12 {

  public static void main(String[] args) {
    Conexion conexion = new Conexion();
    System.out.println(conexion.conexion());
    
      FrmMatricula m = new  FrmMatricula();
      m.show();
  }
}
