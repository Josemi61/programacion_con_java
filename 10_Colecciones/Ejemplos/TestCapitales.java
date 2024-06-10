import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class TestCapitales {
  public static void main(String[] args) {
    HashMap<String, String> paisesCapitales = new HashMap<String, String>();
    paisesCapitales.put("España", "Madrid");
    paisesCapitales.put("Francia", "París");
    paisesCapitales.put("Portugal", "Lisboa");
    paisesCapitales.put("Italia", "Roma");
    paisesCapitales.put("Alemania", "Berlín");
    paisesCapitales.put("Bélgica", "Bruselas");
    paisesCapitales.put("Polonia", "Varsovia");
    paisesCapitales.put("Irlanda", "Dublín");
    paisesCapitales.put("Reino Unido", "Londres");
    paisesCapitales.put("Noruega", "Oslo");


    ArrayList<String> incorrectas = new ArrayList<String>();
    incorrectas.add("Budapest");
    incorrectas.add("Atenas");
    incorrectas.add("Praga");
    incorrectas.add("Viena");
    incorrectas.add("Zurich");
    incorrectas.add("Estocolmo");
    incorrectas.add("Ámsterdam");
    incorrectas.add("Copenhague");
    incorrectas.add("Helsinki");
    incorrectas.add("Dubrovnik");
    incorrectas.add("Moscú");
    incorrectas.add("Kiev");
    incorrectas.add("Bucarest");
    incorrectas.add("Sofía");
    incorrectas.add("Estambul");
    incorrectas.add("Berna");
    incorrectas.add("Nicosia");
    incorrectas.add("Valetta");
    incorrectas.add("Tirana");
    incorrectas.add("Pristina");


    ArrayList<String> listadoPaises = new ArrayList<String>(paisesCapitales.keySet());
    int numeroAleatorio;
    String pais;
    String respuestaCorrecta;
    int respuestaIntroducida;

    for (int i = 0; i < 10; i++) {
      numeroAleatorio = (int)(Math.random()*listadoPaises.size());
      pais = listadoPaises.get(numeroAleatorio);
      System.out.println((i*1) + ") Cual es la capital de " + pais + "?");
      respuestaCorrecta = paisesCapitales.get(pais);
      ArrayList<String> opciones = generarOpciones(respuestaCorrecta, incorrectas);
      for (int j = 0; j < opciones.size(); j++) {
        System.out.println((j+1) + opciones.get(j));
      }
      System.out.println("Respuesta: ");
      respuestaIntroducida = Integer.parseInt(System.console().readLine());
      
      if (opciones.get(respuestaIntroducida - 1).equals(respuestaCorrecta)) {
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
      }
      listadoPaises.remove(pais);

      //paisesCapitales.remove()

      incorrectas.remove(opciones)
    }
  }

  private static ArrayList<String> generarOpciones(String respuestaCorrecta, ArrayList<String> incorretas) {
    ArrayList<String> opciones = new ArrayList<String>();
    opciones.add(respuestaCorrecta);
    while (opciones.size() < 3) {
      String opcionesIncorrecta = incorretas.get((int)(Math.random()*incorretas.size()))
      if (!opciones.contains(opcionesIncorrecta)) {
        opciones.add(opcionesIncorrecta);
      }
    }
    Collection.shuffle(opciones);
    return opciones;
  }
}
