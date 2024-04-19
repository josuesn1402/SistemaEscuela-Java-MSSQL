package semana12.Model.Entity;

import java.sql.Date;

public class Matricula {

  private String idMatricula;
  private String codigoEstudiante;
  private String codigoLectivo;
  private int codigoTurno;
  private Date fecha;

  public Matricula() {
  }

  public Matricula(String idMatricula, String codigoEstudiante, String codigoLectivo, int codigoTurno, Date fecha) {
    this.idMatricula = idMatricula;
    this.codigoEstudiante = codigoEstudiante;
    this.codigoLectivo = codigoLectivo;
    this.codigoTurno = codigoTurno;
    this.fecha = fecha;
  }

  public String getIdMatricula() {
    return idMatricula;
  }

  public void setIdMatricula(String idMatricula) {
    this.idMatricula = idMatricula;
  }

  public String getCodigoEstudiante() {
    return codigoEstudiante;
  }

  public void setCodigoEstudiante(String codigoEstudiante) {
    this.codigoEstudiante = codigoEstudiante;
  }

  public String getCodigoLectivo() {
    return codigoLectivo;
  }

  public void setCodigoLectivo(String codigoLectivo) {
    this.codigoLectivo = codigoLectivo;
  }

  public int getCodigoTurno() {
    return codigoTurno;
  }

  public void setCodigoTurno(int codigoTurno) {
    this.codigoTurno = codigoTurno;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }
}
