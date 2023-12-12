import java.util.Scanner;

/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T04_Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String dia;
    System.out.print("Introduce un dia de la semana: ");
    dia = sc.nextLine();
    switch (dia) {
      case "Lunes":
        System.out.println("La asignatura que toca hoy a primera es FOL");
        break;
      case "Martes":
        System.out.println("La asignatura que toca hoy a primera es BD");
        break;
      case "Miercoles":
        System.out.println("La asignatura que toca hoy a primera es LM");
        break;
      case "Jueves":
        System.out.println("La asignatura que toca hoy a primera es PRGRM");
        break;
      case "Viernes":
        System.out.println("La asignatura que toca hoy a primera es ED");
        break;
      case "Sabado":
        System.out.println("Hoy no hay clase");
        break;
      case "Domingo":
        System.out.println("Hoy no hay clase");
        break;
    
      default:
      System.out.println("Error!!!! Ecribe un dia de la semana");
        break;
    }
    sc.close();
  }
}