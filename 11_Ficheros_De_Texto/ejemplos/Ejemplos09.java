import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplos09 {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println();
      System.out.println("Asi no es");
      System.exit(0);
    }
    try {
      FileReader archivo = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(archivo);
      String linea = "0";
      int numLineas = -1;
      double suma = 0;

      do {
        linea = br.readLine();
        
        if (linea != null) {
          suma += Double.parseDouble(linea);
          System.out.println(linea);
        }
        numLineas++;
      } while (linea != null);
      System.out.println("Suma: " + suma);
      System.out.println("Media: " + (suma/numLineas));

      br.close();
    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero numeros.txt");
      // fnfe.printStackTrace(); Muestra el error + la traza del mismo
      // System.out.println(fnfe.getMessage()); Muestra solamente el error
    } catch (IOException ioe) {
      System.out.println("No se puede leer el fichero numeros.txt");
      // ioe.printStackTrace();
    }

  }
}
