package daw1;

public class Gato {
  private String nombre;
  private String imagen;


  public Gato(String nombre, String imagen) {
    this.nombre = nombre;
    this.imagen = imagen;
  }


  public String getNombre() {
    return nombre;
  }


  public String getImagen() {
    return imagen;
  }


  @Override
  public String toString() {
    return "<img src=\"assets/img/" + this.imagen + "\" width=\"80\">Hola soy "
            + this.nombre + "<br>";
  }

  public String maulla() {
    return "<img src=\"assets/img/" + this.imagen + "\" width=\"80\">Miauuu<br>";
  }

  public String come() {
    return "<img src=\"assets/img/" + this.imagen + "\" width=\"80\">Estoy comiendo atun<br>";
  }
  
}
