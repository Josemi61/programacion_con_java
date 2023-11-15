import java.util.Scanner;
/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x;
    double y;
    System.out.print("Introduce dos numero separados por un espacio: ");
    x = sc.nextDouble();
    y = sc.nextDouble();
    double suma = x + y;
    double resta = x - y;
    double multiplicacion = x * y;
    double division = x/y;
    System.out.printf("Esta es la suma: %.2f\n",suma);
    System.out.printf("Esta es la resta: %.2f\n",resta);
    System.out.printf("Esta es la multiplicación: %.2f\n",multiplicacion);
    System.out.printf("Esta es la división: %.2f\n",division);
    sc.close();
  }
}
