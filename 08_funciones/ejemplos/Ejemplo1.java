import java.util.Scanner;

/**
 * Ejemplo1
 */
public class Ejemplo1 {
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero entero positivo: ");
    int n = sc.nextInt();
    boolean esPrimo = true;
    for (int i = 2; i < n; i++) {
      if (n%i == 0) {
        esPrimo = false;
      }
    }
    if (esPrimo) {
      System.out.println(n + " es primo");
    }else{
      System.out.println("no lo es");
    }
    sc.close();
  }
}