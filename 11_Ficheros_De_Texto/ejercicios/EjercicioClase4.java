import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class EjercicioClase4 {
  public static void main(String[] args) {
    try {
      BufferedReader br1 = new BufferedReader(new FileReader("./ficheros/clave.txt"));
      BufferedReader br2 = new BufferedReader(new FileReader("./ficheros/valor.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter("./ficheros/mezclaClaveValor.txt"));
      HashMap<String, String>diccionario = new HashMap<String, String>();

      String linea1 = br1.readLine();
      String linea2 = br2.readLine();
      int opciones;
      String clave;
      String valor;
      Boolean salir = false;

      while (linea1 != null || linea2 != null) {
        diccionario.put(linea1, linea2);
        linea1 = br1.readLine();
        linea2 = br2.readLine();
      }
      
      do {
        System.out.println("¿ Desea Realizar Alguna Modificación En El Diccionario ?");
        System.out.println("--------------------------------------------------------");
        System.out.println("1. Añadir");
        System.out.println("2. Listar");
        System.out.println("3. Cambiar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        System.out.print("Opción: ");
        opciones = Integer.parseInt(System.console().readLine());
  
        switch (opciones) {
          case 1:
            System.out.println("Introduzca la clave-valor que desea introducir en el diccionario");
            System.out.print("Clave: ");
            clave = System.console().readLine();
            do {
              if (diccionario.containsKey(clave)) {
                System.out.println("No pueden existir dos claves iguales.");
                System.out.println("Introduce una nueva clave válida: ");
                clave = System.console().readLine();
              }
            } while (diccionario.containsKey(clave));
            System.out.print("Valor: ");
            valor = System.console().readLine();
            diccionario.put(clave, valor);
            break;
          case 2:
            System.out.print("Diccionario: \n");
            for (String pantalla : diccionario.keySet()) {
              valor = diccionario.get(pantalla);
              System.out.println("Clave: " + pantalla + " - Valor: " + valor);
            }
            break;
          case 3:
            System.out.print("Introduce la clave a la que desea cambiar el valor: ");
            clave = System.console().readLine();
            if (!diccionario.containsKey(clave)) {
              System.out.println("No se puede editar una clave inexistente.");
            } else {
              System.out.print("Introduce el nuevo valor para la clave " + clave + ": ");
              valor = System.console().readLine();
              diccionario.put(clave, valor);
            } 
            break;
          case 4:
            System.out.println("Introduce el nombre de la clave que desea borrar: ");
            clave = System.console().readLine();
            diccionario.remove(clave);
            break;
          case 5:
            for (Map.Entry<String, String> entry : diccionario.entrySet()) {
              bw.write(entry.getKey() + " - " + entry.getValue());
              bw.newLine();
            }
            System.out.println("Archivo escrito satisfactoriamente.");
            salir = true;
            break;
          default:
            System.out.println("Introduce una opción correcta la próxima vez.");
            break;
        }
      } while (!salir);

      br1.close();
      br2.close();
      bw.close();
    } catch (IOException ioe) {
      System.out.println("Error al leer el archivo: " + ioe.getMessage());
    }
  }
}
