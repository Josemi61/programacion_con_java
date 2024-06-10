import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo01
 */
public class Ejemplo02 {

  public static void main(String[] args) {
    try {
      FileReader archivo = new FileReader("numeros.txt");
      BufferedReader br = new BufferedReader(archivo);

      String linea = "0";
      int numLineas = -1;
      double suma = 0;
      do {
        suma += Double.parseDouble(linea);
        linea = br.readLine();
        
        if (linea!=null) {
          System.out.println(linea);
        }
        numLineas ++;
      } while (linea != null);

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero");
      System.out.println(fnfe.getMessage());
      // fnfe.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("Error en la lectura");
      System.out.println(ioe.getMessage());
      // ioe.printStackTrace();
    }
  }
}