
package introduccion;

import java.util.Scanner;

public class Array {
    public static void main (String[] args) {
        //definimos un array de 10 enteros
        int array[] = new int[10];
        //el scanner para leer por teclado
        Scanner leer = new Scanner(System.in);
        //leo el primer valor
        System.out.println("Ingrese un valor (0 =>fin): ");
        int v = leer.nextInt();
        int i=0;
        //mientras v sea distinto de cero AND i sea menor que 10
        while (v!=0 && i < 10){
            //asignar v en array[i] y luego incrementa el valor de i
            array[i++] = v;
            //leo el siguiente valor 
            System.out.println("Ingrese un valor (0 =>fin): ");
            v = leer.nextInt();
        }
        // recorrer el arreglo o array mostrando su contenido
        for(int j=0; j<i; j++){
            System.out.println(array[j]);
        }
    }
    
}
