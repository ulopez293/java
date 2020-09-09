
package introduccion;

import java.util.Scanner;

public class ComparaError {
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String s1 = leer.nextLine();
        System.out.println("Ingrese otra cadena: ");
        String s2 = leer.nextLine();
        
        //muestro las cadenas para verificar lo que contienen
        System.out.println("S2 = ["+s1+"]");
        System.out.println("S1 = ["+s2+"]");
        
        //esto esta mal !!!
        if (s1 == s2) {
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintas");
        }
    }
}
