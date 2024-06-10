package t10Ejercico18.Gestisimal_Ejer_13;
import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Set;

/**
 * Gestisimal
 */
public class Gestisimal {

  static final int N = 10;
  static Articulo[] almacen = new Articulo[N];

  public static int primeraLibre() {
    for (int i = 0; i < N; i++) {
      if (almacen[i].getCodigo() == null) {
        return i;
      }
    }
    return -1;
  }

  public static boolean codigoExiste(String codigo) {
    for (Articulo articulo : almacen) {
      if (articulo.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }

  public static int posicionArticulo(String codigo) {
    for (int i = 0; i < N; i++) {
      if (almacen[i].getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {

    for (int i = 0; i < N; i++) {
      Gestisimal.almacen[i] = new Articulo();
    }
    String nuevoCodigoIntroducido;
    int opcion;
    String codigoIntroducido;
    String descripcionIntroducido;
    double precioCompraIntroducido;
    double precioVentaIntroducido;
    int stockIntroducido;
    int i;
    
    do {
      System.out.println("Menú");
      System.out.println("---------------------------");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Entrada de mercacia");
      System.out.println("6. Salida de mercancia");
      System.out.println("7. Salir");
      System.out.println("---------------------------");
      System.out.print("Introduzca una opcion: ");
      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1: //Listado
          for (Articulo articulo : almacen) {
            if (articulo.getCodigo() != null) {
              System.out.println(articulo);
            }
          }
          break;

        case 2: //Alta
          if (primeraLibre() == -1) {
            System.out.println("Lo sentimos no queda hueco para registrar articulos.");
          } else {
            System.out.print("Codigo: ");
            codigoIntroducido = System.console().readLine();
            System.out.print("Descripcion: ");
            descripcionIntroducido = System.console().readLine();
            System.out.print("Precion Compra: ");
            precioCompraIntroducido = Double.parseDouble(System.console().readLine());
            System.out.print("Precio Venta: ");
            precioVentaIntroducido = Double.parseDouble(System.console().readLine());
            System.out.print("Stock: ");
            stockIntroducido = Integer.parseInt(System.console().readLine());

            almacen[primeraLibre()] = new Articulo(codigoIntroducido, descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido);
          }
          break;

        case 3: //Baja
          System.out.print("Introduzca el codigo del articulo a eliminar: ");
          codigoIntroducido = System.console().readLine();
          if (!codigoExiste(codigoIntroducido)) {
            System.out.println("Lo siento, el codigo del articulo no existe");
          } else{
            almacen[posicionArticulo(codigoIntroducido)].setCodigo(null);
          }
          break;

        case 4:
        System.out.println("Introduce");
        codigoIntroducido = System.console().readLine();
        if (!codigoExiste(codigoIntroducido)) {
          System.out.println("Lo siento, el codigo del articulo no existe");
        }else{

            System.out.print("Nuevo Codigo: ");
            nuevoCodigoIntroducido = System.console().readLine();
            almacen[posicionArticulo(codigoIntroducido)].setCodigo(nuevoCodigoIntroducido);

            System.out.print("Nueva Descripcion: ");
            descripcionIntroducido = System.console().readLine();
            almacen[posicionArticulo(nuevoCodigoIntroducido)].setDescripcion(descripcionIntroducido);

            System.out.print("Nuevo Precion Compra: ");
            precioCompraIntroducido = Double.parseDouble(System.console().readLine());
            almacen[posicionArticulo(codigoIntroducido)].setPrecioCompra(precioCompraIntroducido);

            System.out.print("Nuevo Precio Venta: ");
            precioVentaIntroducido = Double.parseDouble(System.console().readLine());
            almacen[posicionArticulo(codigoIntroducido)].setPrecioVenta(precioVentaIntroducido);

            System.out.print("Nuevo Stock: ");
            stockIntroducido = Integer.parseInt(System.console().readLine());
            almacen[posicionArticulo(codigoIntroducido)].setStock(stockIntroducido);
        }
          
          break;

        case 5:
        System.out.print("Introduzca el codigo del articulo a eliminar: ");
        codigoIntroducido = System.console().readLine();
        if (!codigoExiste(codigoIntroducido)) {
          System.out.println("Lo siento, el codigo del articulo no existe");
        } else{
          System.out.println("Introduce la cantidad de unidades a introducir: ");
          stockIntroducido = Integer.parseInt(System.console().readLine());
          i = posicionArticulo(codigoIntroducido);
          almacen[i].setStock(stockIntroducido + almacen[i].getStock());
        }
          break;

        case 6:
        System.out.print("Introduzca el codigo del articulo a eliminar: ");
        codigoIntroducido = System.console().readLine();
        if (!codigoExiste(codigoIntroducido)) {
          System.out.println("Lo siento, el codigo del articulo no existe");
        } else{
          System.out.println("Introduce la cantidad de unidades a introducir: ");
          stockIntroducido = Integer.parseInt(System.console().readLine());
          i = posicionArticulo(codigoIntroducido);
          if (almacen[i].getStock() - stockIntroducido >= 0){
            almacen[i].setStock(almacen[i].getStock() - stockIntroducido);
          } else {
            System.out.println("Lo sentimos, no se puede retirar la cantidad solicitada.\nLa cantidad maxima es " + almacen[i].getStock());
          }
        }
          break;

        case 7:
          System.out.println("Adios.");
          break;

        default:
          System.out.println("Opcion incorrecta.");
          break;
      }      
    } while (opcion != 7);
  }
}