package clases;

public class Coleccion {
  private final int TOTAL = 5;
  private int ultimo; //indica la posicion vacia
  private Disco[] coleccion;

  public Coleccion() {
    this.coleccion = new Disco[TOTAL];
    this.ultimo = 0;
  }

  public boolean esLlena() {
    return this.ultimo == TOTAL;
  }

  public boolean esVacia() {
    return this.ultimo == 0;
  }

  private int buscarPosicionDisco(String codigo) {
    int i = 0;
    boolean encontrado = false;

    while (i < TOTAL && (!encontrado)) {
      if (this.coleccion[i] != null && this.coleccion[i].getCodigo().equals(codigo)) {
        encontrado = true;
      } else {
        i++;
      }
    }
    return i;
  }

  public void borrar(String codigo) {
    int posicion = buscarPosicionDisco(codigo);
    if (posicion < TOTAL) {
      this.coleccion[posicion] = null;
      
    }
    if (posicion < this.ultimo) {  
      this.coleccion[posicion] = null;
    }

    if (esLlena()) {
      this.ultimo = posicion;
    }

  }
  public void listar() {
    for (int i = 0; i < this.ultimo; i++) {
      System.out.println(this.coleccion[i]);
    }
  }

  public void guardar(Disco d){
    this.coleccion[this.ultimo] = d;
    //Buscamos una nueva posición vacía para el índice último
    this.ultimo = -1;
    do {
      this.ultimo ++;
    } while ((this.ultimo < TOTAL) && (this.coleccion[this.ultimo] !=null));
  }

  public Disco buscar(String codigo) {
    int posicion = buscarPosicionDisco(codigo);
    return (posicion < TOTAL) ? this.coleccion[posicion] : null;
  }

}
