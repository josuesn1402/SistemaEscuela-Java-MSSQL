/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12.Controller;

import javax.swing.table.DefaultTableModel;
import semana12.Model.DAO.MatriculaDAO;
import semana12.Model.Entity.Matricula;

/**
 *
 * @author W10
 */
public class CtrlMatricula {
    MatriculaDAO dao = new MatriculaDAO();
    
    public DefaultTableModel obtenerDatosDeTabla() {
        return dao.obtenerDatosDeTabla();
    }

    public void insertarMatricula(Matricula matricula) {
        dao.insertarMatricula(matricula);
    }

    public void modificarMatricula(Matricula matricula) {
        dao.modificarMatricula(matricula);
    }
    
    public DefaultTableModel obtenerDesCur() {
        return dao.obtenerDesCur();
    }

    public DefaultTableModel obtenerDest() {
        return dao.obtenerDest();
    }

    public DefaultTableModel obtenerDesl() {
        return dao.obtenerDesl();
    }

    public DefaultTableModel obtenerNombresEstudiantes() {
        return dao.obtenerNombresEstudiantes();
    }
}
