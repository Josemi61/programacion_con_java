import java.util.Scanner;
/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long numeroIntroducido;
    int numeroCifras = 1;
    int aux = 1;
    System.out.print("Introduzca un numero entero y le dire cuantos digitos tiene: ");
    numeroIntroducido = sc.nextLong();
    for ( int i = 10; (numeroIntroducido % i < 10)&& i<numeroIntroducido ; i= i *10) {
     if (numeroCifras % i < 10) {
      System.out.println("Tu numero tiene " + aux + " cifras.");
     }
     aux += 1;
    }
    sc.close();
  }
}
