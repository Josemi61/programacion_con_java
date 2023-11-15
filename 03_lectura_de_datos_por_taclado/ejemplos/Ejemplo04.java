import java.util.Scanner;

public class Ejemplo04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tu nombte y la edad (separados por un espacio): ");
    String nombre = sc.next();
    String apellido1 = sc.next();
    String apellido2 = sc.next();
   
    int edad = sc.nextInt();

    System.out.println("Tu nombre es " + nombre +"" +apellido1 +""+ apellido2 + " y tienes " + edad + " años");

    sc.close();
  }
}