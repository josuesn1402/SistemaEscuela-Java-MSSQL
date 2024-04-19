package semana12.Model.Entity;

public class DetalleMatricula {

  private String idMatricula;
  private String codigoCurso;
  private int nota;

  public DetalleMatricula() {
  }

  public DetalleMatricula(String idMatricula, String codigoCurso, int nota) {
    this.idMatricula = idMatricula;
    this.codigoCurso = codigoCurso;
    this.nota = nota;
  }

  public String getIdMatricula() {
    return idMatricula;
  }

  public void setIdMatricula(String idMatricula) {
    this.idMatricula = idMatricula;
  }

  public String getCodigoCurso() {
    return codigoCurso;
  }

  public void setCodigoCurso(String codigoCurso) {
    this.codigoCurso = codigoCurso;
  }

  public int getNota() {
    return nota;
  }

  public void setNota(int nota) {
    this.nota = nota;
  }

}
