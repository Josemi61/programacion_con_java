import java.util.Scanner;

public class T05Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int suma = 0;
    System.out.print("Introduce un numero entero positivo: ");
    num = sc.nextInt();
    if (num > 0) {
      for (int i = 0; i < 100; i++) {
        num ++;
        suma = num + suma;
      }
      System.out.println("La suma es " + suma);
    }
    sc.close();
  }
}
