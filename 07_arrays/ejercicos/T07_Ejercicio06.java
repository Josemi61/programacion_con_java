public class T07_Ejercicio06 {
  public static void main(String[] args) {
    int[] numero =  new int[5];
    System.out.println("Introduzca los numeros enteros y pulse INTRO:");
    for (int i = 0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());   
    }

    for (int i : numero) {
      System.out.printf("%3d", i);
    }
    System.out.println();;
    int aux = numero[4];
    for (int i = numero.length - 1; i > 0; i--){
      numero[i] = numero [i -1];
    }
    numero[0] = aux;

    for (int i : numero){
      System.out.printf("%3d", i);
    }
  }
}
