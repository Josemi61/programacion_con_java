import java.util.Scanner;

public class Ejemplo06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    int i = 0;
    do {
      System.out.print("Escribe un numero: ");
      i = sc.nextInt();
    } while (i% 2 == 0);
    sc.close();
  }
}
