/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
 * 
 *@author Jose Miguel Toro Canillas
 */
import java.util.Scanner;
public class T03Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pesetas;
    System.out.print("Introduce las pesatas a convertir en euros: "); 
    pesetas = sc.nextInt();
    double resultado = pesetas / 166.386;
    System.out.printf("Tienes un total de %.2f euros, con pesetas", resultado,pesetas);
    sc.close();
  }
}
