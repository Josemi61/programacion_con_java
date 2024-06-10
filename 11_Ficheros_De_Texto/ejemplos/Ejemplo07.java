import java.io.File;

public class Ejemplo07 {

  public static void listaArchivos (String rutaCarpeta) {
    File carpeta = new File(rutaCarpeta);
    if (carpeta.isDirectory()) {
      File[] lista = carpeta.listFiles();
      for (File f : lista) {
        if (f.isFile()) {
          System.out.println(f.getName() + "\t Tamaño (bytes): " + f.length());
        }
      }
    } else {
      System.out.println("El fichero " + rutaCarpeta + " no es una carpeta.");
    }
  }

  public static void main(String[] args) {
    String ruta = "ficheros";
    listaArchivos(ruta);
  }
}
