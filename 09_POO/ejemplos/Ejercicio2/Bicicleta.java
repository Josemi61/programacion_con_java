package Ejercicio2;
public class Bicicleta extends Vehiculo{
  //Atributos
  private int pinones;

  //Contructores
  public Bicicleta() {
    super(); //Llamo al contructor padre
  }

  public Bicicleta(int p) {
    super(); //Llamo al contructor padre
    this.pinones = p;
  }

  public void hacerCaballito(){
    System.out.println("Caballitoooo!!!!!!!!");
  }
}
