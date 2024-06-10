import java.io.File;

public class Ejemplo05 {
  public static void main(String[] args) {
    File f = new File(".");
    String[] listaArchivos = f.list();

    for (String nombreArchivos : listaArchivos) {
      System.out.println(nombreArchivos);
    }
  }
}
