import java.util.Scanner;
public class Ejemplo04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int cont = 0;
    int suma = 0;
    while (i >= 0) {
      System.out.print("Introduce un numero: ");
      i = sc.nextInt();
      if (i > 0) {
        cont++;
        suma = suma + i;
      }
    }
    System.out.println("Has metido un total de " + cont + " numeros positivos");
    System.out.println("La suma de ellos es " + suma);
    sc.close();
  }
}
