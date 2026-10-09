import java.util.Scanner;
/*
 * Programa para que el usuario conozca el RFC a partir de su nombre (solo si tiene un nombre)
 * Objetivo: Entender el manejo y modificación de cadenas de caracteres (Strings)
 * @author Cervantes Fabela Edgar Leonardo
 * @version 1
 */
public class Psicologo {
  static public void main (String [] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Bienvenido, ¿cuál es su nombre?");
    String paciente = in.nextLine();

    System.out.println("¡Hola! " + paciente + '.');
    System.out.println("¿Cuál es la razón de su visita?");
    String problema = in.nextLine();

    System.out.println("MMMM... ya veo");
    System.out.println("Y digame...");
    System.out.println("¿Por qué dice que " + '"' + problema + '"' + '?');
    String razon = in.nextLine();

    System.out.println("Muy interesante!!, Hablaremos de ello con más detalle en la siguiente sesión.");

  }
}
