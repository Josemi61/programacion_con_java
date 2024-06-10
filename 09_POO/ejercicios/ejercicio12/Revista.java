package ejercicio12;

public class Revista extends Publicacion{

  private int num;

  public Revista(String isbn, String titulo, int anio, int num) {
    super(isbn, titulo, anio);
    this.num = num;
  }

  
  //No tenemos  que sobrecargar el metodo toString porque vamos a usar el del padre.
  
  
}
