import java.util.Scanner;
/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horas;
    System.out.print("Introduce las horas trabajadas: ");
    horas = sc.nextInt();
    if (horas <= 40) {
      System.out.println("Tu salario sera de " + horas * 12 + "€");
    }else {
      int resto = horas -40;
      System.out.println("Tu salario sera de " + ((40*12) + (resto* 16)) + "€");
    }
    sc.close();
  }
}
