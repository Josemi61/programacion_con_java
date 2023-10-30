/**
 * Ejemplo01
 */
public class Ejemplo01 {
  public static void main(String[] args) {
    String nombre;
    System.out.print("Dime como te llamas: ");
    nombre = System.console().readLine();

    System.out.println("!Hola " + nombre + " !Biemvenido a programación");
  }
}