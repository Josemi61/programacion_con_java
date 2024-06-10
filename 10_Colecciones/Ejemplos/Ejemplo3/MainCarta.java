import java.util.ArrayList;
import java.util.Collections;

public class MainCarta {
  public static void main(String[] args) {
    final int TOTAL_CARTAS = 10;
    ArrayList<Carta> mano = new ArrayList<Carta>();
    Carta c = new Carta();
    mano.add(c);
    for (int i = 0; i < TOTAL_CARTAS; i++) {
      do {
        c = new Carta();
      } while (mano.contains(c));
      mano.add(c);
    }

    for (Carta carta : mano) {
      System.out.println(carta);
    }
    
    Collections.sort(mano);

    for (Carta carta : mano) {
     System.out.println(carta);
    }
    
  }
}

