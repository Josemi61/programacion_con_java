import java.util.Scanner;

/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 *@author Jose Miguel Toro Canillas
 */
public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contra;
    for (int i= 0; i <= 4; i++) {
      System.out.print("Escribe una contraseña de 4 digitos: ");
      contra = sc.nextInt();
      if (contra == 4567) {
        System.out.println("La caja fuerta de ha abierto satisfactoriamente");
        i = 5;
      }else{
        System.out.println("Lo siento, esa no es la combinacion");
      }
      }
    sc.close();
    }
    
  }
