public class Carta {

  // Atributos
  
  private static String[] palos = {"Oros", "Espadas", "Copas", "Bastos"};
  private static String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

  private String palo;
  private String valor;
  private double puntos;

  // Constructor

  public Carta () {

    double numero = (int)(Math.random()*10);

    this.valor = numeros[(int)(numero)];

    this.palo = palos[(int)(Math.random()*4)];

    switch (valor) {
      case "1", "2", "3", "4", "5", "6", "7":
        this.puntos = numero + 1;
        break;
      case "Sota", "Caballo", "Rey":
        this.puntos = 0.5;
        break;
      default:
        this.puntos = 0;
        break;
    }

  }

  // Getters

  public String getNumero() {
    return valor;
  }

  public String getPalo() {
    return palo;
  }

  public double getPuntos() {
    return puntos;
  }

  // toString

  @Override
  public String toString() {
    switch (this.getPalo()) {
      case "Oros":
          return "\u001B[33m" + this.getNumero() + " de " + this.getPalo() + "\u001B[0m : " + this.getPuntos(); // Amarillo
      case "Espadas":
          return "\u001B[34m" + this.getNumero() + " de " + this.getPalo() + "\u001B[0m : " + this.getPuntos(); // Azul
      case "Bastos":
          return "\u001B[32m" + this.getNumero() + " de " + this.getPalo() + "\u001B[0m : " + this.getPuntos(); // Verde
      case "Copas":
          return "\u001B[31m" + this.getNumero() + " de " + this.getPalo() + "\u001B[0m : " + this.getPuntos(); // Rojo
      default:
          return this.getNumero() + " de " + this.getPalo() + ": " + this.getPuntos();
    }
  }

  // equals

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
      Carta other = (Carta) obj;
    if (palo == null) {
      if (other.palo != null)
        return false;
    } else if (!palo.equals(other.palo))
      return false;
    if (valor == null) {
      if (other.valor != null)
        return false;
    } else if (!valor.equals(other.valor))
      return false;
    return true;
  }
}