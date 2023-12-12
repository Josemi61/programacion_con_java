import java.util.Scanner;

public class T05Ejercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero, para ver si es primo: ");
    int num = sc.nextInt();
    int cont = 0;
    for (int i = 1; i <= num; i++) {
      if (num%i == 0) {
        cont++;
      }
    }
    if (cont == 2) {
      System.out.println("El numero " + num + " es primo.");
    }else{
      System.out.println("El numero introducido no es primo.");
    }
    sc.close();
  }
}
