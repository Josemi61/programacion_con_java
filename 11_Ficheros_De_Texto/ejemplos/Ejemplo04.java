import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ejemplo04 {
  public static void crearLineas (String nombreArchivo, int n) {
    try {

      BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));

      for (int i = 1; i <= n; i++) {
        bw.write("Esta es la linea nº: " + i);
        bw.newLine();
      }

      bw.close();
    } catch (Exception ioe) {
      System.out.println("No se ha podido escribir en el fichero.");
    }
  }
  public static void main(String[] args) {
    
    System.out.print("Escribe el nombre del archivo: ");
    String nombreArchivo = System.console().readLine();

    System.out.print("Escribe un numero por pantalla: ");
    int n = Integer.parseInt(System.console().readLine());

    crearLineas(nombreArchivo, n);
  }
}
