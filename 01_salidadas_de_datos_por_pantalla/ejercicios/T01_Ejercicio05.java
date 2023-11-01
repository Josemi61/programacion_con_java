/**
 * Horario clase 
 * 
 *@author Jose Miguel Toro Canillas
 */
import colors.ConsoleColors;
public class T01_Ejercicio05 {
  public static void main(String[] args) {
    System.out.printf(ConsoleColors.WHITE + "%-10s" + ConsoleColors.WHITE + "%-10s" + ConsoleColors.WHITE + "%-10s" + ConsoleColors.WHITE + "%-10s" + ConsoleColors.WHITE + "%s\n", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
    System.out.printf(ConsoleColors.CYAN + " %s\n", "----------------------------------------------------");
    System.out.printf(ConsoleColors.GREEN + "%-10s" + ConsoleColors.RED + "%-10s" + ConsoleColors.WHITE + "%-10s" + ConsoleColors.PURPLE + "%-10s" + ConsoleColors.RED + "%s\n", "FOl", "PRGR", "ENT", "BD", "PRGR");
    System.out.printf(ConsoleColors.GREEN + "%-10s" + ConsoleColors.RED + "%-10s" + ConsoleColors.WHITE + "%-10s" + ConsoleColors.PURPLE + "%-10s" + ConsoleColors.RED + "%s\n", "FOl", "PRGR", "ENT", "BD", "PRGR");
    System.out.printf(ConsoleColors.GREEN + "%-10s" + ConsoleColors.RED + "%-10s" + ConsoleColors.PURPLE + "%-10s" + ConsoleColors.BLUE + "%-10s" + ConsoleColors.WHITE +  "%s\n", "FOL", "PRGR", "BD", "LGM", "ENT");
    System.out.printf(ConsoleColors.YELLOW + "%-10s" + ConsoleColors.PURPLE + "%-10s" + ConsoleColors.PURPLE + "%-10s" + ConsoleColors.BLUE + "%-10s" + ConsoleColors.YELLOW +  "%s\n", "SINF", "BD", "BD", "LGM", "SINF");
    System.out.printf(ConsoleColors.YELLOW + "%-10s" + ConsoleColors.PURPLE + "%-10s" + ConsoleColors.RED + "%-10s" + ConsoleColors.RED + "%-10s" + ConsoleColors.YELLOW +  "%s\n", "SINF", "BD", "PRGR", "PRGR", "SINF");
    System.out.printf(ConsoleColors.YELLOW + "%-10s" + ConsoleColors.PURPLE + "%-10s" + ConsoleColors.RED + "%-10s" + ConsoleColors.RED + "%-10s" + ConsoleColors.YELLOW +  "%s\n" + ConsoleColors.RESET, "SINF", "BD", "PRGR", "PRGR", "SINF");
    }
}

