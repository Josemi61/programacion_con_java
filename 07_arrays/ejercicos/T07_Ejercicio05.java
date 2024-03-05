public class T07_Ejercicio05 {
  public static void main(String[] args) {
    int[] numero = new int[10];
    int maximo = 0;
    int minimo = 0;
    System.out.println("Introduzca numero entero y pulse intro: ");

    for (int j = 0; j < numero.length; j++) {
      numero[j] = Integer.parseInt(System.console().readLine());

      if (numero[j] > maximo) {
        maximo = numero[j];
      }

      if (numero[j] < minimo) {
        minimo = numero[j];
      }
    }
    for (int i = 0; i < numero.length; i++) {
      System.out.println();
    }
  }
}
