import java.util.Scanner;

public class T05Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Introduce un numero: ");
    num = sc.nextInt();
    for (int i = 0; i <5; i++) {
      System.out.printf("%d \t %d \t %d \n",num ,(num*num) ,(num*num*num));
      num ++;
    }
    sc.close();
  }
}
