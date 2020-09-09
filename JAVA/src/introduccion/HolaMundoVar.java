
package introduccion;

import java.util.Scanner;

public class HolaMundoVar {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);        
        //Mensaje para el usuario
        System.out.println("Ingrese su nombre edad altura: ");
        //leemos el nombre
        String nom = leer.nextLine();
        //leemos la edad
        int edad = leer.nextInt();
        //leemos la altura
        double altura = leer.nextDouble();
        //Mostramos los datos por consola
        System.out.println("Nombre: "+nom+" Edad: "+edad+" Altura: "+altura);
    }
}