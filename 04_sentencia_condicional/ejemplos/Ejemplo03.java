import java.util.Scanner;

public class Ejemplo03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int semana;

    System.out.print("Introduce un dia de la semana con numeros: ");
    semana = sc.nextInt();
    switch (semana) {
      case 1,2,3,4,5:
        System.out.println("Es un dia entre semana");
        break;
      case 6,7:
        System.out.println("Es fin de semana");
        break;
      default:
        System.out.println("Ese numero no es un dia de la semana");
        break;
    }
    sc.close();
  }
}
