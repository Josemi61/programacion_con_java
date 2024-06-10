package Gestisimal;


public class AppGestisimal {
  static final int TOTAL = 10;
  static Articulo[] articulo = new Articulo[TOTAL];

  private static int buscarPosicion(int codigo) {
    int x = 0;
    for (int i = 0; i < TOTAL; i++) {
      if (articulo[i].getCodigo() == codigo) {
        x = i;
      }
    }
    return x;
  }

  private static boolean existeCodigo(int codigo) {
    boolean resultado = false;
    for (int i = 0; i < articulo.length; i++) {
      if (articulo[i].getCodigo() == codigo) {
        resultado = true;
        break;
      }else {
        resultado = false;
      }
    }
    return resultado;
  }
  
  public static void main(String[] args) {

    

    int opcion;

    // int primeraLibre = 0;

    int codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;

    int nuevocodigo = 0;
    String nuevadescripcion;
    double nunevoprecioCompra;
    double nuevoprecioVenta;
    int nuevostock;


    boolean valido = false;
    
    

    for (int i = 0; i < TOTAL; i++) {
      articulo[i] = new Articulo(0, null, 0, 0, 0);
    }

    do {
      System.out.println("\n\nG E S T I S I M A L");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");

      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {

        //Listado
        case 1:
          for (int i = 0; i < TOTAL; i++) {
            if (articulo[i].getCodigo() != 0) {
              System.out.println(articulo[i]);
            }
          }
          break;
        
        //Alta
        case 2:
          int primeraLibre = -1;
          do {
            primeraLibre++;
          } while (primeraLibre < TOTAL && articulo[primeraLibre].getCodigo() != 0);

          if (primeraLibre == TOTAL) {
            System.out.println("Lo siento, no hay mas hueco en el almacen para dar del alta.");
          } else {
            //Comprobamos si el codigo existe y si no, pedimos datos
            do {
              System.out.print("Introduce el codido del articulo: ");
              codigo = Integer.parseInt(System.console().readLine());
    
              
              for (int i = 0; i < TOTAL; i++) {
                if (articulo[i].getCodigo() != codigo) {
                  valido = true;
                } else {
                  valido = false;
                }
              }
    
              if (valido) {
                System.out.print("Introduzca la descripción del articulo: ");
                descripcion = System.console().readLine();
                System.out.print("Introduzca el precio de compra del articulo: ");
                precioCompra = Double.parseDouble(System.console().readLine());
                System.out.print("Introduzca el precion de venta del articulo: ");
                precioVenta = Double.parseDouble(System.console().readLine());
                System.out.print("Introduzca el stock del articulo: ");
                stock = Integer.parseInt(System.console().readLine());
  
                articulo[primeraLibre] = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
  
              } else {
                System.out.println("Este codigo ya esta en uso.");
              }
            } while (!valido);
            
            
          }
          // for (int i = 0; i < TOTAL; i++) {
          //   if (articulo[i].getCodigo() == 0) {
          //     primeraLibre = i;
          //     break;
          //   } else {
          //     primeraLibre = -1;
          //   } 
          // }

          // if (primeraLibre == -1) {
          //   System.out.println("Lo siento, no hay mas hueco en el almacen para dar del alta.");
          // }
          
          

          break;
        
        // Baja
        case 3:
          System.out.print("Introduce el codido del articulo que quiere dar de baja: ");
          codigo = Integer.parseInt(System.console().readLine());

          for (int i = 0; i < TOTAL; i++) {
            if (articulo[i].getCodigo() == codigo) {
              articulo[i].setCodigo(0);
            }
          }
          break;

        // Modificación
        case 4:
          

          do {
            System.out.print("Intoduce el codigo del articulo que desee modificar: ");
            codigo = Integer.parseInt(System.console().readLine());
            valido = false;
            for (int i = 0; i < TOTAL; i++) {
              if (articulo[i].getCodigo() == codigo) {
                System.out.print("Introduzca el nuevo codigo del articulo: ");
                nuevocodigo = Integer.parseInt(System.console().readLine());
                  if (existeCodigo(nuevocodigo)) {
                    valido = false;
                    System.out.println("Este nuevo codigo no sirve ya que se repite con otro articulo del almacen.");
                    break;
                  } else {
                    valido = true;
                  }
                }
            }
            
            if (valido) {

              int x = buscarPosicion(codigo);

              System.out.println("Antigua descripción: " + articulo[x].getDescripcion());
              System.out.println("Nueva descripción: ");
              nuevadescripcion = System.console().readLine();
              System.out.println("Antiguo precio de compra: " + articulo[x].getPrecioCompra());
              System.out.println("Nuevo precio de compra: ");
              nunevoprecioCompra = Double.parseDouble(System.console().readLine());
              System.out.println("Antiguo precio de venta: " + articulo[x].getPrecioVenta());
              System.out.println("Nuevo precio de venta: ");
              nuevoprecioVenta = Double.parseDouble(System.console().readLine());
              System.out.println("Antiguo stock: " + articulo[x].getStock());
              System.out.println("Nuevo stock: ");
              nuevostock = Integer.parseInt(System.console().readLine());
              //hacer codigo existe.
              articulo[x].setCodigo(nuevocodigo);
              articulo[x].setDescripcion(nuevadescripcion);
              articulo[x].setPrecioCompra(nunevoprecioCompra);
              articulo[x].setPrecioVenta(nuevoprecioVenta);
              articulo[x].setStock(nuevostock);
            }
          } while (!valido);

          break;
        
        case 5:
          
          do {
            valido = false;
            System.out.print("Introduzca el codigo del articulo al que le vas a meter mercancia: ");
            codigo = Integer.parseInt(System.console().readLine());
            for (int i = 0; i < TOTAL; i++) {
              if (articulo[i].getCodigo() == codigo) {
                System.out.print("¿Cuanta mercandia vas a meter?: ");
                nuevostock = Integer.parseInt(System.console().readLine());
                articulo[i].setStock(nuevostock + articulo[i].getStock()); 
                valido = true;
              }
              
            }
            if (!existeCodigo(codigo)) {
                System.out.println("Este codigo no existe");
              }
          } while (!valido);
          break;
        
        case 6:
          do {
            valido = false;
            System.out.print("Introduzca el codigo del articulo del que vas a sacar mercancia: ");
            codigo = Integer.parseInt(System.console().readLine());
            for (int i = 0; i < TOTAL; i++) {
              if (articulo[i].getCodigo() == codigo) {
                System.out.print("¿Cuanta mercandia vas a sacar?: ");
                nuevostock = Integer.parseInt(System.console().readLine());
                if (nuevostock <= articulo[i].getStock()) {
                  articulo[i].setStock(articulo[i].getStock() - nuevostock); 
                  valido = true;
                }
                
              }
              
            }
            if (!existeCodigo(codigo)) {
                System.out.println("Este codigo no existe");
              }
          } while (!valido);
          break;
      
        default:
          break;
      }

    } while (opcion != 7);
  }
}
