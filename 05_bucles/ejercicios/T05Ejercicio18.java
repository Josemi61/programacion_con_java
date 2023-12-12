import java.util.Scanner;
/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T05Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    System.out.print("Introduce un dos numero seguidos por espacio: ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if (num1 < num2) {
      for (int i = num1; i <= num2; i+=7) {
        System.out.print(i + " ");
      }
    } else{
      for (int i = num2; i <= num1; i+=7) {
        System.out.print(i + " ");
      }
    }
    sc.close();
  }
}
