import java.util.Scanner;

public class Ejemplo04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int edad;
    System.out.print("Introduce tu edad: ");
    edad = sc.nextInt();
    if ((edad < 18) && (edad >= 1)) {
      System.out.println("Eres menor de edad");
    } else if ((edad >= 18) && (edad < 65 )) {
      System.out.println("Eres mayor de edad");
    } else {
      System.out.println("Estas jubilado o muerto");
    }
    sc.close();
  }
}
