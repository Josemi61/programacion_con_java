package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Sergio Sánchez
 */
public class Varias {

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

  
  /** 
   * Voltea un numero introducido por teclado
   * @param x
   * @return long
   */

  public static long voltea(long x){
    long nunmeroVolteado = 0;
    if (x < 0) {
       return voltea(-x); 
    }
    while (x > 0) {
      nunmeroVolteado = (nunmeroVolteado * 10) + (x % 10);
      x /= 10;
    }
    return nunmeroVolteado;
  }

  public static int voltea(int x){
    System.out.println("Esta es la funcion que devuelve un int");
    return (int) voltea((long) x);
  }

  public static boolean esCapicua(long x){
    return x == voltea(x);
  }
  public static boolean esCapicua(int x){
    return esCapicua((long) x);
  }
}