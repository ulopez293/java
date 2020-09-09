package introduccion;

import java.util.Scanner;

public class ParoImpar2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int v = leer.nextInt();
        //obtenemos el resto de dividir v por 2
        int resto = v % 2;
        /*utilizamos un if in-line: 
        condicion ? retornoPorTrue : retornoPorFalse;
        */
        String mensaje = (resto == 0) ? "Es Par" : "Es Impar";
        //Mostrar el resultado
        System.out.println(v+" "+mensaje);
    }
}
