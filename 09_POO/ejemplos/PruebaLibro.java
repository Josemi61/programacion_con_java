/**
 * Contendra el metodo de la calse principal
 * 
 *@author Jose Miguel Toro Canillas
 */
public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Franck Thilliez";
    lib.paginas = 490;

    System.out.println("ISBN: " + lib.titulo);
    System.out.println("Autor: " + lib.autor);
    System.out.println("Numero de paginas: " + lib.paginas);
    System.out.println("Edicion: " + lib.edicion);

  }
}
