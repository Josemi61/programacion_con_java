/**
 * Explica tu código aquí
 * 
 *@author Jose Miguel Toro Canillas
 */
public class Coche {
  //////////Atributos
  String matricula;
  String marca;
  String modelo;
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {
    Coche miCoche = new Coche(); //Coche 1
    Coche tuCoche = new Coche(); //Coche 2
    miCoche.matricula = "1234ABC";
    System.out.println("Matricula del coche 1: " + miCoche.matricula);
    System.out.println("Potencia coche 1: " + miCoche.potencia);
    System.out.println("Matricula coche 2: " + tuCoche.matricula);
    System.out.println("Potencia coche 2: " + tuCoche.potencia);
  }
}