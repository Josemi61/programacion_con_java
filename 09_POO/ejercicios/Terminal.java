public class Terminal {
  private String numero;
  private int tiempoConversacion;
  

  //Contructores
  public Terminal(String numero) {
      this.numero = numero;
  }

  //Getters

  public String getNumero() {
    return numero;
  }


  public int getTiempoCOnversacion() {
    return tiempoConversacion;
  }


  //Setters

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void setTiempoCOnversacion(int tiempoConversacion) {
    this.tiempoConversacion = tiempoConversacion;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " - " + tiempoConversacion + "s de conversacion";
  }
    
  public void llama(Terminal t, int tiempoConversacion){
    this.tiempoConversacion += tiempoConversacion;
    t.tiempoConversacion += tiempoConversacion;
  }
  
}
