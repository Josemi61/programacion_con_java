import java.util.Scanner;

public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int cont = 0;
    int suma = 0;
    boolean salida = false;
    while (i >= 0 || salida == true) {
      System.out.print("Introduce un numero: ");
      i = sc.nextInt();
      System.out.println("Quieres seguir: ");
      String a = sc.nextLine();
      if (i > 0) {
        cont++;
        suma = suma + i;
      }
      if (a == "no"){
        salida = false;
      }
    }
    System.out.println("Has metido un total de " + cont + " numeros positivos");
    System.out.println("La suma de ellos es " + suma + " y la media es " + (suma/cont) );
    sc.close();
  }
}
