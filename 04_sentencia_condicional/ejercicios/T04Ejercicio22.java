import java.util.Scanner;

public class T04Ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int MINUTOSTOTALES = ((4*24*60) + (15*60));
    int diastranscurridos = 0;
    System.out.print("Introduz un dia de la semana (de lunes a viernes): ");
    String dia = sc.nextLine();
    switch (dia) {
      case "lunes":
        diastranscurridos = 0;
        break;
      case "martes":
      diastranscurridos = 1;
        break;
      case "miercoles":
      diastranscurridos = 2;
        break;
      case "jueves":
      diastranscurridos =3;
        break;
      case "viernes":
      diastranscurridos = 4;
        break;
    
      default:
        break;
    }
    System.out.print("Introdduce la hora: ");
    int hora = sc.nextInt();
    System.out.print("Introdduce los minutos: ");
    int minutos = sc.nextInt();
    int minutosTranscurridos = (diastranscurridos* 24 * 60) + (hora * 60) + minutos;
    System.out.println("Faltan " + (MINUTOSTOTALES - minutosTranscurridos) + " minutos para llegar al fin de semana");
    sc.close();
  }
}
