import java.util.ArrayList;
import java.util.HashMap;

public class T10Ejercicio14 {
  public static void main(String[] args) {

    //Productos Disponibles
    HashMap<String, Double> productosDisponibles = new HashMap<String, Double>();
    productosDisponibles.put("avena", 2.21);
    productosDisponibles.put("garbanzos", 2.39);
    productosDisponibles.put("tomate", 1.59);
    productosDisponibles.put("jengibre", 3.13);
    productosDisponibles.put("quinoa", 4.5);
    productosDisponibles.put("guisantes", 1.6);

    ArrayList<String> listadoProductos = new ArrayList<String>();
    ArrayList<Integer> listadoCantidades = new ArrayList<Integer>();
    boolean continuar = true;
    String productoIntroducido;
    int cantidadIntroducida;
    double total = 0;
    do {
      System.out.print("Producto: ");
      productoIntroducido = System.console().readLine();
      
      if (!productoIntroducido.equalsIgnoreCase("fin")) {
        System.out.print("Cantidad: ");
        cantidadIntroducida = Integer.parseInt(System.console().readLine());
        listadoCantidades.add(cantidadIntroducida);
        listadoProductos.add(productoIntroducido);
      } else {
        continuar = false;
      }
    } while (continuar);

    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");
    for (int i = 0; i < listadoProductos.size(); i++) {
      String producto = listadoProductos.get(i);
      double precio = productosDisponibles.get(producto);
      int cantidad = listadoCantidades.get(i);
      double subtotal = precio * cantidad;
      total += subtotal;
      System.out.printf("%-8s %-7.2f %5d %10.2f\n", producto, precio, cantidad, subtotal);
    }
    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %7.2f €",  total);
  }
}
