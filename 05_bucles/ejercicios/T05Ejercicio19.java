import java.util.Scanner;

public class T05Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroVolteado = 0;
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = sc.nextInt();
    sc.close();
    int copiaNumero = Math.abs(numeroIntroducido);
    //Obtenemos la cifra de las unidades, decenas, centenas...del resto de dividir por 10
    while (copiaNumero > 0) {
      numeroVolteado = (copiaNumero % 10) + (numeroVolteado * 10);
      copiaNumero /= 10;
    }

    if (numeroIntroducido > 0) {
      System.out.println("El numero " + numeroIntroducido + " volteado es " + numeroVolteado + ".");
    } else {
      System.out.println("El numero " + numeroIntroducido + " volteado es -" + numeroVolteado + ".");
    }
  }
}
