import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ejemplo03 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fruta.txt", true));

      bw.write("fresa");
      bw.newLine();
      bw.write("mango");
      bw.newLine();
      bw.write("nispero\n");

      bw.close();
    } catch (Exception ioe) {
      System.out.println("No se ha podido escribir en el fichero.");
      // TODO: handle exception
    }
  }
}
