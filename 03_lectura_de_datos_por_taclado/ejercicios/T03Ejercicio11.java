import java.util.Scanner;
/**
 *Realiza un conversor de Kb a Mb
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce tu cantidad de KB: ");
    double conversor = sc.nextDouble();
    System.out.printf("La cantidad introducidad de Kb es igual a %.2f Mb.",conversor/1024);
    sc.close();
  }
}
