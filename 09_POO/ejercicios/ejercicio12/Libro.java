package ejercicio12;

public class Libro extends Publicacion implements Prestable{

  private boolean prestado;

  public Libro(String isbn, String titulo, int anio) {
    super(isbn, titulo, anio);
    this.prestado = false;
  }


  @Override
  public void presta() {
    if (this.prestado) {
      System.out.println("Lo siento, este libro esta prestado");
    } else {
      this.prestado = true; //Si no esta prestado lo presto
    }
    
  }
    @Override
    public void devuelve() {
      this.prestado = false;
    }


  @Override
  public boolean estaPrestado() {
    
    return this.prestado;
  }
  
  @Override
  public String toString() {
    return super.toString() + " (" + (this.prestado ? "prestado)" : "no prestado)");
  }
  
}
