import java.util.HashMap;
import java.util.Map;

public class T10_Ejercicio19 {

  public static boolean tieneSinonimos (String palabra, HashMap<String, String>sinonimos) {
    for (Map.Entry pareja: sinonimos.entrySet()) {
      if (condition) {
        
      }
    }
    return
  }
  public static void main(String[] args) {
    HashMap<String, String> sinonimos = new HashMap<String, String>();
    String palabra;
    boolean continuar = true;
    sinonimos.put("caliente", "hot");
    sinonimos.put("rojo", "red");
    sinonimos.put("ardiente", "hot");
    sinonimos.put("verde", "green");
    sinonimos.put("agujetas", "stif");
    sinonimos.put("abrasador", "hot");
    sinonimos.put("hierro", "iron");
    sinonimos.put("grande", "big");

    do {

      System.out.print("Introduzca una palabra y le daré los sinónimos: ");
      palabra = System.console().readLine();

      String valor = sinonimos.get(palabra);


      if (!sinonimos.containsKey(palabra)) {
        System.out.print("No conozco esa palabra, ¿quieres añadirla al diccionario? (s/n): ");
        String respuesta = System.console().readLine();
        switch (respuesta) {
          case "s":
            System.out.print("Escribe un sinonimo para " + palabra + ": ");
            String sinonimoPalabra = System.console().readLine();
            sinonimos.put(palabra, sinonimoPalabra);
            System.out.println("Gracias por enseñarme nuevos sinonimos.");
            break;
        
          default:
            break;
        }
      }
      System.out.print("Sinónimos de " + palabra + ": ");
        for (Map.Entry pareja: sinonimos.entrySet()) {
          if ((pareja.getValue()).equals(valor) && (!pareja.getKey().equals(palabra))) {
            System.out.print(pareja.getKey() + " ");
          }
        }
    } while (continuar);
  }
}
