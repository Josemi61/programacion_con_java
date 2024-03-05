import java.util.ArrayList;

public class Baraja {
  
  // Atributos

  private ArrayList<Carta> cartas = new ArrayList<Carta>();
  private int cartasUsadas;

  // Métodos

  public void barajarBaraja() {

    Carta c = new Carta();

    this.cartas.add(c);

    for (int i = 0; i < 39; i++) {
      do {

        c = new Carta();

      } while (this.cartas.contains(c));

      this.cartas.add(c);
    }
  }

  public Carta repartirUnaCarta() {
    cartasUsadas++;
    return cartas.get(cartasUsadas);
  }
}