import java.util.Scanner;

public class Ejemplo03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252 ");
    System.out.println("Introduce el nombre: ");
    String nombre =sc.nextLine();

    System.out.print("Introduce tu edad: ");
    int edad =sc.nextInt();

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
    sc.close();
  }
}
