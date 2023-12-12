import java.util.Scanner;
/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la nota de tu primer examen: ");
    double nota = sc.nextDouble();
    System.out.print("Introduce la nota que quieres tener en el trimestre: ");
    double total = sc.nextDouble();
    System.out.printf("Para tener un %.2f debes sacar un %.2f en el segundo examen.",total,((total - (nota * 0.4)) / 0.6));

    sc.close();
  }
}
