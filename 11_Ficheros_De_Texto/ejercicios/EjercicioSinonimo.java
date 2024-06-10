import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se
   proporciona a continuación. El programa preguntará una palabra y dará una
   lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si
   se introduce la palabra “caliente”, el programa dará como resultado: ardiente,
   candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de
   “caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”,
   “hot”), por tanto solo tendrá que buscar las palabras en español que también
   signifiquen “hot”; esta información estará en las entradas (“ardiente”, “hot”) y
   (“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene
   sinónimos, debe mostrar el mensaje “No conozco sinónimos de esa palabra”.
   Si una palabra no está en el diccionario se mostrará el mensaje “No conozco
   esa palabra”. El usuario sale del programa escribiendo la palabra “salir”.
 * 
 * @author Christian Rodríguez Lara
 */
public class EjercicioSinonimo {
  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<String, String>();
    diccionario.put("caliente", "hot");
    diccionario.put("rojo", "red");
    diccionario.put("ardiente", "hot");
    diccionario.put("verde", "green");
    diccionario.put("agujetas", "stiff");
    diccionario.put("abrasador", "hot");
    diccionario.put("hierro", "iron");
    diccionario.put("grande", "big");

    String palabraSolicitada;
    boolean salir = false;
    int i = 0;
    do {
      System.out.print("Introduce una palabra: ");
      palabraSolicitada = System.console().readLine();

      if (palabraSolicitada.equalsIgnoreCase("salir")) {
        salir = true;
      } else if (!diccionario.containsKey(palabraSolicitada)) {
        System.out.println("Losiento, no conozco esa palabra.");
      } else {
        diccionario.get(palabraSolicitada); //Encuentro el valor de la clave
        System.out.print("Sinónimos de " + palabraSolicitada + ": ");
    
        for (Map.Entry entry: diccionario.entrySet()) {
          if (entry.getValue().equals(diccionario.get(palabraSolicitada)) && !entry.getKey().equals(palabraSolicitada)) {
            System.out.print(entry.getKey() + " ");
            i++;
          }   
        } 
      } System.out.println();
      if (i == 0 && diccionario.containsKey(palabraSolicitada)) {
        System.out.println("Losiento, la palabra " + palabraSolicitada + " no tiene sinónimos");
      }
    } while (!salir);
    
  }
}