public class PruebaGato {
  public static void main(String[] args) {
    Gato garfield = new Gato();
    garfield.sexo = "macho";
    Gato kitty = new Gato();
    kitty.sexo = "hembra";
    garfield.come("Carne");
    garfield.maulla();
    garfield.ronronea();
    garfield.peleaCon(kitty);
  }
}
