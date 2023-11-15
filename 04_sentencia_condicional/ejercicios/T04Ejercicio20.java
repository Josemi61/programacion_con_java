import java.util.Scanner;

public class T04Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    boolean capicua = false;

    System.out.print("Introduzca un n (como maximo de 5 cifras): ");
    n = sc.nextInt();
    if (n < 10) {
      capicua = true;
    }
    if (n >= 10 && n < 100) {
      if (n / 10 == n % 10) {
        capicua = true;
      }
    }
    if (n >= 100 && n < 1000) {
      if (n % 10 == n / 100) {
        capicua = true;
      }
    }
    if (n >= 1000 && n < 10000) {
      if (((n / 1000) == (n % 10)) && (((n / 100) % 10) == ((n % 100) / 10))) {
        capicua = true;
      }
    }
    if (n >= 10000 && n < 100000) {
      if (((n / 10000) == (n % 10)) && ((n / 1000) % 10) == ((n % 100) / 10)) {
        capicua = true;
      }
    }

    
    if (capicua) {  //if (capicua) == if (capicua = true)
      System.out.println("El numero " + n + " es capicua." );
    }else{
      System.out.println("El numero " + n + " no es capicuo.");
    }
    sc.close();
  }
}
// 6 cifras (n/100000)%10
// 5 cifras (n/10000)%10
// 4 cifras (n/1000)%10
// 3 cifras (n/100)%10
// 2 cifras (n/10)%10
// 1 cifras (n/1)%10

