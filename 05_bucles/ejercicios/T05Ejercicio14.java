import java.util.Scanner;

public class T05Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base;
    int expo;
    int cont = 1;
    System.out.print("Introduce la base y el exponente separados por espacios: ");
    base = sc.nextInt();
    expo = sc.nextInt();
    for (int i = 1; i <= expo; i++) {
      cont *= base;
    }
    
    System.out.println(base + "^" + expo + " = " + cont );
    
    System.out.println();
    sc.close();
  }
}
