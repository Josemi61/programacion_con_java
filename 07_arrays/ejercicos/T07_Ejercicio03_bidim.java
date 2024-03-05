public class T07_Ejercicio03_bidim {
  public static void main(String[] args) {
    int[][] tabla = new int[4][5];
    int fila;
    int columna;

    int sumaFila = 0;
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d",tabla[fila][columna]);
        sumaFila = sumaFila + tabla[fila][columna];
      }
      System.out.printf("|%8d\n", sumaFila);
    }
    for (columna = 0; columna < 40; columna++) {
     System.out.println("-"); 
    }

    
  }
}
