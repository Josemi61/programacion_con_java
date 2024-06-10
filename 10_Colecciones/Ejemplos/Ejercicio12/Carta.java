public class Carta implements Comparable<Carta>{
  private static String[] p = {"Oros", "Bastos", "Espadas", "Copas"};
  private static int[] n = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

  private String palo;
  private int valor;

  public Carta(){
    this.palo = p[(int)(Math.random()*4)];
    this.valor = n[(int)(Math.random()*10)];
  }

  public String getPalo(){
    return palo;
  }

  public int getValor(){
    return valor;
  }

  @Override
  public String toString() {
    return this.valor + " de " + this.palo;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Carta other = (Carta) obj;
    if (valor != (other.valor))
      return false;
    if (!palo.equals(other.palo))
      return false;
    return true;
  }
  
  @Override
  public int compareto(Carta c) {
    if (this.palo.equals(c.getPalo())) {
      return Integer.compare(this.valor, c.getValor());
    } else {
      return c.getPalo().compareTo(this.palo);
    }
    
  }
}

