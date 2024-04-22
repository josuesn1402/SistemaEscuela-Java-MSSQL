package semana12.Controller;

import javax.swing.table.DefaultTableModel;
import semana12.Model.DAO.EstudianteDAO;
import semana12.Model.Entity.Estudiante;

public class EstudianteCtrl {

  EstudianteDAO dao = new EstudianteDAO();

  public void listarEstudiantes(DefaultTableModel model) {
    dao.listarEstudiantes(model);
  }

  public void agregarEstudiante(Estudiante estudiante) {
    dao.agregarEstudiante(estudiante);
  }

  public void modificarEstudiante(Estudiante estudiante) {
    dao.modificarEstudiante(estudiante);
  }
}
