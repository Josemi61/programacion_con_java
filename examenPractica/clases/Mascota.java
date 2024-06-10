package clases;
//Duda aclaracion de esta clase abstracta
public abstract class Mascota implements MascotaInterface{
  private String chip;
  private String nombre;
  private int edad;
  private boolean vacunada;
  private static int totalMascotas;

  //Constructores
  //solo chip
  public Mascota(String chip) {
    this.chip = chip;
    totalMascotas++;
  }

  // solo nombre y chip
  public Mascota(String chip, String nombre) {
    this.chip = chip;
    this.nombre = nombre;
    totalMascotas++;
  }
  // completo

  public Mascota(String chip, String nombre, int edad, boolean vacunada) {
    this.chip = chip;
    this.nombre = nombre;
    this.edad = edad;
    this.vacunada = false;
    totalMascotas++;
  }

  //funcion pàra vacunar

  public void vacunar(){
    this.vacunada = true;
  }

  //getters
  
  public boolean estavacunado(){
    return this.vacunada;
  }

  public String getChip() {
    return chip;
  }

  public String getNombre() {
    return nombre;
  }

  public static int getTotalMascotas() {
    return totalMascotas;
  }

  public int getEdad() {
    return edad;
  }

  

  
  // setters

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setVacunada(boolean vacunada) {
    this.vacunada = vacunada;
  }



  public boolean isVacunada() {
    return vacunada;
  }

  @Override
  public String toString() {
    return "[" + chip + "]: " + nombre + ", " + edad;
  }

 


}
