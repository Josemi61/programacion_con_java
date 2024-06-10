package clases;

public class Perro extends Mascota{

  private static int totalPerros = 0;

  private String raza;

  public Perro(String chip){
    super(chip);
    totalPerros++;
  }



  public Perro(String chip, String nombre) {
    super(chip, nombre);
    totalPerros++;
  }

  public void ladra() {
    System.out.println("¡Guau! ¡Guau!");
  }

  public void gruñir() {
    System.out.println("Grrrrrr...");
  }

  public static int getTotalPerros() {
    return totalPerros;
  }



  @Override
  public void vacunar() {
    if (estavacunado()) {
      System.out.println(super.getNombre() + "se encuentra vacunado");
    }else {
      super.setVacunada(true);
      System.out.println("Argg..");
    }
  }



  @Override
  public void pasear() {
    if (estavacunado()) {
      ladra();
    } else {
      System.out.println(super.getNombre() + "no puede pasear hasta no estar vacunado/a");
    }
  }



  public String getRaza() {
    return raza;
  }



  public void setRaza(String raza) {
    this.raza = raza;
  }

  

}
