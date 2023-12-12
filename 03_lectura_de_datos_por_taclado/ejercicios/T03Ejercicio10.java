import java.util.Scanner;
/**
 * Realiza un conversor de Mb a Kb.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tu cantidad de MB: ");
    double conversor = sc.nextDouble();
    System.out.printf("La cantidad introducidad de Mb es igual a %.2f Kb.",conversor*1024);
    sc.close();
  }
}
