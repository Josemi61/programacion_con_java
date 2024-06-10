import java.io.BufferedReader;
import java.io.FileReader;

public class T11Ejercicio02 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader ("ficheros/primos.dat"));
      String linea;
      while ((linea = br.readLine()) != null) {
        System.out.println(linea);
      }
      
      br.readLine();
    } catch (Exception e) {
      
    }
    
  }
}
