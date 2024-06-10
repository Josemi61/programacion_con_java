import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class EjercicioClase2 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("./ficheros/clave-valor.txt"));
      HashMap<String, String> diccionario = new HashMap<String, String>();

      String linea;
    
      while ((linea = br.readLine()) != null) {
        String[] palabras = linea.split("-");
        diccionario.put(palabras[0], palabras[1]);

      }

      for (String pantalla : diccionario.keySet()) {
        String valor = diccionario.get(pantalla);
        System.out.println("Llave: " + pantalla + " - Valor: " + valor);
      }  

      br.close();
    } catch (IOException ioe) {
      System.out.println("Error al leer el archivo: " + ioe.getMessage());
    }
  }
}
