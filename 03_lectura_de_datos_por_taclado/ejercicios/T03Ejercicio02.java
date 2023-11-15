import java.util.Scanner;

/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double euros;
    System.out.print("Esto es un conversor de euros a pesetas, introduzca los euros: ");
    euros = sc.nextDouble();
    int resultado = (int) (euros * 166.386);
    System.out.println("Tienes un totas de " + resultado + " pesetas con " + euros + "." );
    sc.close();
  }
}
