
package introduccion;
import java.util.Scanner;

public class ParoImpar {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int v = leer.nextInt();
        //Obtener el resto de la division de v entre 2
        int resto = v % 2;
        //preguntar por igual con ==
        if(resto == 0){
            System.out.println(v+" Es Par");
        }else{
            System.out.println(v+" Es Impar");
        }
        
    }
}