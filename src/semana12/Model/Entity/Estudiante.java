package semana12.Model.Entity;

public class Estudiante {

  private String codigo;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String nombre;
  private int edad;
  private char sexo;

  public Estudiante() {
  }

  public Estudiante(String codigo, String apellidoPaterno, String apellidoMaterno, String nombre, int edad, char sexo) {
    this.codigo = codigo;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
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

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }
}
