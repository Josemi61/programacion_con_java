package t10Ejercico18;

public class Elemento {
  //Atributos
  private String producto;
  private double precio;
  private int cantidad;
  //Métodos
  public Elemento(String producto, double precio, int cantidad) {
    this.producto = producto;
    this.precio = precio;
    this.cantidad = cantidad;
  }
  @Override
  public String toString() {
    return this.producto 
      + " PVP: " + String.format("%.2f", this.precio) 
      + " Unidades: " + this.cantidad 
      + " Subtotal: " + String.format("%.2f", this.precio * this.cantidad) ;
  }
  public double getPrecio() {
    return precio;
  }
  public int getCantidad() {
    return cantidad;
  }
  public String getProducto() {
    return producto;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((producto == null) ? 0 : producto.hashCode());
    long temp;
    temp = Double.doubleToLongBits(precio);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + cantidad;
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Elemento aux = (Elemento) obj;
    if (!this.producto.equals(aux.getProducto())) {
      return false;
    }
    return true;
  }
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
  
}