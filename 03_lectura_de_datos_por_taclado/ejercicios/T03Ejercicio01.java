import java.util.Scanner;

/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio01 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  double x;
  double y;
  System.out.print("Introduce dos numero separados por espacios para realizar la miltiplicación: ");
  x = sc.nextDouble();
  y = sc.nextDouble();
  double resultado = x * y;
  System.out.printf("La solucion de la operación es: %.2f", resultado);
  sc.close();
}
  
}