import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Ejercicio 1
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Jose Miguel Toro
 */
public class T11Ejercicio01 {
  public static boolean esPrimo(int numero) {
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        return false;
      }
    }
    return true;
  }
    
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/primos.dat"));
      for (int i = 1; i <= 501; i++) {
        if (esPrimo(i)) {
          bw.write("El número " + i + " es primo\n");
        }
      }
      bw.close();
      System.out.println("Se han escrito correctamente los números en el fichero \"ficheros/primos.dat\"");
    } catch (IOException ioe) {
      System.out.println("No es posible realizar la escritura de los números");
    }
  }
}