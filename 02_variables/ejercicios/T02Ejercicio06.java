public class T02Ejercicio06 {
  public static void main(String[] args) {
    double precio = 34.56;
    double iva = precio * 0.21;
    System.out.printf("Precio sin IVA %8.2f\n", precio);
    System.out.printf("Precio con IVA es %8.2f\n", (precio + iva));
  }
}
