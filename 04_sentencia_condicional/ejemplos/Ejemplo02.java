import java.util.Scanner;

public class Ejemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Escribe un numero entre el 1 y el 100: ");
    numero = sc.nextInt();
    if ((numero <=100) && (numero >=1)) {
      System.out.println("El numero esta entre los valores establecidos");
    } else{
      System.out.println("Te he dicho un valor entre el 1 y el 100");
    }
    sc.close();
  }
}
