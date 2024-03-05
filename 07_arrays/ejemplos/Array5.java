public class Array5 {
  public static void main(String[] args) {
    double[] notas = new double[3];
    double suma = 0;
    double media = 0;
    for (int i = 0; i < notas.length; i++) {
      System.out.println("Nota del examen nº " + (i+1) + ": ");
      notas[i]= Double.parseDouble(System.console().readLine());
    }

    System.out.println("Tus notas son: ");
    for (int i = 0; i < notas.length; i++) {
      System.out.print(notas[i] + "\t");
      suma += notas[i];
    }
    media = suma / notas.length;
    System.out.println("\nTu nota media es: " + media);
  }
}
