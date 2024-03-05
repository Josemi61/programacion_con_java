public class AppPersonaEstudiante {
  public static void main(String[] args) {
    Persona p = new Persona("Pepe Rodriguez", 30, "12345678A");
    Estudiante e = new Estudiante("Paula Gomez", 21, "55555555D");
    p.mostrarDatos();
    e.mostrarDatos();
  }
}
