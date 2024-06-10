import java.io.File;

/**
 * Ejemplo08
 */
public class Ejemplo08 {


  public static void listaArchivos(String rutaCarpeta) {
    File carpeta = new File(rutaCarpeta);

    if (carpeta.isDirectory()) {
      File[] lista = carpeta.listFiles();
      for (File f : lista) {
        if (f.isFile()) System.out.println(f.getPath());
          else if (f.isDirectory()) listaArchivos(f.getName());
      }
    }
  }
  public static void main(String[] args) {
    String ruta = ".";
    listaArchivos(ruta);
  }
}