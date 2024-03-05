public class Mamifero extends Animal{
  
  private int numMamas;
  private int numCrias;

  public Mamifero(String nombre, int edad, String naturaleza, int numMamas, int numCrias) {
    super(nombre, edad, naturaleza);
    this.numMamas = numMamas;
    this.numCrias = numCrias;
  }

  public int getNumMamas() {
    return numMamas;
  }

  public int getNumCrias() {
    return numCrias;
  }

  
  
}
