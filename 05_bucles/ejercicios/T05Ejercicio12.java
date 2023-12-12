import java.util.Scanner;

public class T05Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = 0;
    int num2 = 1;
    int nuevo = 0;
    int fin;
    System.out.print("Dime cuantos numeros de la serie de Fibonacci quieres que se muestren: ");
    fin = sc.nextInt();
    for (int cont = 0; cont < fin; cont ++) {
      if (cont == 0) {
        System.out.print(num1 + ", " + num2 + ", ");
        cont = cont + 2;
      }
      nuevo = num1 + num2;

      if (cont == (fin-1)) {
        System.out.print(nuevo + ".");
      }else{
        System.out.print(nuevo + ", ");
      }

      num1 = num2;
      num2 = nuevo;
    }

    sc.close();
  }
}
