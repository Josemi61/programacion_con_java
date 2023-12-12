import java.util.Scanner;
/**
 * Escribe un programa que calcule el área de un triángulo..

 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double base;
    double altura;
    System.out.print("Introduceme la base y la altura separados por un espacio: ");
    base = sc.nextDouble();
    altura = sc.nextDouble();
    System.out.printf("El area del triangulo es %.2f",(base*altura/2));
    sc.close();
  }
}
