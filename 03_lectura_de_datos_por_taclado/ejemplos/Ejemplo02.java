public class Ejemplo02 {
  public static void main(String[] args) {
    String linea; // Variable que almacenara cada linea que introduzcamos por teclado
  
    System.out.print("Introduce un número entero: "); // Pedimos un numero
    linea = System.console().readLine();
  
    int num1;
    num1 = Integer.parseInt(linea); // Parsear, este metodo pasa una linea de String a numero (int)
  
    System.out.print("Introduce otro número entero: "); // Pedimos otro numero
    linea = System.console().readLine();
  
    int num2;
    num2 = Integer.parseInt(linea);
  
    System.out.printf("El primer numero es: %d\n", num1);
  
    System.out.printf("El segundo numero es: %d\n", num2);
  
    System.out.printf("La suma de los numeros es: %d\n", num1 + num2);
    //Parseamos float
    System.out.print("Introduce un numero real: ");
    linea = System.console().readLine();
    float numReal = Float.parseFloat(linea);
    System.out.printf("El numero real introducido es: %.2f\n", numReal);
    }
}

