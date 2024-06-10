package modules;

public class Fruta {
  private String id;
  private String nombre;
  private final String EXTENSION = ".jpg";

  public Fruta(String nombre) {
    this.nombre = nombre;
  }
  public Fruta(String id, String nombre) {
    this.nombre = nombre;
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public String toString() {
    return "<img src=\"./assets/img/img_" + this.id
            + EXTENSION + "\" />";
  }
  
}
