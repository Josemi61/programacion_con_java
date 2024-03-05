import java.beans.IntrospectionException;

public class BuscaTesoro {
  public static void main(String[] args) {
    final int VACIA = 0;
    final int TESORO = 1;
    final int MINA = 2;
    final int JUGADA = 3;
    int fila;
    int columna;
    
    int[][] tablero = new int [4][5];

    for (int i = 0; i < tablero.length; i++){
      for (int j = 0; j < tablero.length; j++) {
        tablero[i][j] = VACIA;
      }
    }
    
    int tesoroFila = (int) (Math.random()*4);
    int tesoroColumna = (int) (Math.random()*5);
    tablero[tesoroFila][tesoroColumna] = TESORO;

    int minaFila;
    int minaColumna;

    do {
      minaFila = (int) (Math.random()*4);
      minaColumna = (int) (Math.random()*5);
    } while ((tesoroFila == minaFila) && (tesoroColumna == minaColumna));
    tablero[minaFila][minaColumna] = MINA;
    System.out.println("JUEGO DEL TESORO");

      boolean salida = false;
      do {
        for (int i = tablero.length -1; i < tablero.length; i++) {
          System.out.println(i+ " |");
          for (int j = 0; j < tablero.length; j++) {
            if (tablero[i][j] == JUGADA) {
              System.out.printf("%2s", "X");
            }else{
              System.out.printf("%2s"," ");
            }
          }
          System.out.println(); 
        }

      System.out.print("   ");

      for (int i = 0; i < (3*tablero[0].length); i++) {
        System.out.print("-");
      }
      System.out.print("\n   ");
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.printf("%2d", j);
      }
      System.out.println();

      System.out.println("introduce fila: ");
      fila = Integer.parseInt(System.console().readLine());
      System.out.println("introduce columna: ");
      columna = Integer.parseInt(System.console().readLine());
      switch (tablero[fila][columna]) {
        case VACIA:
          tablero[fila][columna] = JUGADA;
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salida = true;
        case TESORO:
          System.out.println("Has ganado.");
          salida = true;
        default:
          break;
      }
      } while (!salida);
      String c = "";
    for (int i = tablero.length - 1; i >= 0; i--) {
      System.out.print(i + " |");
      for (int j = 0; j < tablero[i].length; j++) {
        switch (tablero[i][j]) {
          case VACIA:
            c = " ";
            break;
          case MINA:
            c = "*";
            break;
          case TESORO:
            c = "$";
            break;
          case JUGADA:
            c = "X";
            break;
default:
        }
        System.out.printf("%2s", c);
      }
      System.out.println();
    }
    System.out.print("   ");
    for (int i = 0; i < (3*tablero[0].length); i++) {
      System.out.print("-");
    }
    System.out.print("\n   ");
    for (int j = 0; j < tablero[0].length; j++) {
      System.out.printf("%2d", j);
    }
    }
}