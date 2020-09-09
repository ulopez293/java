
package introduccion;

import java.util.Scanner;

public class BasesInt {
    public static void main (String args[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un valor entero: ");
        int v = leer.nextInt();
        
        System.out.println("Valor ingresado: "+v);
        System.out.println("Binario = "+Integer.toBinaryString(v));
        System.out.println("octal = "+Integer.toOctalString(v));
        System.out.println("Hexadecimal = "+Integer.toHexString(v));
        
        System.out.println("Ingrese una base numerica: ");
        int b = leer.nextInt();
        
        String sBaseN = Integer.toString(v,b);
        System.out.println(v+" en base("+b+") = "+sBaseN);
        
        System.out.println("Numero extra que es 5 , en base 2:");
        int bin = 0B10_1; //se puede utilizar guion bajo o sin el
        System.out.println(bin);
    }
}
