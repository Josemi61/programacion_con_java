public class CuentaCorriente {
  // Atributos
  private String numero = "";
  private double saldo;

  // COnstructores
  public CuentaCorriente(){
    gerenerarAleatorio();
    saldo = 0;
  }

  public CuentaCorriente(double saldoInicial) {
    gerenerarAleatorio();
    this.saldo = saldoInicial;
  }

  private void gerenerarAleatorio(){
    for (int i = 0; i < 10; i++) {
      this.numero += (int)(Math.random()*10);
    }
  }
  public void ingreso (double cantidad){
    this.saldo += cantidad;
  }

  public void cargo (double cantidad){
    this.saldo -= cantidad;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return String.format("Numero de cta: %s \tSaldo: %.2f €", numero, saldo);
  }
  public void transferencia(CuentaCorriente destino, double cantidad){
    destino.saldo +=cantidad;
    this.saldo -= cantidad;
  }

  
}