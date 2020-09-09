
package introduccion;

import java.util.Scanner;

public class PrimerosnumerosN2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= n);
    }
}
