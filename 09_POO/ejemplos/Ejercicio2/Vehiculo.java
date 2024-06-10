package Ejercicio2;
public class Vehiculo {

  //Atributos de clase
  private static int vehiculosCreados = 0;
  private static int vehiculosTotales = 0;

  //Atributo de la instancia
  private int kilometrosRecorridos;

  //Constructor
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
    this.vehiculosCreados++;
  }

  //Metodos - Getters

  public static int getVehiculosTotales() {
    return vehiculosTotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }


  //Kilometros que va andar el vehiculo
  public void andar (int km) {
    this.kilometrosRecorridos += km;
    vehiculosTotales += km;
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }
  
  
}
