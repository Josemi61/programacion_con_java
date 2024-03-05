public class Jugador {
  
  // Atributos

  private double monedero = 0;
  private double apuesta = 0;

  private Mano mano = new Mano();

  // Constructores

  public Jugador(double monedero) {
    this.monedero = monedero;
  }

  public Jugador() {
  
  }

  // Getters
  
  public double getMonedero() {
    return monedero;
  }

  // Setter

  public void setMonedero(double monedero) {
    this.monedero = monedero;
  }

  // Métodos

  public boolean apostar(double apuesta) {
    if (apuesta <= monedero) {
      this.apuesta = apuesta;
      return true;
    }
    return false;
  }

  public void recibirCartaJugador(Carta carta) {
    mano.recibirCarta(carta);
  }

  public double puntuacionJugador() {
    return mano.getPuntuacionJugador();
  }

  public void mostrarManoJugador() {
    mano.mostrarMano();
  }
}