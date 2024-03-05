import java.util.HashMap;
import java.util.Map;

public class Ejemplo1 {

  public static void main(String[] args) {
    MashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Nuñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vazquez");
    m.put(219, "Victor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito");
    m.put(111, "Cindy Nero");

    System.out.println("Los elementos de m utilizando entrySet son: \n" + m.entrySet());
    System.out.println("\nEntradas del diccionario extraidas de una a una: ");
    for (int clave : m.entrySet()) {
      ;
    }
  }
}