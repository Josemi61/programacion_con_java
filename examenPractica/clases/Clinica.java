package clases;

  

public class Clinica {
  
  

  private int listado = 100;
  Mascota[] mascotas = new  Mascota[listado];

  public boolean esVacia() {
    boolean resultado = true;
    for (Mascota mascota : mascotas) {
      if (mascota != null) {
        resultado = false;
        break;
      }
    }return resultado;
  }

  public boolean esLlena() {
    boolean resultado = true;
    for (Mascota mascota : mascotas) {
      if (mascota == null) {
        resultado = false;
        break;
      }
    }return resultado;
  }

  public int totalPerros(){
    return Perro.getTotalPerros();
  }
  public int totalGatos() {
    return Gato.getTotalGatos();
  }
  public int totalMascotas() {
    return Mascota.getTotalMascotas();
  }

  public Mascota buscarChip(String chip) {
    for (int i = 0; i < listado; i++) {
      if (mascotas[i].getChip().equals(chip)) {
        return mascotas[i];
      }
    }
    return null;
  }

  public void agregar(Mascota mascota){
    if (!esLlena()) {
      mascotas[totalMascotas() + 1] = mascota;
    }else {
      System.out.println("La clinica esta llena.");
    }
  }

  public void listar() {
    for (Mascota mascota : mascotas) {
        if (mascota != null) {
            System.out.println(mascota);
        }
    }
}


}
