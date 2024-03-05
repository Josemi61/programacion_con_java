package matematicas;
import java.util.Scanner;

public class PruebasFinciones {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n;
    System.out.println("Introduzca un numero entero positivo: ");
    n = sc.nextInt();
    if (Varias.esPrimo(n)) {
      System.out.println("El numero " + n + " es primo.");
    }else{
      System.out.println("El numero " + n + " no es primo.");
    }
    System.out.println("Introduzca un numero entero positivo: ");
    n = sc.nextInt();
    int numDigitos = Varias.digitos(n);
    System.out.println(n + " tiene " + numDigitos + " digitos.");
    double r;
    double h;
    System.out.println("Introduce el radio del cilindro.");
    r = sc.nextDouble();
    System.out.println("Introduce la altura del cilindro.");
    h = sc.nextDouble();

    System.out.println("El volumen del cilindro es " + Volumen.volumenCilindro(r, h) + "cm^3");

    System.out.print("Introduzca un numero para voltear: ");
    long x = sc.nextLong();
    System.out.println("El numero " + x + " volteado es: " + Varias.voltea(x));
    sc.close();
  }
}
