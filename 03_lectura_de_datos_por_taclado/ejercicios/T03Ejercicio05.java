import java.util.Scanner;

/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double l;
    double a;
    System.out.print("Introduce el largo y el ancho del rectangulo separa por un espacio (para calcular el area): ");
    l = sc.nextDouble();
    a = sc.nextDouble();
    double resultado = l * a;
    System.out.printf("El area del rectangulo es: %.2f ", resultado);
    sc.close();
  }
}
