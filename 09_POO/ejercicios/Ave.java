public class Ave extends Animal{
  
  private int numPlumas;
  private String colorPlumas;
  
  public Ave(String nombre, int edad, String naturaleza, int numPlumas, String colorPlumas) {
    super(nombre, edad, naturaleza);
    this.numPlumas = numPlumas;
    this.colorPlumas = colorPlumas;
  }

  public int getNumPlumas() {
    return numPlumas;
  }

  public String getColorPlumas() {
    return colorPlumas;
  }

  
}
