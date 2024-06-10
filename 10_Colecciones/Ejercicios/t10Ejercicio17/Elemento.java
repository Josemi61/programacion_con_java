package t10Ejercicio17;

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
   
  
}