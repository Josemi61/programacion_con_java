import java.util.Scanner;
/**
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double impo;
    System.out.print("Introduce la base imponible de la factura: ");
    impo = sc.nextDouble();
    System.out.printf("Base imponible %14.2f\n", impo);
    System.out.printf("IVA(21%%) %20.2f\n", impo*0.21);
    System.out.printf("Base imponible + IVA %8.2f", impo*1.21);
    sc.close();
  }
}
