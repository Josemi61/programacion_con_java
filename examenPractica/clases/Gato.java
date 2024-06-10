package clases;

public class Gato extends Mascota{
  private static int totalGatos = 0;

  private String pelaje;

  public Gato(String chip){
    super(chip);
    totalGatos++;
  }



  public Gato(String chip, String nombre) {
    super(chip, nombre);
    totalGatos++;
  }

  public void maulla() {
    System.out.println("¡Miaaaaaaauuuuuuuu! ¡Brrrrr...!");
  }

  public void bufar() {
    System.out.println("Fuuuuu...");
  }


  public static int getTotalGatos() {
    return totalGatos;
  }
  

  public String getPelaje() {
    return pelaje;
  }

  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
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
      maulla();
    } else {
      System.out.println(super.getNombre() + "no puede pasear hasta no estar vacunado/a");
    }
  }



  
}
