import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo01
 */
public class Ejemplo01 {

  public static void main(String[] args) {
    try {
      FileReader archivo = new FileReader("C:\\Users\\jmtor\\OneDrive\\Documentos\\1ºGS-Desarrollo de Aplicaciones Web\\Entornos de Desarrollo\\ProyectoGitHub\\prueba.txt");
      BufferedReader br = new BufferedReader(archivo);

      String linea = "";

      do {

        linea = br.readLine();
        System.out.println(linea);

      } while (linea != null);

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero");
      // fnfe.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("Error en la lectura");
      // ioe.printStackTrace();
    }
  }
}