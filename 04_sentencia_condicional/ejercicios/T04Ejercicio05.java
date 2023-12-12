import java.util.Scanner;
/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Vamos a resolver la ecuacion de primer grado: ax+b = 0");
    System.out.print("Introduce el valos de a y de b separados por un espacio: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    if (a == 0 && b != 0) {
      System.out.printf("La solucion en %.2f",b);
    }else if (a == 0 && b == 0) {
      System.out.println("La solucion es 0");
    }else {
      System.out.println("La solucion es " + (-b/a));
    }
    sc.close();
  }
}
