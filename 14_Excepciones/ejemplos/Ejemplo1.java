import java.util.Scanner;

/**
 * Ejemplo1
 */
public class Ejemplo1 {
  public static void main(String[] args) {
    double num1;
    double num2;
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Introduzca el primer numero: ");
      num1 = sc.nextDouble();
      System.out.print("Introduzca el segundo numero: ");
      num2 = sc.nextDouble();
      System.out.println("La media es " + (num1 + num2)/2);
    } catch (Exception e) {
      System.out.println("No se puede calcular la media.");
      System.out.println("Los datos introducidos no son los correctos.");
      // TODO: handle exception
    }
    sc.close();
  }
}