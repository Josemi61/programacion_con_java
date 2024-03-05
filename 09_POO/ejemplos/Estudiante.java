public class Estudiante extends Persona {

  //Atributos
  private int creditos;


  //Constructores
  public Estudiante(String nombre, int edad, String dni) {
    super(nombre, edad, dni);
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos) {
    super(nombre, edad, dni);
    this.creditos = 60;
  }
}
