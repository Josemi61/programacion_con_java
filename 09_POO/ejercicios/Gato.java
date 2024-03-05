public class Gato extends Mamifero{
  
  private String pelaje;
  private String raza;


  public Gato(String nombre, int edad, String naturaleza, int numMamas, int numCrias, String pelaje, String raza) {
    super(nombre, edad, naturaleza, numMamas, numCrias);
    this.pelaje = pelaje;
    this.raza = raza;
  }


  public String getPelaje() {
    return pelaje;
  }


  public String getRaza() {
    return raza;
  }

  
}
