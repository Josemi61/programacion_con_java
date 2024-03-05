import java.util.Scanner;

public class HistoriamaHorizontal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cifraIntroducida = 0;
    long numeroCompleto = 0;
    long numeroVolteado = 0;
    int digito = 0;
    int digitoMayor = 0;
    int numeroDigitos = 0;

    System.out.println("Introduce numeros entre el 0 y 9 y pulse INTRO. Introduce un numrero negativo si desea parar.");
    do {
      cifraIntroducida = sc.nextInt();
      if (cifraIntroducida >= 0 && cifraIntroducida <= 9) {
        numeroCompleto = (numeroCompleto * 10) + cifraIntroducida;
      }
    } while (cifraIntroducida >= 0 && cifraIntroducida <=9);
    while (numeroCompleto > 0) {
      digito = (int)(numeroCompleto % 10);
      if (digito > digitoMayor) {
        digitoMayor = digito;
      }
      numeroVolteado = (numeroVolteado * 10) + digito;
      numeroCompleto /= 10;
      numeroDigitos ++;
    }

    int nuemroColumnas = digitoMayor + 1;
    int numeroFilas = numeroDigitos;

    for (int i = 1; i < nuemroColumnas; i++) {
      System.out.print(" ---");
    }

    for (int i = 0; i < numeroFilas; i++) {
      System.out.println();
      digito = (int) (numeroVolteado % 10);
      System.out.print("| " + digito + " |");
      for (int j = 0; j < digitoMayor; j++) {
        System.out.print("   |");
      }
      System.out.println();
      for (int j = 0; j < nuemroColumnas; j++) {
        System.out.print(" ---");
      }
    }
    sc.close();
  }
}
