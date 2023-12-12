import java.util.Scanner;

public class T05Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base;
    int expo;
    int cont = 1;
    System.out.print("Introduce la base y el exponente separados por espacios: ");
    base = sc.nextInt();
    expo = sc.nextInt();
    for (int i = 0; i < expo; i++) {
      
      if (i == 0) {
        System.out.println(base + "^" + i + " = 1" );
      }else {
        cont *= base;
        System.out.println(base + "^" + i + " = " + cont);
      }
      
      
    }
    
    
    
    System.out.println();
    sc.close();
  }
}
