import java.util.Scanner;
/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
1/3πr2h
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r;
    double h;
    System.out.print("Introduce el radio y la altura del cono separados por espacio: ");
    r = sc.nextDouble();
    h = sc.nextDouble();
    double volumen = (Math.PI*(Math.pow(r, 2))*h)/3;
    System.out.printf("El volumen del cono es %.2f", volumen);
    sc.close();
  }
}
