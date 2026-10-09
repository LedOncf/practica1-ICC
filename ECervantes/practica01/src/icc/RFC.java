import java.util.Scanner;
/*
 * Programa para que el usuario conozca el RFC a partir de su nombre (solo si tiene un nombre)
 * Objetivo: Entender el manejo y modificación de cadenas de caracteres (Strings)
 * @author Cervantes Fabela Edgar Leonardo
 * @version 1
 */
public class RFC {
  static public void main (String [] args) {
    Scanner in = new Scanner(System.in);
    String fullName = new String();
    String bornDate = new String(); 

    System.out.println("Dame el nombre completo");
    fullName = in.nextLine();
    
    System.out.println("Ingresa la fecha de nacimiento en formato dd/mm/aa");
    bornDate = in.nextLine();

    fullName = fullName.trim();
    String upperName = fullName.toUpperCase();
    
    
    char initial = upperName.charAt(0);  

    int secondName = upperName.indexOf(" ");
    upperName = upperName.substring(secondName + 1);

    String firstTwo = upperName.substring(0,2);
    
    int secInitial = upperName.indexOf(" ");
    char secondInitial = upperName.charAt(secInitial + 1);


    String year = bornDate.substring(6);

    String month = bornDate.substring(3,5);

    String day = bornDate.substring(0,2);


    System.out.println("El RFC de "+ fullName + " es: "+ firstTwo + secondInitial + initial + year + month + day);
  } 
}
