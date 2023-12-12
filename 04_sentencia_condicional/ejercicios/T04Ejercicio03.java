import java.util.Scanner;
/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T04Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe un numero del 1-7 y te escribira el dia de la semana correspondiente: ");
    int numDia = sc.nextInt();
    switch (numDia) {
      case 1:
        System.out.println("El dia seleccionado es Lunes");
        break;
      case 2:
        System.out.println("El dia seleccionado es Martes");
        break;
      case 3:
        System.out.println("El dia seleccionado es Miercoles");
        break;
      case 4:
        System.out.println("El dia seleccionado es Jueves");
        break;
      case 5:
        System.out.println("El dia seleccionado es Viernes");
        break;
      case 6:
        System.out.println("El dia seleccionado es Sabado");
        break;
      case 7:
        System.out.println("El dia seleccionado es Domingo");
        break;
  
      default:
        System.out.println("Escoge un numero del 1-7");
        break;
    }
    sc.close();
  }
}
