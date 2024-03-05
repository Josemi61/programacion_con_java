public class AppJuego {
  public static void main(String[] args) {

    System.out.println("Bienvenido al juego de las SIETE Y MEDIA");

    Jugador jugador = new Jugador(0);

    Jugador banca = new Jugador();

    boolean seguirJugando = true;

    System.out.print("\n¿Cuánto dinero tiene para apostar? ");

    boolean primeraVez = true;

    double monederoJugador = 0;

    while (seguirJugando) {

      double cantidadApuesta;

      if (primeraVez) {

        jugador.setMonedero(Double.parseDouble(System.console().readLine()));

        primeraVez = false;

      } else {

        jugador.setMonedero(monederoJugador);

      }

      monederoJugador = jugador.getMonedero();

      // AQUÍ EMPIEZA EL BUCLE PRINCIPAL DEL JUEGO

      while (seguirJugando) {

        Baraja espanola = new Baraja();

        espanola.barajarBaraja();

        seguirJugando = false;

        // PIDE UNA CANTIDAD DE APUESTA, SE REPITE HASTA QUE LA CANTIDAD SEA VÁLIDA

        do {

          System.out.print("\n¿Cuánta cantidad de su dinero quiere apostar? ");

          banca = new Jugador();

          jugador = new Jugador(monederoJugador);

          cantidadApuesta = Double.parseDouble(System.console().readLine());

          jugador.apostar(cantidadApuesta);

          if (!jugador.apostar(cantidadApuesta)) {

            System.out.println("\nNo puedes apostar más dinero del que tienes en el monedero");

          } else {

            seguirJugando = true;

          }

        } while (!seguirJugando);

        // REPARTE CARTAS AL JUGADOR, SE REPITE MIENTRAS QUE EL JUGADOR DECIDA SEGUIR JUGANDO O HASTA QUE EL JUGADOR NO SEA APTO PARA SEGUIR

        do {

          jugador.recibirCartaJugador(espanola.repartirUnaCarta()); // Reparte una carta al jugador

          System.out.println();

          jugador.mostrarManoJugador();                             // Muestra la mano del jugador

          // Se valora si la puntuación del jugador es adecuada para seguir jugando o no

          if (jugador.puntuacionJugador() > 7.5) {

            seguirJugando = false;

            System.out.println("\nEl jugador tiene una puntuación superior a 7,5");

            break;

          } else if (jugador.puntuacionJugador() == 7.5) {

            seguirJugando = false;

            System.out.println("\nEl jugador tiene una puntuación igual a 7,5");

            break;

          } else {

            seguirJugando = true;
            
          }

          int decision;

          do {

            System.out.println("\n-----------------------");
            System.out.println("| ¿Qué quieres hacer? |");
            System.out.println("|---------------------|");
            System.out.println("|  1. Seguir jugando  |");
            System.out.println("|    2. Plantarme     |");
            System.out.println("-----------------------");

            // Se pregunta al jugador si quiere seguir jugando

            System.out.print("\nDecisión: ");

            decision = Integer.parseInt(System.console().readLine());

            switch (decision) {
              case 1:
                seguirJugando = true;
                break;
              case 2:
                seguirJugando = false;
                System.out.println("\nPuntuación del jugador: " + jugador.puntuacionJugador());
                break;
              default:
                System.out.println("\nIntroduzca una de las opciones indicadas (1 o 2)");
                break;
            }

          } while (decision != 1 && decision != 2);

        } while (seguirJugando);

        // Se juegan las cartas de la banca siempre y cuando la puntuación del jugador sea menor a 7,5

        if (jugador.puntuacionJugador() < 7.5) {

          do {

            banca.recibirCartaJugador(espanola.repartirUnaCarta());

            // Si la puntuación de la banca es menor a 7,5 y a la vez es menor que la puntuación del jugador se continua, sino la banca para

            if (banca.puntuacionJugador() < 7.5) {

              if (banca.puntuacionJugador() <= jugador.puntuacionJugador()) {

                seguirJugando = true;

              } else {

                seguirJugando = false;
                break;

              }

            } else {

              seguirJugando = false;

            }

          } while (seguirJugando);

          System.out.println("Puntuación de la banca: " + banca.puntuacionJugador());
        }

        // Comprueba quien ha ganado, siempre que la banca tenga una cantidad menor a 7,5 se evalua la situación, sino directamente gana el jugador

        // NOTA: La banca solo tendrá una cantidad != 0 en caso de que se haya jugado con la banca, es decir; si el jugador se planta en <= de 7,5

        if (banca.puntuacionJugador() <= 7.5) {

          // Comparación de cercanía al 7,5 teniendo en cuenta que el jugador no se haya pasado

          if (Math.abs(jugador.puntuacionJugador() - 7.5) < Math.abs(banca.puntuacionJugador() - 7.5) && jugador.puntuacionJugador() <= 7.5) {

            System.out.println("\n\u001B[32mGana el jugador :)\u001B[0m");

            monederoJugador += cantidadApuesta; // Se incrementa el monedero en la cantidad apostada

            // Comprobación de que la puntuación del jugador es mayor a 7,5

          } else if (Math.abs(jugador.puntuacionJugador() - 7.5) > Math.abs(banca.puntuacionJugador() - 7.5) || jugador.puntuacionJugador() > 7.5) {

            System.out.println("\n\u001B[31mGana la banca :(\u001B[0m");

            monederoJugador -= cantidadApuesta; // Se disminuye el monedero en la cantidad apostada
            
            // Ambos, el jugador y la banca, se quedan igual de cerca del 7,5

          }

        } else {

          System.out.println("\n\u001B[32mGana el jugador :)\u001B[0m");

          monederoJugador += cantidadApuesta; // Se incrementa el monedero en la cantidad apostada

        }

        System.out.printf("\nMonedero actual: %.2f €\n", monederoJugador);

        if (monederoJugador > 0) {

          int opcion;

          do {

            System.out.println("\n-------------------------------");
            System.out.println("|     ¿Qué quieres hacer?     |");
            System.out.println("|-----------------------------|");
            System.out.println("|     1. Seguir apostando     |");
            System.out.println("| 2. Retirar mi dinero e irme |");
            System.out.println("-------------------------------");

            System.out.print("\nDecisión: ");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
              case 1:
                seguirJugando = true;
                break;
              case 2:
                System.out.printf("\nGracias por jugar, pase por caja para retirar sus %.2f €\n", monederoJugador);
                seguirJugando = false;
                break;
              default:
                System.out.println("\nIntroduzca una de las opciones indicadas (1 o 2)");
                break;
            }

          } while (opcion != 1 && opcion != 2);

          break;

        } else {

          System.out.println("\nCUANDO APUESTAS SIEMPRE PIERDES");

          seguirJugando = false;

        }
      }
    }
  }
}