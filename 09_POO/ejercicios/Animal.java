public class Animal {
  //Atributos

  private String nombre;
  private int edad;
  private String naturaleza;
  
  //Constructor

  public Animal(String nombre, int edad, String naturaleza) {
    this.nombre = nombre;
    this.edad = edad;
    this.naturaleza = naturaleza;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getDni() {
    return naturaleza;
  }

  public void mostrarDatos(){
    System.out.println("Nombre: " + nombre + "\tEdad: " + edad + "\tNaturaleza: " + naturaleza);
  }
}
