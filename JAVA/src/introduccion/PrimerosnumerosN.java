package introduccion;
import java.util.Scanner;

public class PrimerosnumerosN {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        // leo el valor de n
        int n = leer.nextInt();
        int i = 1;
        while(i <= n){
            // muestro el valor de i
            System.out.println(i);
            // incremento el valor de i
            i++;
        }
    }
}
