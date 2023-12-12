import java.util.Scanner;

public class T05Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int contp = 0;
    int contn = 0;
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      num = sc.nextInt();
      if (num > 0) {
        contp ++;
      }else if (num < 0) {
        contn++;
      }
    }
    System.out.println("Hay " + contp + " numero positivos" + " y " + contn + " numeros negativos.");
    sc.close();
  }
}
