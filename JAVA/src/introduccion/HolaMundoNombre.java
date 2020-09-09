
package introduccion;

import java.util.Scanner;

public class HolaMundoNombre {
    public static void main (String[] args){
        // Esta clase permite leer datos por teclado
        Scanner leer = new Scanner(System.in);
        //mensaje para el usuario
        System.out.print("Ingrese su nombre");
        //leemos el nombre del usuario
        String nomb = leer.nextLine();
        //mostramos un mensaje y el valor leido
        System.out.println("Hola mundo: " + nomb);
    }
}