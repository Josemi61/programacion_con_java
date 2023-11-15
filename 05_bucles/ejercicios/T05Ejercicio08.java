import java.util.Scanner;

/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T05Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero para hacer la tabla de multiplicar: ");
    int num = sc.nextInt();
    for(int i=0;i<=10; i++){
      System.out.println(num + " * " + i + " = " + (num*i) );
    }
    sc.close();
  }
}
