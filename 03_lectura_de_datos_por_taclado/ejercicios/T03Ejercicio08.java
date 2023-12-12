import java.util.Scanner;
/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T03Ejercicio08 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int horas;
  System.out.print("Introduce las horas trabajadas: ");
  horas = sc.nextInt();
  System.out.println("Tu salario sera de " + horas*12);
  sc.close();
 } 
}
