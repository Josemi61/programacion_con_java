import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EjercicioClase1 {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("ficheros/fruta.txt"));
      ArrayList<String> mostrar = new ArrayList<String>();

      String linea = br.readLine();

      while (linea != null) {
        mostrar.add(linea);
        linea = br.readLine();
      }

      for (String string : mostrar) {
        System.out.println(string);
      }

      
      br.close();
    } catch (IOException ioe) {
      System.out.println("No es posible realizar la escritura de los números");
    }
  }
}