import java.util.ArrayList;

public class Mano {

  // Atributos
  
  private double puntuacionJugador = 0;

  private ArrayList<Carta> mano = new ArrayList<Carta>();

  // Getters

  public double getPuntuacionJugador() {
    return puntuacionJugador;
  }

  // Métodos

  public void recibirCarta(Carta carta) {

    mano.add(carta);

    puntuacionJugador += carta.getPuntos();

  }

  public void mostrarMano() {
    
    for (int i = 0; i < mano.size(); i++) {
      
      System.out.println(mano.get(i));

    }

    System.out.println("\nPuntuación del jugador: " + puntuacionJugador);
    
  }
}