package semana12.Model.Entity;

public class Estudiante {

  private String codigo;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String nombre;
  private int edad;
  private String genero;

  public Estudiante() {
  }

  public Estudiante(String codigo, String apellidoPaterno, String apellidoMaterno, String nombre, int edad, String genero) {
    this.codigo = codigo;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.nombre = nombre;
    this.edad = edad;
    this.genero = genero;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }
}
